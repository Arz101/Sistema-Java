/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Control;
import Modelo.Conexion;
import Controlador.Ticket;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controlador.EventMenuSelected;
import Controlador.GuardarOrden;
import Paneles.*;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author adria
 */
public class Main extends javax.swing.JFrame {
    private final Conexion sql;
    private final Ticket ticket;
    public static List<String> ContenidoDeTicket;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private boolean opc = true;
    
    public Main() {
        this.opc = true;
        this.sql = Conexion.Instancia();
        this.ticket = Ticket.ObtenerInstancia();
        this.ContenidoDeTicket = new ArrayList<>();   
        initComponents();
        LoadDictionaryOrd();
        setBackground(new Color(0,0,0,0));
        menu2.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index){
                if(index == 0){
                   setForm(new Cocteles());
                }
                else if(index == 1){
                    setForm(new Platos());
                }
                else if(index == 2){
                    setForm(new Entradas());
                }
                else if(index == 4){
                    setForm(new Botellas());
                }
                else if(index == 7){
                    Pagar p = new Pagar(ContenidoDeTicket);
                    p.setVisible(true);
                    p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
                else if(index == 9){
                    try {
                        GuardarOrden newOrder = new GuardarOrden(ContenidoDeTicket);
                        if(Conexion.Total != 0){
                            try{
                                String ans = JOptionPane.showInputDialog(null, "Ingresar Numero de Mesa: ");
                                int mesa = Integer.parseInt(ans);
                                newOrder.GuardarOrdenSinCancelar(mesa);
                                
                                ContenidoDeTicket.clear();
                                JOptionPane.showMessageDialog(null, "Esta en una Nueva Orden", "!!!!", JOptionPane.INFORMATION_MESSAGE);
                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(null, e.getMessage(), "!!!", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            GuardarOrden newOrd = new GuardarOrden(ContenidoDeTicket);
                            newOrd.GuardarOrden();
                            JOptionPane.showMessageDialog(null, "Nueva Orden", "!!!!!!", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                }
                else if(index == 10){
                    setForm(new PanelDeOrdenesPendientes());
                }
                else {
                    System.out.print("Selected" + index);
                }
            }
        });
        //CargarOrdenesPendientes a = new CargarOrdenesPendientes();
        //a.abrirCarpetaa();
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
            
            for(File s : files){
                char num = s.getName().charAt(0);
                //JOptionPane.showMessageDialog(null, "Key: " + s.getName() + "Value" + num);
                GuardarOrden.Mesas.put(s.getName(),(int)num);
            }
        }
        
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


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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

}
