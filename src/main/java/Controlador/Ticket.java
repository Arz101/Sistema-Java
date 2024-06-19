/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.*;
import Modelo.Conexion;
import java.text.DecimalFormat;
/**
 *
 * @author adria
 */
public class Ticket {
    private static Ticket instancia;
    
    public static Ticket ObtenerInstancia(){
        if(instancia == null){
            instancia = new Ticket();
        }
        return instancia;
    }
    
    public List<String> ModificarCont(List<String> e){
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");
        
        
        for(String inf : e){
            if(!map.containsKey(inf)){
                map.put(inf, 1);
            }
            else map.put(inf, map.get(inf)+1);
        }
           
        for(String keys : map.keySet()){
            if(map.get(keys) >= 1){
                int cant = map.get(keys);
                String[] n = keys.split(" ");
                double p = Double.parseDouble(n[1]);
                Conexion.Total += p;
                list.add("(" + String.valueOf(map.get(keys)) + ")" + n[0] + " " +String.valueOf(df.format(p*cant)));
            }
        }
        return list;
    }
    
    public String ObtenerTotal(){
        DecimalFormat df = new DecimalFormat("#.##");
        return String.valueOf(df.format(Conexion.Total));
    }
}
