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
    
    
    private Conexion(){
        String url = "jdbc:sqlserver://localhost:4022;databaseName=BAR;encrypt=true;trustServerCertificate=true";
        String user = "root"; //user
        String password= "cr7siu1001!"; //wtf1
        
        try {
            con = DriverManager.getConnection(url,user,password);
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
    
    public void Query(){
        try(Statement stmt = con.createStatement()){
            try(ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCTOS")){
                
                while(rs.next()){
                    
                    String num1 = rs.getString("ID");
                    String num2 = rs.getString("NOMBRE");
                    
                    JOptionPane.showMessageDialog(null, num1 +  " | " + num2);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
        }
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
                    
                    //Total += price;
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
                    
                    //Total += price;
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
}
