/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
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
        String url = "jdbc:sqlserver://localhost:1433;databaseName=BAR;encrypt=true;trustServerCertificate=true";
        String user = "user";
        String password= "wtf";
        
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
        try(Statement stmt = con.createStatement()){
            try(ResultSet rs = stmt.executeQuery("SELECT * FROM BEBIDAS WHERE ID_BEBIDA = " + String.valueOf(id))){
                
                while(rs.next()){
                    inf += rs.getString("NOMBRE_BEBIDA") + " " + rs.getString("COSTO_BEBIDA");
                    Total += Double.parseDouble(rs.getString("COSTO_BEBIDA"));
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
            try(ResultSet rs = stmt.executeQuery("SELECT NOMBRE_BEBIDA AS NOMBRES FROM BEBIDAS UNION SELECT NOMBRE_PLATOS FROM PLATOS")){
                while(rs.next()){
                    e.put(rs.getString("NOMBRES"), 0);
                }
            }
        }
        catch(Exception s){
            JOptionPane.showMessageDialog(null, s.getMessage(), "Error.", JOptionPane.ERROR_MESSAGE);
        }
        return e;
    }
}
