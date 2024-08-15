/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author adria
 */
public class Conexion {
    
    protected Connection con = null;
    private static Conexion instancia;
    public static double Total = 0;
    public static double TotalPendiente = 0;
    private int numeroDeTicket;
    private double pago, devuelto;
    private final HashMap<String, Integer> map = new HashMap<>();
    private final HashMap<String ,Double> mapPrecios = new HashMap<>();
    
    
    protected Conexion() {
        String url ="jdbc:sqlserver://localhost:4022;databaseName=BAR;encrypt=false;trustServerCertificate=false;user=root;password=cr7siu1001!;";
         
        try{ 
            con = DriverManager.getConnection(url);
            Dictionay();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void obtenerElNumeroDeTicket(){
        try(Statement stmt = con.createStatement()){
            try(ResultSet set = stmt.executeQuery("SELECT SCOPE_IDENTITY() as 'i'")){
                while(set.next()){
                    numeroDeTicket = Integer.parseInt(set.getString("i"));
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static Conexion Instancia(){
        if (instancia == null)
        {
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public String ObtenerValoresDeBoton(int id){
        String inf ="";
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        double price = 0;
        try(Statement stmt = con.createStatement()){
            try(ResultSet rs = stmt.executeQuery("SELECT nombre, precio FROM PRODUCTOS WHERE idProducto = " + String.valueOf(id))){
                
                while(rs.next()){
                    inf = rs.getString("nombre") + " " + rs.getString("precio");
                    String p = rs.getString("precio");
                    price = Double.parseDouble(p);
                    Total += price;
                } 
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return inf;
    }
    
    public boolean IniciarSesion(Object[] info){
        try{
            String user = "";
            char[] pass = null;
            if(info != null){
                user = (String) info[0];
                pass = (char[]) info[1];
            }else return false;
            
            try(Statement stmt = con.createStatement()){
                try(ResultSet rs = stmt.executeQuery("SELECT permisos FROM users WHERE userN='"+user+"' AND pass = '" + new String(pass) + "'")){
                    while(rs.next()){
                        String s = rs.getString("permisos");
                        if(s.equals("SI")) return true;
                        
                    }
                    return false;
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTOS", "Error.", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        catch(ClassCastException e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public HashMap<String, Integer> LlenarContenedor(){
        HashMap<String, Integer> e = new HashMap<>();
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet rs = stmt.executeQuery("SELECT NOMBRE AS NOMBRES FROM COCTELES")){
                while(rs.next()){
                    e.put(rs.getString("NOMBRE"), 0);
                }
            }
        }
        catch(Exception s){
            JOptionPane.showMessageDialog(null, s.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
        }
        return e;
    }
    
    public void AgregarVenta(double total, double vuelto, double pago){
        String query = "INSERT INTO VENTA(total, fecha) VALUES(%s, GETDATE())".formatted(total);
        
        try(Statement stmt = con.createStatement()){
            if(stmt.executeUpdate(query) > 0){
                obtenerElNumeroDeTicket();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        this.devuelto = vuelto;
        this.pago = pago;
    }
    
    public void CrearDetalle(){
        Controlador.Ticket tk = Controlador.Ticket.ObtenerInstancia();
        
        for(var s : tk.ModificarCont(Vista.Main.ContenidoDeTicket)){
            System.out.println(s);
            CalcularCantidad(s);
        }
    }

    private void CalcularCantidad(String producto){
        double precio;
        int cantidad;
        String nombre;
        
        String[] array = producto.split(" ");
        cantidad = getNumericValue(array[0]);
        nombre = array[1];
        precio = mapPrecios.get(nombre);
        double total = precio*cantidad;
        //insert into VENTA_DETALLE(idVenta, idProducto, cantidad, precio, total)

        String queryDefinitivo;
        queryDefinitivo = """
                          INSERT INTO DETALLE_VENTA(idVenta, idProducto, cantidad, precio, total, pago, Devuelto, Estado, Nota)
                          VALUES(%s, %s, %s, %s, %s, %s, %s, 'CANCELADA', '')
                          """.formatted(numeroDeTicket, map.get(nombre), cantidad, precio, total, this.pago, this.devuelto);
        
        
        try(Statement stmt = con.createStatement()){
            stmt.executeUpdate(queryDefinitivo);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, queryDefinitivo, "NULL", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private int getNumericValue(String num){
        String ans ="";
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i) != ')' && num.charAt(i) != '('){
                ans += num.charAt(i);
            }
        }
        return Integer.parseInt(ans);
    }
    
    private void Dictionay(){
        try(Statement stmt = con.createStatement()){
            try(ResultSet rs = stmt.executeQuery("select P.nombre, P.idProducto, P.precio from PRODUCTOS P")){
                while(rs.next()){
                    double precio = Double.parseDouble(rs.getString("precio"));
                    int id = Integer.parseInt(rs.getString("idProducto"));
                    map.put(rs.getString("nombre"), id);
                    mapPrecios.put(rs.getString("nombre"), precio);
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "NULL", JOptionPane.WARNING_MESSAGE);
        }
    }

    public List<String> getOrder(int idOrd){
        List<String> ordCancelada = new ArrayList<>();
        List<String> detalleOrd = new ArrayList<>();
        
        detalleOrd.add("-------------------------------------------------");
        detalleOrd.add("Nombre           Precio   ");
        ordCancelada.add("********VIKINGOS***********\n\n\n");
        String query;
        query = """
                select P.nombre, D.cantidad, P.precio, D.total from PRODUCTOS P
                join DETALLE_VENTA D on P.idProducto = D.idProducto
                where D.idVenta = 
                """;
        
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet st = stmt.executeQuery(query + String.valueOf(idOrd))){
                while(st.next()){
                    int cantidad = Integer.parseInt(st.getString("cantidad"));
                    while(cantidad > 0){
                        detalleOrd.add(st.getString("nombre") + " " + st.getString("precio") + "\n");
                        cantidad--;
                    }
                }
            }
            detalleOrd.add("\n-------------------------------------------------\n");
            
            
            String query2;
            query2 = """
                     SELECT V.idVenta, V.Fecha, V.Total, D.Pago, D.Devuelto FROM VENTA V
                     JOIN DETALLE_VENTA D ON D.IDVENTA = V.IDVENTA
                     WHERE V.IDVENTA = %s
                     """.formatted(idOrd);
            try(Statement stmt2 = con.createStatement()){
                try(ResultSet st = stmt2.executeQuery(query2)){
                    if(st.next()){
                        ordCancelada.add("Fecha: " + st.getString("fecha") + "\n");
                        ordCancelada.add("Ticket: " + st.getString("idVenta") + "\n");
                        ordCancelada.add("\n\n");
                        
                        for(var s : detalleOrd){
                            ordCancelada.add(s);
                        }
                        
                        ordCancelada.add("Total: " + st.getString("Total"));
                        ordCancelada.add("Pago: " + st.getString("pago"));
                        ordCancelada.add("Devuelto: " + st.getString("devuelto"));
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No existe orden con numero de ticket: " + idOrd, "Error", JOptionPane.WARNING_MESSAGE);
                        return new ArrayList<>();
                    }
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return ordCancelada;
    }
    
    
    public void AnularOrden(int idOrd, String nota){
        String query;
        query = """
                Update VENTA
                SET estado = 'ANULADA'
                WHERE idVenta = 
                """;
        String query2;
        query2 = "Update VENTA SET nota = '" + nota + "' Where idVenta = " + idOrd;

        
        try(Statement stmt = con.createStatement()){
            stmt.executeUpdate(query + idOrd);
            stmt.executeUpdate(query2);
            JOptionPane.showMessageDialog(null, "La orden a sido anulada", "", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
             e.printStackTrace();
        }
    }
}
