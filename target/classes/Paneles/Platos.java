/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;
import Modelo.Conexion;
import Modelo.VistaTicket;
import static Vista.Main.ContenidoDeTicket;
import javax.swing.JFrame;
/**
 *
 * @author adria
 */
public class Platos extends javax.swing.JPanel {
    
    Conexion sql = Conexion.Instancia();
    VistaTicket vt = VistaTicket.Instancia();
    
    public Platos() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCostilla_BBQ_Ragnarok = new javax.swing.JButton();
        BtnVikinburguer = new javax.swing.JButton();
        BtnHamb_Classic = new javax.swing.JButton();
        BtnChicharrones = new javax.swing.JButton();
        BtnParrilla = new javax.swing.JButton();
        BtnPechugaParrilla = new javax.swing.JButton();

        setOpaque(false);

        BtnCostilla_BBQ_Ragnarok.setText("COSTILLA BB RN");
        BtnCostilla_BBQ_Ragnarok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCostilla_BBQ_RagnarokActionPerformed(evt);
            }
        });

        BtnVikinburguer.setText("VIKINBURGUER");
        BtnVikinburguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVikinburguerActionPerformed(evt);
            }
        });

        BtnHamb_Classic.setText("HAMBURGUESA C");
        BtnHamb_Classic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHamb_ClassicActionPerformed(evt);
            }
        });

        BtnChicharrones.setText("CHICHARRONES");
        BtnChicharrones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChicharronesActionPerformed(evt);
            }
        });

        BtnParrilla.setText("PARRILLA");
        BtnParrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParrillaActionPerformed(evt);
            }
        });

        BtnPechugaParrilla.setText("PECHUGA PARRILLA");
        BtnPechugaParrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPechugaParrillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnParrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCostilla_BBQ_Ragnarok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVikinburguer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnChicharrones))
                    .addComponent(BtnHamb_Classic)
                    .addComponent(BtnPechugaParrilla))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCostilla_BBQ_Ragnarok, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnVikinburguer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHamb_Classic, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnChicharrones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnParrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPechugaParrilla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCostilla_BBQ_RagnarokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCostilla_BBQ_RagnarokActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(1, "");
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true); 
    }//GEN-LAST:event_BtnCostilla_BBQ_RagnarokActionPerformed

    private void BtnVikinburguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVikinburguerActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(2, "");
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true); 
    }//GEN-LAST:event_BtnVikinburguerActionPerformed

    private void BtnHamb_ClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHamb_ClassicActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(3, "");
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true); 
    }//GEN-LAST:event_BtnHamb_ClassicActionPerformed

    private void BtnChicharronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChicharronesActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(4, "");
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true); 
    }//GEN-LAST:event_BtnChicharronesActionPerformed

    private void BtnParrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParrillaActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(5, "");
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true); 
    }//GEN-LAST:event_BtnParrillaActionPerformed

    private void BtnPechugaParrillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPechugaParrillaActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(6, "");
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);   
    }//GEN-LAST:event_BtnPechugaParrillaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChicharrones;
    private javax.swing.JButton BtnCostilla_BBQ_Ragnarok;
    private javax.swing.JButton BtnHamb_Classic;
    private javax.swing.JButton BtnParrilla;
    private javax.swing.JButton BtnPechugaParrilla;
    private javax.swing.JButton BtnVikinburguer;
    // End of variables declaration//GEN-END:variables
}
