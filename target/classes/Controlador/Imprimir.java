package Controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.FileNameMap;
import javax.print.PrintException;


public class Imprimir{
    private String FileName;
    
    public Imprimir(String fileName){
        this.FileName = fileName;
        print();
    }
    
    private void print(){
        try{
            Dir.file = new File(Dir.PathGuardarOrdenes + FileName);
            Desktop.getDesktop().print(Dir.file);
        }
        catch(IOException e){
            
        }
        
    }
    
    
}