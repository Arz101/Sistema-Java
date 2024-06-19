/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.GuardarOrden.NumeroSerie.generateSerialNumber;
import Modelo.Conexion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
/*
 * @author adria
*/
public class GuardarOrden{
    private Conexion sql = Conexion.Instancia();
    protected List<String> ticket;
    
    public GuardarOrden(List<String> ticket){
        this.ticket = ticket;
    }
    
    public void GuardarOrden() throws IOException{
        BufferedWriter bf;
        String NumeroSerie = generateSerialNumber();
        String path = "C:/Users//adria//Documentos//NetBeansProjects//Sistema//Ord//"+NumeroSerie+ ".txt";
        File archivo = new File(path);        
        
        if(!archivo.exists()){
            bf = new BufferedWriter(new FileWriter(archivo));
            
            bf.write("\n\n*******************VIKINGOS*********************\n\n\n\n");
            bf.write("*  Numero de serie: " + NumeroSerie);
            bf.write("\n"+ObtenerFechaYHora());
            bf.write("\n\n\n\n");
            
            for(String s : ticket){
                bf.write("* " + s + "\n");
            }
            bf.close();
        }
        sql.GuardarOrdenes(NumeroSerie);
    }
    
    protected String ObtenerFechaYHora(){
        
        Calendar cal = Calendar.getInstance();
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        Date fechaActual = new Date();
        
        return String.valueOf(fechaActual + "\n" + String.valueOf( hora + " : " + min));
    }
    
    public class NumeroSerie {

        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int SERIAL_LENGTH = 12; // Longitud del número de serie
        private static final Random RANDOM = new SecureRandom();

        public static String generateSerialNumber() {
            StringBuilder serialNumber = new StringBuilder(SERIAL_LENGTH);
            for (int i = 0; i < SERIAL_LENGTH; i++) {
                    int index = RANDOM.nextInt(CHARACTERS.length());
                    serialNumber.append(CHARACTERS.charAt(index));
                }
            return serialNumber.toString();
        }
    }
}
