/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
/**
 *
 * @author adria
 */
public class Control {
    private static List<JFrame> registroFrames = new ArrayList<>();
    private static JFrame mainFrame;
    private static JFrame pagarFrame;
    private static List<JFrame> ticketFrames = new ArrayList<>();
    
    
    public static void RegistrarMain(JFrame main){
        mainFrame = main;
    }
    
    public static void RegistrarPagar(JFrame pagar){
        pagarFrame = pagar;
    }
    
    public static void RegistrarFrame(JFrame frame){
        if(pagarFrame == null) registroFrames.add(frame);
        
        else{
            pagarFrame.dispose();
            registroFrames.add(frame);
        }
        
    }
    
    public static void RegistrarTicket(JFrame frame){
        ticketFrames.add(frame);
    }
    
    public static void EliminarFrame(JFrame frame){
        registroFrames.remove(frame);
    }
    
    
    public static void EliminarTicketFrame(){
        for(var frame : ticketFrames){
            frame.dispose();
        }
    }
    
    public static void closeAll(){
        for(JFrame frame : new ArrayList<>(registroFrames)){
            if(frame != mainFrame && frame != pagarFrame){
                frame.dispose();
            }
        }
    }
}
