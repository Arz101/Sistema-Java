/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Conexion;
import Controlador.Ticket;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.CrearOrden;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;


/**
 *
 * @author adria
 */
public class Vista extends javax.swing.JFrame {

    private final Conexion sql;
    private final Ticket ticket;
    private final List<String> ContenidoDeTicket;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private boolean opc = true;
    
    public Vista() {
        this.opc = true;
        this.sql = Conexion.Instancia();
        this.ticket = Ticket.ObtenerInstancia();
        this.ContenidoDeTicket = new ArrayList<>();
        initComponents();
        modelo = (DefaultTableModel) TablaTicket.getModel();
        modelo2 = (DefaultTableModel) OrdenesCreadas.getModel();
        PanelBebidas.setVisible(true);
        PanelPlatos.setVisible(false);
        modelo.addRow(new Object[]{"Sub Total: "});
        CargarCarpetaOrd();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelBebidas = new javax.swing.JPanel();
        BtnCoctel = new javax.swing.JButton();
        BtnBloodyMary = new javax.swing.JButton();
        BtnTonColins = new javax.swing.JButton();
        BtnGinTonic = new javax.swing.JButton();
        BtnPinaColada = new javax.swing.JButton();
        BtnMojitos = new javax.swing.JButton();
        BtnSandB = new javax.swing.JButton();
        PanelPlatos = new javax.swing.JPanel();
        BtnNachos = new javax.swing.JButton();
        BtnPlatos = new javax.swing.JButton();
        BtnBebidas1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();
        SeparadorBtn = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        BtnBorrar = new javax.swing.JButton();
        BtnPagar = new javax.swing.JButton();
        BtnManager = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PanelOrdenesCanceladas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrdenesCreadas = new javax.swing.JTable();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBebidas.setBackground(new java.awt.Color(255, 255, 255));
        PanelBebidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelBebidas.setPreferredSize(new java.awt.Dimension(547, 497));

        BtnCoctel.setText("COCTEL");
        BtnCoctel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoctelActionPerformed(evt);
            }
        });

        BtnBloodyMary.setText("BLOODY MARY ");
        BtnBloodyMary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBloodyMaryActionPerformed(evt);
            }
        });

        BtnTonColins.setText("TON COLINS");
        BtnTonColins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTonColinsActionPerformed(evt);
            }
        });

        BtnGinTonic.setText("GIN TONIC");
        BtnGinTonic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGinTonicActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout PanelBebidasLayout = new javax.swing.GroupLayout(PanelBebidas);
        PanelBebidas.setLayout(PanelBebidasLayout);
        PanelBebidasLayout.setHorizontalGroup(
            PanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBebidasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBebidasLayout.createSequentialGroup()
                        .addComponent(BtnMojitos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSandB))
                    .addGroup(PanelBebidasLayout.createSequentialGroup()
                        .addComponent(BtnCoctel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGinTonic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBloodyMary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnTonColins)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPinaColada)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PanelBebidasLayout.setVerticalGroup(
            PanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBebidasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBloodyMary, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTonColins, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGinTonic, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPinaColada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCoctel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMojitos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSandB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        PanelPlatos.setBackground(new java.awt.Color(204, 204, 255));
        PanelPlatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnNachos.setText("NACHOS");
        BtnNachos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNachosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPlatosLayout = new javax.swing.GroupLayout(PanelPlatos);
        PanelPlatos.setLayout(PanelPlatosLayout);
        PanelPlatosLayout.setHorizontalGroup(
            PanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNachos)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        PanelPlatosLayout.setVerticalGroup(
            PanelPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(517, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(PanelBebidas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelPlatos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(PanelPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(PanelPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        BtnPlatos.setText("PLATOS");
        BtnPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlatosActionPerformed(evt);
            }
        });

        BtnBebidas1.setText("BEBIDAS");
        BtnBebidas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBebidas1ActionPerformed(evt);
            }
        });

        TablaTicket.setBackground(new java.awt.Color(255, 255, 255));
        TablaTicket.setFont(new java.awt.Font("Fixedsys Excelsior 3.01", 0, 18)); // NOI18N
        TablaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ));
        jScrollPane2.setViewportView(TablaTicket);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SeparadorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeparadorBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        BtnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BtnBorrar.setText("BORRAR");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnPagar.setBackground(new java.awt.Color(255, 255, 255));
        BtnPagar.setForeground(new java.awt.Color(0, 0, 0));
        BtnPagar.setText("PAGAR");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });

        BtnManager.setBackground(new java.awt.Color(255, 255, 255));
        BtnManager.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        BtnManager.setForeground(new java.awt.Color(0, 0, 0));
        BtnManager.setText("MANAGER");
        BtnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManagerActionPerformed(evt);
            }
        });

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnManager, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnManager, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        PanelOrdenesCanceladas.setBackground(new java.awt.Color(204, 255, 255));
        PanelOrdenesCanceladas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OrdenesCreadas.setBackground(new java.awt.Color(255, 255, 255));
        OrdenesCreadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ));
        OrdenesCreadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdenesCreadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrdenesCreadas);

        javax.swing.GroupLayout PanelOrdenesCanceladasLayout = new javax.swing.GroupLayout(PanelOrdenesCanceladas);
        PanelOrdenesCanceladas.setLayout(PanelOrdenesCanceladasLayout);
        PanelOrdenesCanceladasLayout.setHorizontalGroup(
            PanelOrdenesCanceladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelOrdenesCanceladasLayout.setVerticalGroup(
            PanelOrdenesCanceladasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SeparadorBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnBebidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelOrdenesCanceladas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnBebidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SeparadorBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelOrdenesCanceladas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlatosActionPerformed
        // TODO add your handling code here:
        PanelBebidas.setVisible(false);
        PanelPlatos.setVisible(true);
    }//GEN-LAST:event_BtnPlatosActionPerformed

    private void BtnBebidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBebidas1ActionPerformed
        // TODO add your handling code here:
        PanelPlatos.setVisible(false);
        PanelBebidas.setVisible(true);
    }//GEN-LAST:event_BtnBebidas1ActionPerformed

    private void BtnCoctelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoctelActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(1);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
       // TicketTxt.setText(TicketTxt.getText() + e + "\n");
       
    
    }//GEN-LAST:event_BtnCoctelActionPerformed

    private void BtnBloodyMaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBloodyMaryActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(3);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
       // TicketTxt.setText(TicketTxt.getText() + e + "\n");
    }//GEN-LAST:event_BtnBloodyMaryActionPerformed

    private void BtnTonColinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTonColinsActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(4);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
    }//GEN-LAST:event_BtnTonColinsActionPerformed

    private void BtnGinTonicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGinTonicActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(2);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
       // TicketTxt.setText(TicketTxt.getText() + e + "\n");
        
    }//GEN-LAST:event_BtnGinTonicActionPerformed

    private void BtnPinaColadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPinaColadaActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(5);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
    }//GEN-LAST:event_BtnPinaColadaActionPerformed

    private void BtnMojitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMojitosActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(6);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
    }//GEN-LAST:event_BtnMojitosActionPerformed

    private void BtnSandBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSandBActionPerformed
        // TODO add your handling code here:
        String e = sql.ObtenerValoresDeBoton(7);
        ContenidoDeTicket.add(e);
        ActualizarTabla(opc);
    }//GEN-LAST:event_BtnSandBActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        // TODO add your handling code here:
        int indexRow = TablaTicket.getSelectedRow();
        try{
            if(indexRow != 1){
                modelo.removeRow(indexRow);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void SeparadorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeparadorBtnActionPerformed
        // TODO add your handling code here:
        if(SeparadorBtn.isSelected()){
            opc = true;
        }
        else {
            opc = false;
        }
    }//GEN-LAST:event_SeparadorBtnActionPerformed

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed
        // TODO add your handling code here:
        Pagar pagar = new Pagar(ticket.ModificarCont(ContenidoDeTicket));
        pagar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
        
        System.out.println("Hola");
        if(CrearOrden.confirmador){
            modelo.setRowCount(0);
            ContenidoDeTicket.clear();
        }
        
        pagar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Preguntar al usuario antes de cerrar el formulario
                int option = JOptionPane.showConfirmDialog(pagar, "¿Estás seguro de que quieres cerrar el formulario?",
                        "Confirmar cierre", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                            System.out.println("Hola");
                    if(CrearOrden.confirmador){
                        modelo.setRowCount(0);
                        ContenidoDeTicket.clear();
                        CargarCarpetaOrd();
                    }
                    pagar.dispose();
                }
            }
        });
         pagar.setVisible(true);
    }//GEN-LAST:event_BtnPagarActionPerformed

    private void BtnNachosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNachosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnNachosActionPerformed

    private void BtnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManagerActionPerformed
        // TODO add your handling code here:
        Manager manager = new Manager();
        manager.setVisible(true);
    }//GEN-LAST:event_BtnManagerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CrearOrden ord = new CrearOrden(ticket.ModificarCont(ContenidoDeTicket));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OrdenesCreadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenesCreadasMouseClicked
        // TODO add your handling code here:
        int index = OrdenesCreadas.getSelectedRow();
        if(index != -1){
            String path = "C://Users//adria//Documentos//NetBeansProjects//Sistema//Ord//" + modelo2.getValueAt(index,0);
            
            File arc = new File(path);
            
            List<String> lines = new ArrayList<>();
            try{
                Scanner scanner = new Scanner(arc);
                while (scanner.hasNextLine()) {
                    lines.add(scanner.nextLine());
                }
                modelo.setRowCount(0);
                
                for(String i : lines){
                    modelo.addRow(new Object[] {i});
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_OrdenesCreadasMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    
    //// METODOS CREADOS POR MI
    
    private void ActualizarTabla(boolean e){
        modelo.setRowCount(0);
        if(e){
            for(String inf : ticket.ModificarCont(ContenidoDeTicket)){
                modelo.addRow(new Object[]{inf});
            }
        }
        else { 
            for(String inf : ContenidoDeTicket){
                modelo.addRow(new Object[]{inf});
            }
        }
        AgregarSubTotal(ticket.ObtenerTotal());
        AgregarPendienteDePago(ticket.ObtenerTotal());
    }
    
    private void AgregarSubTotal(String Total){
        modelo.addRow(new Object[] {"Sub Total: " + Total});
    }
    
    private void AgregarPendienteDePago(String Total){
        modelo.addRow(new Object[] {"Pendiente de Pago: " + Total});
    }
    
    private void CargarCarpetaOrd(){
        String carpetaPath = "C://Users//adria//Documentos//NetBeansProjects//Sistema//Ord";

        File carpeta = new File(carpetaPath);
        modelo2.setRowCount(0);
        if (carpeta.isDirectory()) {
            
            File[] archivos = carpeta.listFiles();

            for (File archivo : archivos) {
                modelo2.addRow(new Object[] {archivo.getName()});
            }
        } else {
            System.out.println("La ruta especificada no corresponde a una carpeta.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBebidas1;
    private javax.swing.JButton BtnBloodyMary;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnCoctel;
    private javax.swing.JButton BtnGinTonic;
    private javax.swing.JButton BtnManager;
    private javax.swing.JButton BtnMojitos;
    private javax.swing.JButton BtnNachos;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JButton BtnPinaColada;
    private javax.swing.JButton BtnPlatos;
    private javax.swing.JButton BtnSandB;
    private javax.swing.JButton BtnTonColins;
    private javax.swing.JTable OrdenesCreadas;
    private javax.swing.JPanel PanelBebidas;
    private javax.swing.JPanel PanelOrdenesCanceladas;
    private javax.swing.JPanel PanelPlatos;
    private javax.swing.JRadioButton SeparadorBtn;
    private javax.swing.JTable TablaTicket;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
