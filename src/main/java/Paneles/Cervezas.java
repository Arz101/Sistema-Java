/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;
import Controlador.Conexion;
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
public class Cervezas extends javax.swing.JPanel {
    
    Conexion sql = Conexion.Instancia();
    VistaTicket vt = VistaTicket.Instancia();
    
    public Cervezas() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnModelo = new javax.swing.JButton();
        BtnGaseosas = new javax.swing.JButton();
        BtnAgua = new javax.swing.JButton();
        BtnGolden = new javax.swing.JButton();
        BtnGoldenExtra = new javax.swing.JButton();
        BtnBaldePilsener = new javax.swing.JButton();
        BtnUltra = new javax.swing.JButton();
        BtnBalde_golden = new javax.swing.JButton();
        BtnBalde_Golden_X = new javax.swing.JButton();
        BtnBalde_Corona = new javax.swing.JButton();
        BtnCorona = new javax.swing.JButton();
        BtnPilsener = new javax.swing.JButton();
        BtnSmirnoff = new javax.swing.JButton();
        BtnHeineke = new javax.swing.JButton();

        setOpaque(false);

        BtnModelo.setText("MODELO");
        BtnModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModeloActionPerformed(evt);
            }
        });

        BtnGaseosas.setText("GASEOSAS");
        BtnGaseosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGaseosasActionPerformed(evt);
            }
        });

        BtnAgua.setText("AGUA");
        BtnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAguaActionPerformed(evt);
            }
        });

        BtnGolden.setBackground(new java.awt.Color(255, 255, 255));
        BtnGolden.setForeground(new java.awt.Color(0, 0, 0));
        BtnGolden.setText("GOLDEN");
        BtnGolden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGoldenActionPerformed(evt);
            }
        });

        BtnGoldenExtra.setBackground(new java.awt.Color(0, 0, 0));
        BtnGoldenExtra.setForeground(new java.awt.Color(255, 255, 255));
        BtnGoldenExtra.setText("GOLDEN X");
        BtnGoldenExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGoldenExtraActionPerformed(evt);
            }
        });

        BtnBaldePilsener.setText("BALDE PILSENER");
        BtnBaldePilsener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBaldePilsenerActionPerformed(evt);
            }
        });

        BtnUltra.setText("ULTRA");
        BtnUltra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUltraActionPerformed(evt);
            }
        });

        BtnBalde_golden.setText("BALDE GOLDEN");
        BtnBalde_golden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalde_goldenActionPerformed(evt);
            }
        });

        BtnBalde_Golden_X.setText("BALDE GOLDEN X");
        BtnBalde_Golden_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalde_Golden_XActionPerformed(evt);
            }
        });

        BtnBalde_Corona.setText("BALDE CORONA");
        BtnBalde_Corona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalde_CoronaActionPerformed(evt);
            }
        });

        BtnCorona.setText("CORONA");
        BtnCorona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoronaActionPerformed(evt);
            }
        });

        BtnPilsener.setText("PILSENER");
        BtnPilsener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPilsenerActionPerformed(evt);
            }
        });

        BtnSmirnoff.setText("SMIRNOFF");
        BtnSmirnoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSmirnoffActionPerformed(evt);
            }
        });

        BtnHeineke.setText("HEINEKE");
        BtnHeineke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHeinekeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPilsener)
                    .addComponent(BtnCorona)
                    .addComponent(BtnGolden, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGoldenExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSmirnoff)
                    .addComponent(BtnHeineke)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnUltra)
                            .addComponent(BtnModelo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBalde_golden)
                    .addComponent(BtnGaseosas)
                    .addComponent(BtnBalde_Golden_X)
                    .addComponent(BtnBalde_Corona)
                    .addComponent(BtnBaldePilsener))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgua)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBaldePilsener, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBalde_golden, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBalde_Golden_X, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBalde_Corona, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnUltra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSmirnoff, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnHeineke, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnPilsener, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGolden, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGoldenExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCorona, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModeloActionPerformed
        String e = sql.ObtenerValoresDeBoton(47);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModeloActionPerformed

    private void BtnGaseosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGaseosasActionPerformed
        String e = sql.ObtenerValoresDeBoton(54);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnGaseosasActionPerformed

    private void BtnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAguaActionPerformed
        String e = sql.ObtenerValoresDeBoton(55);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAguaActionPerformed

    private void BtnGoldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGoldenActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(43);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnGoldenActionPerformed

    private void BtnGoldenExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGoldenExtraActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(44);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnGoldenExtraActionPerformed

    private void BtnBaldePilsenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBaldePilsenerActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(50);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnBaldePilsenerActionPerformed

    private void BtnUltraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUltraActionPerformed
        String e = sql.ObtenerValoresDeBoton(46);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUltraActionPerformed

    private void BtnBalde_goldenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalde_goldenActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(51);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnBalde_goldenActionPerformed

    private void BtnBalde_Golden_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalde_Golden_XActionPerformed
        String e = sql.ObtenerValoresDeBoton(52);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBalde_Golden_XActionPerformed

    private void BtnBalde_CoronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalde_CoronaActionPerformed
        String e = sql.ObtenerValoresDeBoton(53);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBalde_CoronaActionPerformed

    private void BtnCoronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoronaActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(45);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnCoronaActionPerformed

    private void BtnPilsenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPilsenerActionPerformed
        String e = sql.ObtenerValoresDeBoton(42);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnPilsenerActionPerformed

    private void BtnSmirnoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSmirnoffActionPerformed
        String e = sql.ObtenerValoresDeBoton(48);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSmirnoffActionPerformed

    private void BtnHeinekeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHeinekeActionPerformed
        String e = sql.ObtenerValoresDeBoton(49);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnHeinekeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgua;
    private javax.swing.JButton BtnBaldePilsener;
    private javax.swing.JButton BtnBalde_Corona;
    private javax.swing.JButton BtnBalde_Golden_X;
    private javax.swing.JButton BtnBalde_golden;
    private javax.swing.JButton BtnCorona;
    private javax.swing.JButton BtnGaseosas;
    private javax.swing.JButton BtnGolden;
    private javax.swing.JButton BtnGoldenExtra;
    private javax.swing.JButton BtnHeineke;
    private javax.swing.JButton BtnModelo;
    private javax.swing.JButton BtnPilsener;
    private javax.swing.JButton BtnSmirnoff;
    private javax.swing.JButton BtnUltra;
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
