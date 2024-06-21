/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;
import Modelo.Conexion;
import Modelo.VistaTicket;
import static Vista.Main.ContenidoDeTicket;
import static Controlador.GuardarOrden.Mesas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adria
 */
public class PanelDeOrdenesPendientes extends javax.swing.JPanel {
    
    VistaTicket vt = VistaTicket.Instancia();
    DefaultTableModel model;
    
    public PanelDeOrdenesPendientes() {
        initComponents();
        model = (DefaultTableModel) ordenesTabla.getModel();
        //LblOrden.setText(String.valueOf(model.getValueAt(ordenesTabla.getSelectedRow(),0)));
        cargar();
    }
    
    public void cargar(){
        if(!Mesas.isEmpty()){
            for(String s : Mesas.keySet()){
                model.addRow(new Object[]{s});
            }
        }
        else JOptionPane.showMessageDialog(null, "No hay ordenes pendientes :)", ":)", JOptionPane.INFORMATION_MESSAGE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ordenesTabla = new javax.swing.JTable();
        LblOrden = new javax.swing.JLabel();
        BtnAbrir = new javax.swing.JButton();

        setOpaque(false);

        ordenesTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ));
        jScrollPane1.setViewportView(ordenesTabla);

        LblOrden.setBackground(new java.awt.Color(0, 0, 0));
        LblOrden.setForeground(new java.awt.Color(255, 255, 255));

        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LblOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
// /*TODO add your handling code here:*/
        var index = ordenesTabla.getSelectedRow();
        try{
            String path = "C://Users//adrian.rodriguez//Sistema-Java//OrdenesPendientes//" + String.valueOf(ordenesTabla.getValueAt(index, 0));
            try (BufferedReader file = new BufferedReader(new FileReader(path))) {
                String line;
                ContenidoDeTicket.clear();
                while((line = file.readLine()) != null){
                    ContenidoDeTicket.add(line);
                }
                File borrador = new File(path);
                borrador.delete();
            }
            vt.setVisible(true);
            vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vt.ActualizarTabla("XD");
        } catch (IOException ex) {
            Logger.getLogger(PanelDeOrdenesPendientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAbrirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JLabel LblOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordenesTabla;
    // End of variables declaration//GEN-END:variables
}
