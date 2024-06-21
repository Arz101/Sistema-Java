/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
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
/**
 *
 * @author adria
 */
public class Conexion {
    
    private Connection con = null;
    private static Conexion instancia;
    public static double Total = 0;
    public static double TotalPendiente = 0;
    public static HashMap<String, Double> map = new HashMap<String, Double>();
    
    
    private Conexion(){
        String url = "jdbc:sqlserver://localhost:4022;databaseName=BAR;encrypt=true;trustServerCertificate=true";
        String user = "root"; //user
        String password= "cr7siu1001!"; //wtf1
        
        try {
            con = DriverManager.getConnection(url,user,password);
            Dictionary();
            //JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos SQL Server", "Info.", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
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
            try(ResultSet rs = stmt.executeQuery("SELECT * FROM COCTELES WHERE ID_COCTELES = " + String.valueOf(id))){
                
                while(rs.next()){
                    inf = rs.getString("NOMBRE") + " " + rs.getString("PRECIO");
                    String p = rs.getString("PRECIO");
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

    public String ObtenerValoresDeBoton(int id, String tabla, String campo){
        String inf ="";
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        double price = 0;
        try(Statement stmt = con.createStatement()){
            try(ResultSet rs = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE " + campo + " = " + String.valueOf(id))){
                
                while(rs.next()){
                    inf = rs.getString("NOMBRE") + " " + rs.getString("PRECIO");
                    String p = rs.getString("PRECIO");
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
    
    public void GuardarOrdenes(String id){
        //String path .....
        String path = "C://Users//adrian.rodriguez//Sistema-Java//Ord//" + id + ".txt";
        
        try(PreparedStatement pstmt = con.prepareStatement("INSERT INTO ORDENES (ID, FILECONTENT) VALUES(?, ?)")){
            File file = new File(path);
            String fileName = file.getName();
            byte[] fileContent = Files.readAllBytes(Paths.get(path));
            
            pstmt.setString(1, id);
            pstmt.setBytes(2, fileContent);

            pstmt.executeUpdate();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Dictionary(){
        String sql = "SELECT C.NOMBRE, C.PRECIO\n" +
        "FROM COCTELES C\n" +
        "UNION ALL\n" +
        "SELECT B.NOMBRE, B.PRECIO\n" +
        "FROM BOTELLAS B\n" +
        "UNION ALL\n" +
        "SELECT S.NOMBRE, S.PRECIO\n" +
        "FROM CERVEZAS S\n" +
        "UNION ALL\n" +
        "SELECT E.NOMBRE, E.PRECIO\n" +
        "FROM ENTRADAS E\n" +
        "UNION ALL \n" +
        "SELECT P.NOMBRE, P.PRECIO\n" +
        "FROM PLATOS P";
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet st = stmt.executeQuery(sql)){
                while(st.next()){
                    double precio = Double.parseDouble(st.getString("PRECIO"));
                    map.put(st.getString("NOMBRE"), precio);
                }
            }
        }
        catch(Exception e){
            
        }
    }
}
