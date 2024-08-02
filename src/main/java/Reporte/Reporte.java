/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporte;

import Controlador.Dir;
import static Controlador.Dir.file;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.chrono.ThaiBuddhistEra;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian.rodriguez
 */
public class Reporte {
    private static final List<String> ContenidoDeReporte = new ArrayList<>();
    public static double fondo = 0;
    public static double totalPagosEnEfectivo = 0;
    public static double totalPagosEnTarjeta = 0;
    public static double totalVenta = 0;
    public static int totalOrdenesDelDia = 0;
    private static String doc = ObtenerFechaYHora();
    private static File reporte;
    public static boolean DiaIniciado = false;
    
    public static void getFondo(){
        try{
            String get = JOptionPane.showInputDialog(null, "Ingresar Fondo: ", "Init", JOptionPane.WARNING_MESSAGE); 
            if(get.isEmpty()){
                JOptionPane.showMessageDialog(null, "NULL", "NULL", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            fondo = Double.parseDouble(get);
            if(fondo < 0 || fondo == 0){
                JOptionPane.showMessageDialog(null, "NULL", "NULL", JOptionPane.WARNING_MESSAGE);
            }
            totalVenta += fondo;
        }
        catch(Exception e){
            
        }
    }    
    
    public static void IniciarDia(){
        reporte = new File(Dir.PathCarpetaReportes + doc + ".txt");
        
        if(Dir.CrearCarpetaDelDia(doc)){
            
            if(!reporte.exists()){
                try{
                    DiaIniciado = true;
                    reporte.createNewFile();
                    JOptionPane.showMessageDialog(null, "Archivo generador correctamente!", "NULL", JOptionPane.INFORMATION_MESSAGE);
                    getFondo();
                    
                    ContenidoDeReporte.add("******VIKINGOS*******\n\n\n");
                    ContenidoDeReporte.add("FONDO INICIAL: " + fondo+ "\n" );
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    

    public static void FinalizarDia(){
        try{
            if(DiaIniciado) reporte = new File(Dir.PathCarpetaReportes + doc + ".txt");
            if(reporte.exists()){
                try{
                    try (BufferedWriter br = new BufferedWriter(new FileWriter(reporte))) {
                        ContenidoDeReporte.add("Total de Ordenes registradas: "+totalOrdenesDelDia + "\n");
                        ContenidoDeReporte.add("Venta total en el dia: " + totalVenta+ "\n");
                        ContenidoDeReporte.add("Ventas en tarjeta: " + totalPagosEnTarjeta+ "\n");
                        ContenidoDeReporte.add("\n\n\n");
                        ContenidoDeReporte.add("FINALIZADO");
                        
                        for(var s : ContenidoDeReporte){
                            br.append(s);
                        }
                    }
                    DiaIniciado = false;
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR: DIA NO INICIADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "ERROR: DIA NO INICIADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Genera El reporte al final del dia
    public static void crearReporte(File r) throws IOException{
        
        if(!r.exists()){
            //Do something
        }
    }
    
    private static String ObtenerFechaYHora(){

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        
        return dateTime.format(formatters);
    }
    
    public static void AjustarAccionDePago(){
        totalVenta += Controlador.Conexion.Total;
    }
    
    public static void AjustarAccionDevuelto(double dev){
        totalVenta -= dev;
    }
    
    public static boolean VerificarSiElDiaSeInicio(){
        File verify = new File(Dir.PathCarpetaReportes + doc + ".txt");

        if(verify.exists()){  
            try{
                String line;
                BufferedReader reader = new BufferedReader(new FileReader(verify));
                while(reader.ready()){
                    line = reader.readLine();
                    if(line.contains("FINALIZADO")){
                        DiaIniciado = false;
                        return false;
                    }
                }    
                DiaIniciado = true;
                Dir.CrearCarpetaDelDia(doc);
                return true;
            }
            catch(IOException e){
                return false;
            }
        }
        return false;
    }
}
