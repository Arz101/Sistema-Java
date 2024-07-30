/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Control;
import Controlador.Dir;
import Modelo.Conexion;
import Controlador.Ticket;
import java.util.List;
import java.util.ArrayList;
import Controlador.EventMenuSelected;
import Controlador.GuardarOrden;
import Modelo.VistaTicket;
import Paneles.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author adria
 */
public class Main extends javax.swing.JFrame implements KeyListener{
    public static List<String> ContenidoDeTicket;
    
    public Main() {
        this.ContenidoDeTicket = new ArrayList<>();   
        initComponents();
        
        
        LoadDictionaryOrd();
        setBackground(new Color(0,0,0,0));
        menu2.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index){
                switch (index) {
                    case 0:
                        setForm(new Cocteles());
                        break;
                    case 1:
                        setForm(new Platos());
                        break;
                    case 2:
                        setForm(new Entradas());
                        break;
                    case 4:
                        setForm(new Botellas());
                        break;
                    case 7:
                        Pagar p = new Pagar(ContenidoDeTicket);
                        p.setVisible(true);
                        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        break;
                    case 9:
                        try {
                            Control.closeAll();
                            GuardarOrden newOrder = new GuardarOrden(ContenidoDeTicket);
                            if(Conexion.Total != 0){
                                try{
                                    String ans = JOptionPane.showInputDialog(null, "Ingresar Numero de Mesa: ");
                                    int mesa = Integer.parseInt(ans);
                                    if(mesa < 1 || mesa > 10) throw new Exception("Entrada no valida");
                                    newOrder.GuardarOrdenSinCancelar(mesa);
                                    
                                    ContenidoDeTicket.clear();
                                    JOptionPane.showMessageDialog(null, "Esta en una Nueva Orden", "!!!!", JOptionPane.INFORMATION_MESSAGE);
                                    Conexion.Total = 0;
                                    repaint();
                                }
                                catch(Exception e){
                                    JOptionPane.showMessageDialog(null, e.getMessage(), "!!!", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else{
                                if(ContenidoDeTicket != null){
                                    GuardarOrden newOrd = new GuardarOrden(ContenidoDeTicket);
                                    newOrd.GuardarOrden();
                                    JOptionPane.showMessageDialog(null, "Nueva Orden", "!!!!!!", JOptionPane.INFORMATION_MESSAGE);
                                    Conexion.Total = 0;
                                    repaint();
                                }
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }   break;
                    case 10:
                        Dir.file = new File(Dir.PathordenesPendientes);
                        if(Dir.file.isDirectory()){
                            String[] list = list = Dir.file.list();
                            
                            if(list.length > 0)setForm(new PanelDeOrdenesPendientes());
                        
                            else {
                                JOptionPane.showMessageDialog(rootPane, "Carpeta vacia", "", JOptionPane.WARNING_MESSAGE);
                            }   
                        }
                        break;
                    case 11:
                        Eliminar();
                    default:
                        System.out.print("Selected" + index);
                        break;
                }
            }
        });
        Dir dir = Dir.getInstance();
        
        setFocusable(true);
        Control.RegistrarMain(this); 
    }
    
    private void setForm(JComponent com){
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void LoadDictionaryOrd(){
        String path = "C://Users//adrian.rodriguez//Sistema-Java//OrdenesPendientes";
        File file = new File(path);
        
        if(file.isDirectory()){
            File[] files = file.listFiles();
            
            for(var s : files){
                char num = s.getName().charAt(0);
                GuardarOrden.Mesas.put(s.getName(),(int)num);
            }
        }
    }
    
    private String Mod(String s){
        String[] arr = s.split(" ");
        Conexion.Total -= Double.parseDouble(arr[1]);
        DecimalFormat df = new DecimalFormat("#.00");
        
        Double p = Conexion.map.get(arr[0]);
        return arr[0] + " " + df.format(p);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Vista.PanelBorder();
        menu2 = new Vista.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void Eliminar(){
        VistaTicket a = VistaTicket.Instancia();
        String valor="";
        String b = a.getValue();
        for(int i=3; i < b.length(); i++){
            valor += b.charAt(i);
        }
        List<String> Eliminar = new ArrayList<>();
        String DatoABuscar = Mod(valor);
        
        for(String s: ContenidoDeTicket){
            if(!s.equals(DatoABuscar)) Eliminar.add(s);   
        }
        ContenidoDeTicket = Eliminar;
        Control.closeAll();
        a.repaint();
        a.setVisible(true);
        a.ActualizarTabla(true);
        a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private Vista.Menu menu2;
    private Vista.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
