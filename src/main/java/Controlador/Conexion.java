/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import java.util.HashMap;
import Controlador.Dir;
import java.awt.HeadlessException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
/**
 *
 * @author adria
 */
public class Conexion {
    
    private Connection con = null;
    private static Conexion instancia;
    public static double Total = 0;
    public static double TotalPendiente = 0;
    private int numeroDeTicket;
    private final HashMap<String, Integer> map = new HashMap<>();
    private final HashMap<String ,Double> mapPrecios = new HashMap<>();
    
    
    private Conexion(){
        String url = "jdbc:sqlserver://localhost:4022;databaseName=BAR;encrypt=true;trustServerCertificate=true;";
        String user = "root"; 
        String password= "cr7siu1001!";

        try {
            con = DriverManager.getConnection(url, user, password);
            Dictionay();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, e.getMessage());
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
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
        }
        
        return inf;
    }
    
    public boolean IniciarSesion(Object[] info){
        try{
            String user = (String) info[0];
            char[] pass = (char[]) info[1];
        
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
    
    public void AgregarVenta(double total, double vuelto){
        String query = "INSERT INTO VENTA (fecha, devuelto, totalVenta) values('"+ ObtenerFechaYHora()+ "' ,"+ vuelto + ", "+ total +")";
        try(Statement stmt = con.createStatement()){
            stmt.executeUpdate(query);
            obtenerElNumeroDeTicket();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "null", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void CrearDetalle(){
        Controlador.Ticket tk = Controlador.Ticket.ObtenerInstancia();
        
        for(var s : tk.ModificarCont(Vista.Main.ContenidoDeTicket)){
            System.out.println(s);
            CalcularCantidad(s);
        }
    }

    private void CalcularCantidad(String producto){
        int cantidad = Character.getNumericValue(producto.charAt(1));
        double precio;
        String nombre;
        String[] array = producto.split(" ");
        nombre = array[1];
        precio = mapPrecios.get(nombre);
        double total = precio*cantidad;
        //insert into VENTA_DETALLE(idVenta, idProducto, cantidad, precio, total)

        String queryDefinitivo = "insert into VENTA_DETALLE(idVenta, idProducto, cantidad, precio, total, ticket)" + " values (" + numeroDeTicket + "," + map.get(nombre) + "," + cantidad + "," + precio + "," + total + ", " + numeroDeTicket + ")";
    
        try(Statement stmt = con.createStatement()){
            stmt.executeUpdate(queryDefinitivo);
            JOptionPane.showMessageDialog(null, "Orden registrada correctamente!", "NULL", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, queryDefinitivo, "NULL", JOptionPane.WARNING_MESSAGE);
        }
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
    
    private String ObtenerFechaYHora(){

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        
        return dateTime.format(formatters);
    }
    
    
    public List<String> getOrder(int idOrd){
        List<String> ordCancelada = new ArrayList<>();
        List<String> detalleOrd = new ArrayList<>();
        ordCancelada.add("********VIKINGOS***********\n\n\n");

        String query;
        query = """
                select P.nombre, D.cantidad, P.precio, D.total from PRODUCTOS P
                join venta_detalle D on P.idProducto = D.idProducto
                where D.idVenta = 
                """;
        
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet st = stmt.executeQuery(query + String.valueOf(idOrd))){
                while(st.next()){

                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "NULL", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }
}
