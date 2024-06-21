/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
package Controlador;
import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import j
    private String file = "";
    public static boolean confirmador = false;
    private Date fechaActual;
            
    public CrearOrden(List<String> avax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import java.util.List;
/**
 *
 * @author adria

public class CrearOrden {
    
    private String nameOrd = "ord#"; 
    public static int numOrd = 1;
    private String txt = ".txt";list){
        PrinterMatrix print = new PrinterMatrix();
        file = nameOrd + numOrd + txt;
        numOrd+=1;
        Extenso e = new Extenso();
        
        e.setNumber(101.85);
        
        print.setOutSize(20, 42);
        
        print.printCharAtCol(1, 1, 42, "=");
        print.printTextWrap(1, 2, 14, 32, "VIKINGOS");
        print.printTextWrap(2, 2, 14, 42, ObtenerFechaYHora());
        
        
        int index=2;
        
        for(String inf : list){
            print.printTextWrap(index, index+1, 1, 32, inf + "\n");
            System.out.println(inf);
            index++;
        }
        
        print.toFile("C://Users//adria//Documentos//NetBeansProjects//Sistema//Ord//" + file);
       
        
        FileInputStream inputStream=null;
        
        try{
            inputStream = new FileInputStream("C://Users//adria//Documentos//NetBeansProjects//Sistema//Ord//" + file);
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        
        if(inputStream == null){
            return;
        }
        
        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat,null);
        
        PrintRequestAttributeSet att = new HashPrintRequestAttributeSet();
        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
        
        if(defaultPrintService != null){
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try{
                printJob.print(document, att);
                confirmador = true;
            } catch(Exception i){
                i.printStackTrace();
            }
        }
        else{
            confirmador = false;
            System.err.println("No hay una impresora instalada");
        }
    }
    
    public void NuevaOrden(){
        System.out.println(file);
    }
    
    private String ObtenerFechaYHora(){
        Calendar cal = Calendar.getInstance();
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        fechaActual = new Date();
        
        return String.valueOf(fechaActual + "\n" + String.valueOf( hora + " : " + min));
    }
    
    public class Aux{
        public Aux(){
        }
        
        public void Extenso(){
            
        }
    }
}
*/
