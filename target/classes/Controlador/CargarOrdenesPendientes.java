/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian.rodriguez
 */
public class CargarOrdenesPendientes {
    
    private int total;
    
    public CargarOrdenesPendientes(){
        
    }
    
    public void abrirCarpetaa(){
        String path = "C://Users//adrian.rodriguez//Sistema-Java//OrdenesPendientes";
        File file = new File(path);
        
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File s : files){
                
            }
        }
        
    }
}
