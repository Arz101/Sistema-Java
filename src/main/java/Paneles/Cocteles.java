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
public class Cocteles extends javax.swing.JPanel {
    
    Conexion sql = Conexion.Instancia();
    VistaTicket vt = VistaTicket.Instancia();
    
    public Cocteles() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCubaLibre = new javax.swing.JButton();
        BtnSandB = new javax.swing.JButton();
        BtnSangreVikinga = new javax.swing.JButton();
        BtnVikingoB = new javax.swing.JButton();
        BtnValquiria = new javax.swing.JButton();
        BtnVikingoN = new javax.swing.JButton();
        BtnPerlaNegra = new javax.swing.JButton();
        BtnBlueDream = new javax.swing.JButton();
        BtnOldFashion = new javax.swing.JButton();
        BtnCuernoAzul = new javax.swing.JButton();
        BtnOdin = new javax.swing.JButton();
        BtnTequilaSunrise = new javax.swing.JButton();
        BtnBuchanan = new javax.swing.JButton();
        BtnMargarita = new javax.swing.JButton();
        BtnDaiquiri = new javax.swing.JButton();
        BtnHawaii = new javax.swing.JButton();
        BtnPinaColada = new javax.swing.JButton();
        BtnMartini = new javax.swing.JButton();
        BtnMojitos = new javax.swing.JButton();

        setOpaque(false);

        BtnCubaLibre.setText("CUBA LIBRE");
        BtnCubaLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCubaLibreActionPerformed(evt);
            }
        });

        BtnSandB.setText("SEX AND THE BEACHH");
        BtnSandB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSandBActionPerformed(evt);
            }
        });

        BtnSangreVikinga.setText("SANGRE VIKINGA");
        BtnSangreVikinga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSangreVikingaActionPerformed(evt);
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

        BtnValquiria.setText("VALQUIRIA");
        BtnValquiria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValquiriaActionPerformed(evt);
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

        BtnPerlaNegra.setText("PERLA NEGRA");
        BtnPerlaNegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerlaNegraActionPerformed(evt);
            }
        });

        BtnBlueDream.setText("BLUEDREAM");
        BtnBlueDream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBlueDreamActionPerformed(evt);
            }
        });

        BtnOldFashion.setText("OLD FASHION");
        BtnOldFashion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOldFashionActionPerformed(evt);
            }
        });

        BtnCuernoAzul.setText("CUERNO AZUL");
        BtnCuernoAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuernoAzulActionPerformed(evt);
            }
        });

        BtnOdin.setText("ODIN");
        BtnOdin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOdinActionPerformed(evt);
            }
        });

        BtnTequilaSunrise.setText("TEQUILA SUNRISE");
        BtnTequilaSunrise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTequilaSunriseActionPerformed(evt);
            }
        });

        BtnBuchanan.setText("BUCHANAN'S ROJA");
        BtnBuchanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuchananActionPerformed(evt);
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

        BtnPinaColada.setText("PINA COLADA");
        BtnPinaColada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPinaColadaActionPerformed(evt);
            }
        });

        BtnMartini.setText("MARTINI");
        BtnMartini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMartiniActionPerformed(evt);
            }
        });

        BtnMojitos.setText("MOJITOS");
        BtnMojitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMojitosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPinaColada)
                    .addComponent(BtnHawaii)
                    .addComponent(BtnVikingoB, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVikingoN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMartini)
                    .addComponent(BtnMojitos)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCuernoAzul)
                            .addComponent(BtnCubaLibre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTequilaSunrise)
                    .addComponent(BtnSandB)
                    .addComponent(BtnMargarita)
                    .addComponent(BtnDaiquiri)
                    .addComponent(BtnBlueDream))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnValquiria)
                    .addComponent(BtnPerlaNegra)
                    .addComponent(BtnOldFashion)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BtnOdin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuchanan))
                    .addComponent(BtnSangreVikinga))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBlueDream, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnTequilaSunrise, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnMargarita, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDaiquiri, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCuernoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCubaLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnMartini, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnMojitos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSandB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSangreVikinga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnValquiria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPerlaNegra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnOldFashion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnOdin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuchanan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnPinaColada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVikingoB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVikingoN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnHawaii, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCubaLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCubaLibreActionPerformed
        String e = sql.ObtenerValoresDeBoton(33);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCubaLibreActionPerformed

    private void BtnSandBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSandBActionPerformed
        String e = sql.ObtenerValoresDeBoton(31);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnSandBActionPerformed

    private void BtnSangreVikingaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSangreVikingaActionPerformed
        String e = sql.ObtenerValoresDeBoton(36);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSangreVikingaActionPerformed

    private void BtnVikingoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVikingoBActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(24);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnVikingoBActionPerformed

    private void BtnValquiriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValquiriaActionPerformed
        String e = sql.ObtenerValoresDeBoton(37);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnValquiriaActionPerformed

    private void BtnVikingoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVikingoNActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(25);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnVikingoNActionPerformed

    private void BtnPerlaNegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerlaNegraActionPerformed
        String e = sql.ObtenerValoresDeBoton(38);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPerlaNegraActionPerformed

    private void BtnBlueDreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBlueDreamActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(27);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnBlueDreamActionPerformed

    private void BtnOldFashionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOldFashionActionPerformed
        String e = sql.ObtenerValoresDeBoton(39);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnOldFashionActionPerformed

    private void BtnCuernoAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuernoAzulActionPerformed
        String e = sql.ObtenerValoresDeBoton(32);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCuernoAzulActionPerformed

    private void BtnOdinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOdinActionPerformed
        String e = sql.ObtenerValoresDeBoton(40);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnOdinActionPerformed

    private void BtnTequilaSunriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTequilaSunriseActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(28);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnTequilaSunriseActionPerformed

    private void BtnBuchananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuchananActionPerformed
        String e = sql.ObtenerValoresDeBoton(41);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuchananActionPerformed

    private void BtnMargaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMargaritaActionPerformed
        String e = sql.ObtenerValoresDeBoton(29);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMargaritaActionPerformed

    private void BtnDaiquiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDaiquiriActionPerformed
        String e = sql.ObtenerValoresDeBoton(30);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDaiquiriActionPerformed

    private void BtnHawaiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHawaiiActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(26);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnHawaiiActionPerformed

    private void BtnPinaColadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPinaColadaActionPerformed
        String e = sql.ObtenerValoresDeBoton(23);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnPinaColadaActionPerformed

    private void BtnMartiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMartiniActionPerformed
        String e = sql.ObtenerValoresDeBoton(34);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMartiniActionPerformed

    private void BtnMojitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMojitosActionPerformed
        String e = sql.ObtenerValoresDeBoton(35);
        ContenidoDeTicket.add(e);

        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnMojitosActionPerformed


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
