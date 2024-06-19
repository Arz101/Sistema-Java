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
public class Botellas extends javax.swing.JPanel {
    
    Conexion sql = Conexion.Instancia();
    VistaTicket vt = VistaTicket.Instancia();
    
    public Botellas() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnJimador_Reposado = new javax.swing.JButton();
        BtnJimador_Blanco = new javax.swing.JButton();
        BtnDon_Julio_Reposado = new javax.swing.JButton();
        BtnDon_Julio_Blanco = new javax.swing.JButton();
        BtnHerradura_Reposado = new javax.swing.JButton();
        Btn_Herradura_Ultra_Añejo = new javax.swing.JButton();
        Btn1800_Reposado = new javax.swing.JButton();
        BtnBuchanans_12_year = new javax.swing.JButton();
        BtnJimador_Reposado1 = new javax.swing.JButton();
        BtnBlackLabel = new javax.swing.JButton();
        BtnWilliam_Lawson = new javax.swing.JButton();
        BtnRed_Label = new javax.swing.JButton();
        BtnJack_Daniels_Apple = new javax.swing.JButton();
        BtnJack_Daniels = new javax.swing.JButton();
        BtnBacardi = new javax.swing.JButton();
        BtnBacardi_Oro = new javax.swing.JButton();
        BtnFlor_canaa_4 = new javax.swing.JButton();
        BtnFlor_Cana_12 = new javax.swing.JButton();
        BtnFinlandia_Frambuesa = new javax.swing.JButton();
        BtnSmirnoff = new javax.swing.JButton();
        BtnRussian_Rye = new javax.swing.JButton();
        BtnGinebra = new javax.swing.JButton();
        Btn1800_Cristalino = new javax.swing.JButton();

        setOpaque(false);

        BtnJimador_Reposado.setText("JIMADOR_REPOSADO");
        BtnJimador_Reposado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJimador_ReposadoActionPerformed(evt);
            }
        });

        BtnJimador_Blanco.setText("JIMADOR BLANCO");
        BtnJimador_Blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJimador_BlancoActionPerformed(evt);
            }
        });

        BtnDon_Julio_Reposado.setText("DON JULIO REPOSADO");
        BtnDon_Julio_Reposado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDon_Julio_ReposadoActionPerformed(evt);
            }
        });

        BtnDon_Julio_Blanco.setText("DON JULIO BLANCO");
        BtnDon_Julio_Blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDon_Julio_BlancoActionPerformed(evt);
            }
        });

        BtnHerradura_Reposado.setText("HERRADURA REPOSADO");
        BtnHerradura_Reposado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHerradura_ReposadoActionPerformed(evt);
            }
        });

        Btn_Herradura_Ultra_Añejo.setText("HERRADURA ULTRA AÑEJO");
        Btn_Herradura_Ultra_Añejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Herradura_Ultra_AñejoActionPerformed(evt);
            }
        });

        Btn1800_Reposado.setText("1800 REPOSADO");
        Btn1800_Reposado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1800_ReposadoActionPerformed(evt);
            }
        });

        BtnBuchanans_12_year.setText("BUCHANANS 12 AÑOS");
        BtnBuchanans_12_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuchanans_12_yearActionPerformed(evt);
            }
        });

        BtnJimador_Reposado1.setText("JIMADOR_REPOSADO");
        BtnJimador_Reposado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJimador_Reposado1ActionPerformed(evt);
            }
        });

        BtnBlackLabel.setText("BLACK LABEL");
        BtnBlackLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBlackLabelActionPerformed(evt);
            }
        });

        BtnWilliam_Lawson.setText("WILLIAMS LAWSON");
        BtnWilliam_Lawson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnWilliam_LawsonActionPerformed(evt);
            }
        });

        BtnRed_Label.setText("RED LABEL");
        BtnRed_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRed_LabelActionPerformed(evt);
            }
        });

        BtnJack_Daniels_Apple.setText("JACK DANIELS APPLE");
        BtnJack_Daniels_Apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJack_Daniels_AppleActionPerformed(evt);
            }
        });

        BtnJack_Daniels.setText("JACK DANIELS");
        BtnJack_Daniels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJack_DanielsActionPerformed(evt);
            }
        });

        BtnBacardi.setText("BACARDI");
        BtnBacardi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBacardiActionPerformed(evt);
            }
        });

        BtnBacardi_Oro.setText("BACARDI ORO");
        BtnBacardi_Oro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBacardi_OroActionPerformed(evt);
            }
        });

        BtnFlor_canaa_4.setText("FLOR CAÑA 4 AÑOS");
        BtnFlor_canaa_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFlor_canaa_4ActionPerformed(evt);
            }
        });

        BtnFlor_Cana_12.setText("FLOR CAÑA 12 AÑOS");
        BtnFlor_Cana_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFlor_Cana_12ActionPerformed(evt);
            }
        });

        BtnFinlandia_Frambuesa.setText("FINLANDIA FRAMBUESA");
        BtnFinlandia_Frambuesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinlandia_FrambuesaActionPerformed(evt);
            }
        });

        BtnSmirnoff.setText("SMIRNOFF");
        BtnSmirnoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSmirnoffActionPerformed(evt);
            }
        });

        BtnRussian_Rye.setText("RUSSIAN RYE");
        BtnRussian_Rye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRussian_RyeActionPerformed(evt);
            }
        });

        BtnGinebra.setText("GINEBRA");
        BtnGinebra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGinebraActionPerformed(evt);
            }
        });

        Btn1800_Cristalino.setText("1800 CRISTALINO");
        Btn1800_Cristalino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1800_CristalinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnJimador_Blanco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnJimador_Reposado1)
                                            .addComponent(BtnJimador_Reposado))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnBuchanans_12_year)
                                            .addComponent(BtnWilliam_Lawson)
                                            .addComponent(BtnBlackLabel)
                                            .addComponent(BtnRed_Label)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnDon_Julio_Blanco)
                                        .addGap(76, 76, 76)
                                        .addComponent(BtnJack_Daniels_Apple))
                                    .addComponent(BtnDon_Julio_Reposado))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnHerradura_Reposado)
                                        .addComponent(Btn_Herradura_Ultra_Añejo, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(Btn1800_Reposado))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnBacardi_Oro)
                                    .addComponent(BtnJack_Daniels)
                                    .addComponent(BtnBacardi))
                                .addGap(62, 62, 62)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnFlor_Cana_12)
                            .addComponent(BtnFlor_canaa_4)
                            .addComponent(BtnFinlandia_Frambuesa)
                            .addComponent(BtnSmirnoff)
                            .addComponent(BtnRussian_Rye)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn1800_Cristalino)
                                    .addComponent(BtnGinebra)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnJimador_Reposado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnJimador_Reposado1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnJimador_Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDon_Julio_Reposado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRed_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnDon_Julio_Blanco, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(BtnJack_Daniels_Apple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnHerradura_Reposado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnJack_Daniels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Herradura_Ultra_Añejo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBacardi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn1800_Reposado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBacardi_Oro))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBuchanans_12_year, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnFlor_canaa_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BtnWilliam_Lawson, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBlackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(BtnFlor_Cana_12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnFinlandia_Frambuesa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(BtnSmirnoff, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(BtnRussian_Rye, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGinebra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn1800_Cristalino, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Herradura_Ultra_AñejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Herradura_Ultra_AñejoActionPerformed
        String e = sql.ObtenerValoresDeBoton(7, "BOTELLAS", "ID_BOTELLA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Herradura_Ultra_AñejoActionPerformed

    private void Btn1800_ReposadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1800_ReposadoActionPerformed
        String e = sql.ObtenerValoresDeBoton(8, "BOTELLAS", "ID_BOTELLA");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1800_ReposadoActionPerformed

    private void BtnBuchanans_12_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuchanans_12_yearActionPerformed
        String e = sql.ObtenerValoresDeBoton(9, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuchanans_12_yearActionPerformed

    private void BtnBlackLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBlackLabelActionPerformed
        String e = sql.ObtenerValoresDeBoton(11, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBlackLabelActionPerformed

    private void BtnWilliam_LawsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnWilliam_LawsonActionPerformed
        String e = sql.ObtenerValoresDeBoton(10, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnWilliam_LawsonActionPerformed

    private void BtnFlor_canaa_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFlor_canaa_4ActionPerformed
        String e = sql.ObtenerValoresDeBoton(17, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFlor_canaa_4ActionPerformed

    private void BtnFlor_Cana_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFlor_Cana_12ActionPerformed
        String e = sql.ObtenerValoresDeBoton(18, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFlor_Cana_12ActionPerformed

    private void BtnFinlandia_FrambuesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinlandia_FrambuesaActionPerformed
        String e = sql.ObtenerValoresDeBoton(19, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFinlandia_FrambuesaActionPerformed

    private void BtnSmirnoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSmirnoffActionPerformed
        String e = sql.ObtenerValoresDeBoton(20, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSmirnoffActionPerformed

    private void BtnRussian_RyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRussian_RyeActionPerformed
        String e = sql.ObtenerValoresDeBoton(21, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRussian_RyeActionPerformed

    private void BtnGinebraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGinebraActionPerformed
        String e = sql.ObtenerValoresDeBoton(22, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGinebraActionPerformed

    private void BtnJimador_ReposadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJimador_ReposadoActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(1, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
        
    }//GEN-LAST:event_BtnJimador_ReposadoActionPerformed

    private void BtnJimador_Reposado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJimador_Reposado1ActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(2, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnJimador_Reposado1ActionPerformed

    private void BtnJimador_BlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJimador_BlancoActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(3, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);
    }//GEN-LAST:event_BtnJimador_BlancoActionPerformed

    private void BtnDon_Julio_ReposadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDon_Julio_ReposadoActionPerformed
        String e = sql.ObtenerValoresDeBoton(4, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDon_Julio_ReposadoActionPerformed

    private void BtnDon_Julio_BlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDon_Julio_BlancoActionPerformed
        String e = sql.ObtenerValoresDeBoton(5, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDon_Julio_BlancoActionPerformed

    private void BtnHerradura_ReposadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHerradura_ReposadoActionPerformed
        String e = sql.ObtenerValoresDeBoton(6, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHerradura_ReposadoActionPerformed

    private void BtnRed_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRed_LabelActionPerformed
        String e = sql.ObtenerValoresDeBoton(12, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRed_LabelActionPerformed

    private void BtnJack_Daniels_AppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJack_Daniels_AppleActionPerformed
        String e = sql.ObtenerValoresDeBoton(13, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnJack_Daniels_AppleActionPerformed

    private void BtnJack_DanielsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJack_DanielsActionPerformed
        String e = sql.ObtenerValoresDeBoton(14, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnJack_DanielsActionPerformed

    private void BtnBacardiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBacardiActionPerformed
        String e = sql.ObtenerValoresDeBoton(15, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBacardiActionPerformed

    private void BtnBacardi_OroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBacardi_OroActionPerformed
        String e = sql.ObtenerValoresDeBoton(16, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBacardi_OroActionPerformed

    private void Btn1800_CristalinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1800_CristalinoActionPerformed
        String e = sql.ObtenerValoresDeBoton(7, "BOTELLAS", "ID_BOTELLAS");
        
        ContenidoDeTicket.add(e);
        vt.setVisible(true);
        vt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vt.ActualizarTabla(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Btn1800_CristalinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1800_Cristalino;
    private javax.swing.JButton Btn1800_Reposado;
    private javax.swing.JButton BtnBacardi;
    private javax.swing.JButton BtnBacardi_Oro;
    private javax.swing.JButton BtnBlackLabel;
    private javax.swing.JButton BtnBuchanans_12_year;
    private javax.swing.JButton BtnDon_Julio_Blanco;
    private javax.swing.JButton BtnDon_Julio_Reposado;
    private javax.swing.JButton BtnFinlandia_Frambuesa;
    private javax.swing.JButton BtnFlor_Cana_12;
    private javax.swing.JButton BtnFlor_canaa_4;
    private javax.swing.JButton BtnGinebra;
    private javax.swing.JButton BtnHerradura_Reposado;
    private javax.swing.JButton BtnJack_Daniels;
    private javax.swing.JButton BtnJack_Daniels_Apple;
    private javax.swing.JButton BtnJimador_Blanco;
    private javax.swing.JButton BtnJimador_Reposado;
    private javax.swing.JButton BtnJimador_Reposado1;
    private javax.swing.JButton BtnRed_Label;
    private javax.swing.JButton BtnRussian_Rye;
    private javax.swing.JButton BtnSmirnoff;
    private javax.swing.JButton BtnWilliam_Lawson;
    private javax.swing.JButton Btn_Herradura_Ultra_Añejo;
    // End of variables declaration//GEN-END:variables
}
