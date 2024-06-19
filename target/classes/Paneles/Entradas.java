/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;
import Modelo.Conexion;
import Modelo.VistaTicket;
import static Vista.Main.ContenidoDeTicket;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author adria
 */
public class Entradas extends javax.swing.JPanel {
    
    Conexion sql = Conexion.Instancia();
    VistaTicket vt = VistaTicket.Instancia();
    
    public Entradas() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNachos = new javax.swing.JButton();
        BtnChicharrones = new javax.swing.JButton();
        BtnChiles_Toreados = new javax.swing.JButton();
        BtnPopCorn = new javax.swing.JButton();
        BtnChiliPapas_Queso = new javax.swing.JButton();
        BtnPapas_Twist = new javax.swing.JButton();
        BtnAlitas = new javax.swing.JButton();
        BtnBoquiado = new javax.swing.JButton();

        setOpaque(false);

        BtnNachos.setText("NACHOS");
        BtnNachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNachosActionPerformed(evt);
            }
        });

        BtnChicharrones.setText("CHICHARRONES");
        BtnChicharrones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChicharronesActionPerformed(evt);
            }
        });

        BtnChiles_Toreados.setText("CHILES TOREADOS");
        BtnChiles_Toreados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChiles_ToreadosActionPerformed(evt);
            }
        });

        BtnPopCorn.setText("POP CORN");
        BtnPopCorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPopCornActionPerformed(evt);
            }
        });

        BtnChiliPapas_Queso.setText("CHILIPAPAS QUESO");
        BtnChiliPapas_Queso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChiliPapas_QuesoActionPerformed(evt);
            }
        });

        BtnPapas_Twist.setText("PAPAS TWIST");
        BtnPapas_Twist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPapas_TwistActionPerformed(evt);
            }
        });

        BtnAlitas.setText("ALITAS");
        BtnAlitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlitasActionPerformed(evt);
            }
        });

        BtnBoquiado.setText("BOQUIADO");
        BtnBoquiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBoquiadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPopCorn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAlitas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnChicharrones)
                    .addComponent(BtnChiles_Toreados)
                    .addComponent(BtnChiliPapas_Queso, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPapas_Twist, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBoquiado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(538, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnChicharrones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnChiles_Toreados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPopCorn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnChiliPapas_Queso, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPapas_Twist, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAlitas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBoquiado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNachosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNachosActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(1, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnNachosActionPerformed

    private void BtnChicharronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChicharronesActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(2, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnChicharronesActionPerformed

    private void BtnChiles_ToreadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChiles_ToreadosActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(3, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnChiles_ToreadosActionPerformed

    private void BtnPopCornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPopCornActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(4, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnPopCornActionPerformed

    private void BtnChiliPapas_QuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChiliPapas_QuesoActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(5, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnChiliPapas_QuesoActionPerformed

    private void BtnPapas_TwistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPapas_TwistActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(6, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnPapas_TwistActionPerformed

    private void BtnAlitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlitasActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(7, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnAlitasActionPerformed

    private void BtnBoquiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBoquiadoActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(8, "ENTRADAS", "ID_ENTRADA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnBoquiadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlitas;
    private javax.swing.JButton BtnBoquiado;
    private javax.swing.JButton BtnChicharrones;
    private javax.swing.JButton BtnChiles_Toreados;
    private javax.swing.JButton BtnChiliPapas_Queso;
    private javax.swing.JButton BtnNachos;
    private javax.swing.JButton BtnPapas_Twist;
    private javax.swing.JButton BtnPopCorn;
    // End of variables declaration//GEN-END:variables
    
    /*
    Image img;
    @Override
    public void paint(Graphics g){
        img = new ImageIcon(getClass().getResource("/iconos/fondo1.jpg")).getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
*/
}
