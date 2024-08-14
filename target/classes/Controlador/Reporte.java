/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian.rodriguez
 */
public class Reporte extends Conexion {
    
    private String fechaInicio;
    private String fechaFinal;
    
    public Reporte(String FechaInico, String FechaFinal){
        super();
        this.fechaFinal = FechaFinal;
        this.fechaInicio = FechaInico;
    }
    
    public List<String> DetalleReporte(){
        List<String> DetalleDeCategorias = new ArrayList<>();
        String query;
        query="""
              SELECT C.nombreCategoria, SUM(D.total) AS 'TOTAL'
              FROM DETALLE_VENTA D
              JOIN PRODUCTOS P ON P.idProducto = D.idProducto
              JOIN CATEGORIA C ON P.idCategoria = C.idCategoria
              GROUP BY C.nombreCategoria
              """;
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet set = stmt.executeQuery(query)){
                if(set.next()){
                    do{
                        DetalleDeCategorias.add("%s: $%s".formatted(set.getString("nombreCategoria"), set.getString("TOTAL")));
                    }while(set.next());
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
       
        return DetalleDeCategorias;
    }
    
    public String VentasTotales(){
        String query;
        query = """
                SELECT COUNT(idVenta) AS i FROM VENTA
                WHERE Fecha BETWEEN '%s' and '%s'
                """.formatted(fechaInicio, fechaFinal);
    
        try(Statement stmt = con.createStatement()){
            try(ResultSet st = stmt.executeQuery(query)){
                if(st.next()){
                    return st.getString("i");
                }
            }
        }
        catch(SQLException e){
            e.fillInStackTrace();
        }
        return "0";
    }
    
    public String TotalAnulaciones(){
        String query;
        query = """
                select count(V.idVenta) as 'i' from venta V
                JOIN DETALLE_VENTA D
                ON D.idVenta = V.idVenta
                where V.Fecha between '%s' and '%s' and D.estado = 'ANULADA'
                """.formatted(fechaInicio, fechaFinal);
    
        try(Statement stmt = con.createStatement()){
            try(ResultSet st = stmt.executeQuery(query)){
                if(!st.next()){
                    return "0";
                }
                else st.getString("i");
            }
        }
        catch(SQLException e){
            e.fillInStackTrace();
        }
        return "0";
    }
    
    public double PromedioDeTicket(){
        String query;
        double sum= 0, count = 0;
        query = """
                SELECT SUM(Total) / (
                    SELECT COUNT(DISTINCT V.idVenta) FROM VENTA V
                    JOIN DETALLE_VENTA D 
                    ON D.idVenta = V.idVenta
                    WHERE V.Fecha between '%s' and '%s' and D.Estado = 'CANCELADA'
                ) AS 'PROM'
                FROM VENTA
                """.formatted(fechaInicio, fechaFinal);
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet set = stmt.executeQuery(query)){
                if(set.next()){
                    return Double.parseDouble(set.getString("PROM"));
                }else return 0;
            }
        }
        catch(SQLException e){
            e.fillInStackTrace();
        }
        
        return 0;
    }
    
    public double TOTAL(){
        double sum = 0;
        String query;
        query = """
                SELECT SUM(TOTAL) AS 'SUM' FROM VENTA
                """.formatted(fechaInicio, fechaFinal);
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet set = stmt.executeQuery(query)){
                if(set.next()){
                    sum = Double.parseDouble(set.getString("SUM"));
                }else {
                    return 0.0;
                }
            }
        }
        catch(SQLException e){
            e.fillInStackTrace();
        }
        
        return sum;
    }
    
    public String TotalDevuelto(){
        double sum = 0;
        String query;
        query = """
                select sum(v.Total) as 'sum' from VENTA V
                JOIN DETALLE_VENTA D ON D.idVenta = V.idVenta
                where V.Fecha between '%s' and '%s' and D.estado = 'ANULADA'
                """.formatted(fechaInicio, fechaFinal);
        
        try(Statement stmt = con.createStatement()){
            try(ResultSet set = stmt.executeQuery(query)){
                if(!set.next()){
                    return"0";
                }
                else {
                    try{
                        return set.getString("sum");
                    }
                    catch(IllegalArgumentException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        sum = 0;
                    }
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return "0";
    }
}
