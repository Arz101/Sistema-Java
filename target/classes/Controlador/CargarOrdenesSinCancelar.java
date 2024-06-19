/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class CargarOrdenesSinCancelar extends GuardarOrden{

    private int NumeroMesa;
    private List<File> mesas;
    
    public CargarOrdenesSinCancelar(List<String> ticket, int numeroMesa) {
        super(ticket);
        this.NumeroMesa = numeroMesa;
        mesas = new ArrayList<>();
    }

    @Override
    public void GuardarOrden() throws IOException{
        BufferedWriter bf;
        String numeroS = NumeroSerie.generateSerialNumber();
        String path = "C:/Users//adria//Documentos//NetBeansProjects//Sistema//OrdenesPendientes//" +NumeroMesa+ ".txt";
        File archivo = new File(path);

        if(!archivo.exists()){
            bf = new BufferedWriter(new FileWriter(archivo));
            
            bf.write("\n\n*******************VIKINGOS*********************\n\n\n\n");
            bf.write("*  Numero de serie: " + numeroS);
            bf.write("\n"+ObtenerFechaYHora());
            bf.write("\n\n\n\n");
            
            for(String s : ticket){
                bf.write("* " + s + "\n");
            }
            
            bf.close();
        }
        
    }
    
    public void abrirOrden(){
        String path = "C:/Users//adria//Documentos//NetBeansProjects//Sistema//OrdenesPendientes";
        File carpeta = new File(path);
        
        if(carpeta.isDirectory()){
            File[] file = carpeta.listFiles();
            
            for(File s : file){
            }
        }
    }
    
}
