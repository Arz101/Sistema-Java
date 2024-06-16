/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modelo;

import Controlador.Control;
import static Vista.Main.ContenidoDeTicket;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author adria
 */
public class BEBIDAS extends javax.swing.JFrame {
    
    FondoMenuBebidas panel = new FondoMenuBebidas();
    Conexion sql = Conexion.Instancia();
    VistaTicket vt = VistaTicket.Instancia();
    boolean opc = false;
    
    public BEBIDAS() {
        this.setContentPane(panel);
        panel.setVisible(true);
        initComponents();
        
        Control.RegistrarFrame(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnPinaColada = new javax.swing.JButton();
        BtnMojitos = new javax.swing.JButton();
        BtnSandB = new javax.swing.JButton();
        BtnVikingoB = new javax.swing.JButton();
        BtnVikingoN = new javax.swing.JButton();
        BtnBlueDream = new javax.swing.JButton();
        BtnCuernoAzul = new javax.swing.JButton();
        BtnTequilaSunrise = new javax.swing.JButton();
        BtnMargarita = new javax.swing.JButton();
        BtnDaiquiri = new javax.swing.JButton();
        BtnHawaii = new javax.swing.JButton();
        BtnMartini = new javax.swing.JButton();
        BtnCubaLibre = new javax.swing.JButton();
        BtnSangreVikinga = new javax.swing.JButton();
        BtnValquiria = new javax.swing.JButton();
        BtnPerlaNegra = new javax.swing.JButton();
        BtnOldFashion = new javax.swing.JButton();
        BtnOdin = new javax.swing.JButton();
        BtnBuchanan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnPinaColada.setText("PINA COLADA");
        BtnPinaColada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPinaColadaActionPerformed(evt);
            }
        });

        BtnMojitos.setText("MOJITOS");
        BtnMojitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMojitosActionPerformed(evt);
            }
        });

        BtnSandB.setText("SEX AND THE BEACHH");
        BtnSandB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSandBActionPerformed(evt);
            }
        });

        BtnVikingoB.setBackground(new java.awt.Color(255, 255, 255));
        BtnVikingoB.setForeground(new java.awt.Color(0, 0, 0));
        BtnVikingoB.setText("VIKINGO");
        BtnVikingoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVikingoBActionPerformed(evt);
            }
        });

        BtnVikingoN.setBackground(new java.awt.Color(0, 0, 0));
        BtnVikingoN.setForeground(new java.awt.Color(255, 255, 255));
        BtnVikingoN.setText("VIKINGO");
        BtnVikingoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVikingoNActionPerformed(evt);
            }
        });

        BtnBlueDream.setText("BLUEDREAM");
        BtnBlueDream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBlueDreamActionPerformed(evt);
            }
        });

        BtnCuernoAzul.setText("CUERNO AZUL");
        BtnCuernoAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuernoAzulActionPerformed(evt);
            }
        });

        BtnTequilaSunrise.setText("TEQUILA SUNRISE");
        BtnTequilaSunrise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTequilaSunriseActionPerformed(evt);
            }
        });

        BtnMargarita.setText("MARGARITA");
        BtnMargarita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMargaritaActionPerformed(evt);
            }
        });

        BtnDaiquiri.setText("DAIQUIRI");
        BtnDaiquiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDaiquiriActionPerformed(evt);
            }
        });

        BtnHawaii.setText("HAWAII");
        BtnHawaii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHawaiiActionPerformed(evt);
            }
        });

        BtnMartini.setText("MARTINI");
        BtnMartini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMartiniActionPerformed(evt);
            }
        });

        BtnCubaLibre.setText("CUBA LIBRE");
        BtnCubaLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCubaLibreActionPerformed(evt);
            }
        });

        BtnSangreVikinga.setText("SANGRE VIKINGA");
        BtnSangreVikinga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSangreVikingaActionPerformed(evt);
            }
        });

        BtnValquiria.setText("VALQUIRIA");
        BtnValquiria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValquiriaActionPerformed(evt);
            }
        });

        BtnPerlaNegra.setText("PERLA NEGRA");
        BtnPerlaNegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerlaNegraActionPerformed(evt);
            }
        });

        BtnOldFashion.setText("OLD FASHION");
        BtnOldFashion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOldFashionActionPerformed(evt);
            }
        });

        BtnOdin.setText("ODIN");
        BtnOdin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOdinActionPerformed(evt);
            }
        });

        BtnBuchanan.setText("BUCHANAN'S ROJA");
        BtnBuchanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuchananActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/Captura de pantalla 2024-06-14 225642.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnTequilaSunrise)
                            .addComponent(BtnPinaColada)
                            .addComponent(BtnSandB)
                            .addComponent(BtnMargarita)
                            .addComponent(BtnDaiquiri)
                            .addComponent(BtnHawaii))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnValquiria)
                            .addComponent(BtnPerlaNegra)
                            .addComponent(BtnOldFashion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(BtnOdin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBuchanan))
                            .addComponent(BtnSangreVikinga)
                            .addComponent(BtnMartini)
                            .addComponent(BtnMojitos)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnCuernoAzul)
                                    .addComponent(BtnCubaLibre)))))
                    .addComponent(BtnVikingoB, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBlueDream)
                    .addComponent(BtnVikingoN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnPinaColada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCuernoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnVikingoB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCubaLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnVikingoN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMartini, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnHawaii, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMojitos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBlueDream, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSangreVikinga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTequilaSunrise, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnValquiria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnMargarita, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPerlaNegra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDaiquiri, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOldFashion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSandB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOdin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuchanan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BtnPinaColadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPinaColadaActionPerformed
        String e = sql.ObtenerValoresDeBoton(1);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnPinaColadaActionPerformed

    private void BtnMojitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMojitosActionPerformed
        String e = sql.ObtenerValoresDeBoton(14);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnMojitosActionPerformed

    private void BtnSandBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSandBActionPerformed
        String e = sql.ObtenerValoresDeBoton(9);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnSandBActionPerformed

    private void BtnBlueDreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBlueDreamActionPerformed
        // TODO add your handling code here:
         String e = sql.ObtenerValoresDeBoton(5);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnBlueDreamActionPerformed

    private void BtnCuernoAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuernoAzulActionPerformed
        String e = sql.ObtenerValoresDeBoton(10);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCuernoAzulActionPerformed

    private void BtnTequilaSunriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTequilaSunriseActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(6);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnTequilaSunriseActionPerformed

    private void BtnMargaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMargaritaActionPerformed
        String e = sql.ObtenerValoresDeBoton(7);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMargaritaActionPerformed

    private void BtnDaiquiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDaiquiriActionPerformed
        String e = sql.ObtenerValoresDeBoton(8);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDaiquiriActionPerformed

    private void BtnHawaiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHawaiiActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(4);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnHawaiiActionPerformed

    private void BtnMartiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMartiniActionPerformed
        String e = sql.ObtenerValoresDeBoton(13);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMartiniActionPerformed

    private void BtnCubaLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCubaLibreActionPerformed
        String e = sql.ObtenerValoresDeBoton(11);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCubaLibreActionPerformed

    private void BtnSangreVikingaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSangreVikingaActionPerformed
        String e = sql.ObtenerValoresDeBoton(15);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSangreVikingaActionPerformed

    private void BtnValquiriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValquiriaActionPerformed
        String e = sql.ObtenerValoresDeBoton(16);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnValquiriaActionPerformed

    private void BtnPerlaNegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerlaNegraActionPerformed
        String e = sql.ObtenerValoresDeBoton(17);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPerlaNegraActionPerformed

    private void BtnOldFashionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOldFashionActionPerformed
        String e = sql.ObtenerValoresDeBoton(18);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnOldFashionActionPerformed

    private void BtnOdinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOdinActionPerformed
        String e = sql.ObtenerValoresDeBoton(19);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnOdinActionPerformed

    private void BtnBuchananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuchananActionPerformed
        String e = sql.ObtenerValoresDeBoton(20);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuchananActionPerformed

    private void BtnVikingoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVikingoBActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(2);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnVikingoBActionPerformed

    private void BtnVikingoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVikingoNActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(3);
        ContenidoDeTicket.add(e);
        
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnVikingoNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBlueDream;
    private javax.swing.JButton BtnBuchanan;
    private javax.swing.JButton BtnCubaLibre;
    private javax.swing.JButton BtnCuernoAzul;
    private javax.swing.JButton BtnDaiquiri;
    private javax.swing.JButton BtnHawaii;
    private javax.swing.JButton BtnMargarita;
    private javax.swing.JButton BtnMartini;
    private javax.swing.JButton BtnMojitos;
    private javax.swing.JButton BtnOdin;
    private javax.swing.JButton BtnOldFashion;
    private javax.swing.JButton BtnPerlaNegra;
    private javax.swing.JButton BtnPinaColada;
    private javax.swing.JButton BtnSandB;
    private javax.swing.JButton BtnSangreVikinga;
    private javax.swing.JButton BtnTequilaSunrise;
    private javax.swing.JButton BtnValquiria;
    private javax.swing.JButton BtnVikingoB;
    private javax.swing.JButton BtnVikingoN;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    class FondoMenuBebidas extends JPanel {
        private Image imagen;
    
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/frames/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
            setOpaque(false);
        
            super.paint(g);
        } 
    }
    
    @Override
    public void dispose(){
        Control.EliminarFrame(this);
        super.dispose();
    }
}
