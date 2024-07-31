/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import Controlador.Dir;
import Controlador.Ticket;
import Modelo.VistaTicket;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Inicio extends javax.swing.JPanel {
    DefaultTableModel model;
    
    public Inicio() {
        initComponents();
        model = (DefaultTableModel) TablaTicket.getModel();
        CargarCarpetaDeOrdenens();
    }
    
    
    private void CargarCarpetaDeOrdenens(){
        for(var i : Dir.retornarArchivosEnCarpetaOrdenes()){
            model.addRow(new Object[] {i});
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();
        BtnAbrir = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();

        setOpaque(false);

        TablaTicket.setBackground(new java.awt.Color(255, 255, 255));
        TablaTicket.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        TablaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaTicket);

        BtnAbrir.setText("ABRIR");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        BtnImprimir.setText("REIMP");
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        int index = TablaTicket.getSelectedRow();
        String value = (String) model.getValueAt(index, 0);
        JOptionPane.showMessageDialog(null, "A" + value);
        new AbrirOrd(value);
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
        int index = TablaTicket.getSelectedRow();
        String value = (String) model.getValueAt(index, 0);
       
        new Controlador.Imprimir(value);
    }//GEN-LAST:event_BtnImprimirActionPerformed
    
    public class AbrirOrd extends VistaTicket{
        private String value;
        
        public AbrirOrd(String value){
            super("a");
            this.value=value;
            ActualizarTabla();
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        
        private final void ActualizarTabla(){
            for(var s : Dir.rotornarValoresDeTicket(this.value)){
                modelo.addRow(new Object[] {s});
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JTable TablaTicket;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
