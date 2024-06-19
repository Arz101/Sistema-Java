/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Controlador.Control;
//import Controlador.CrearOrden;
import Controlador.GuardarOrden;
import Modelo.Conexion;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import Controlador.Ticket;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import Modelo.VistaTicket;
/**
 *
 * @author adria
 */
public class Pagar extends javax.swing.JFrame {
    
    private List<String> PagarCuenta;
    private DefaultTableModel modelo;
    private Ticket ticket = Ticket.ObtenerInstancia();
    
    public Pagar(List<String> PagarCuenta) {
        VistaTicket.closeTicket();
        initComponents();
        this.PagarCuenta = PagarCuenta;
        modelo = (DefaultTableModel) TicketPagar.getModel();
        Load_Cont();
        Control.RegistrarPagar(this);
        Control.RegistrarFrame(this);
        Control.closeAll();
    }
    @SuppressWarnings("/*unchecked*/")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IngresarTotalAPagar = new javax.swing.JPanel();
        Btn2 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnPagar = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        LabelTotal = new javax.swing.JLabel();
        BtnPunto = new javax.swing.JButton();
        BtnPunto1 = new javax.swing.JButton();
        BtnPunto2 = new javax.swing.JButton();
        BtnPunto3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TicketPagar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        IngresarTotalAPagar.setBackground(new java.awt.Color(204, 204, 204));
        IngresarTotalAPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnPagar.setText("PAGAR");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });

        jButton12.setText("CANCELAR");

        BtnBorrar.setText("BORRAR");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        LabelTotal.setFont(new java.awt.Font("Fixedsys Excelsior 3.01", 0, 18)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(0, 0, 0));

        BtnPunto.setText(".");
        BtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntoActionPerformed(evt);
            }
        });

        BtnPunto1.setText("5.00");
        BtnPunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPunto1ActionPerformed(evt);
            }
        });

        BtnPunto2.setText("10.00");
        BtnPunto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPunto2ActionPerformed(evt);
            }
        });

        BtnPunto3.setText("20.00");
        BtnPunto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPunto3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarTotalAPagarLayout = new javax.swing.GroupLayout(IngresarTotalAPagar);
        IngresarTotalAPagar.setLayout(IngresarTotalAPagarLayout);
        IngresarTotalAPagarLayout.setHorizontalGroup(
            IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                        .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPunto1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPunto2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPunto3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        IngresarTotalAPagarLayout.setVerticalGroup(
            IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarTotalAPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IngresarTotalAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPunto1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPunto2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPunto3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        TicketPagar.setBackground(new java.awt.Color(255, 255, 255));
        TicketPagar.setFont(new java.awt.Font("Fixedsys Excelsior 3.01", 0, 18)); // NOI18N
        TicketPagar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TicketPagar);
        if (TicketPagar.getColumnModel().getColumnCount() > 0) {
            TicketPagar.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresarTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(IngresarTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Load_Cont(){
        for(String val : PagarCuenta){
            modelo.addRow(new Object[]{val});
        }
        
        modelo.addRow(new Object[]{"Total: " + ticket.ObtenerTotal() });
        modelo.addRow(new Object[] {"Pendiente de Pago: " + ticket.ObtenerTotal()});
    }
    
    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "0");

    }//GEN-LAST:event_Btn0ActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText("");
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "4");

    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + "9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntoActionPerformed
        // TODO add your handling code here:
        LabelTotal.setText(LabelTotal.getText() + ".");
    }//GEN-LAST:event_BtnPuntoActionPerformed

    private void BtnPunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPunto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPunto1ActionPerformed

    private void BtnPunto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPunto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPunto2ActionPerformed

    private void BtnPunto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPunto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPunto3ActionPerformed

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed
        // TODO add your handling code here:
        accionDePago();
    }//GEN-LAST:event_BtnPagarActionPerformed
    
    private void accionDePago(){
        DecimalFormat df = new DecimalFormat("#.##");
        double total = 0;
        try{
            Main.ContenidoDeTicket.add("*******************************\n* Total a Pagar: " + df.format(Conexion.Total));
            double getPago = Double.parseDouble(LabelTotal.getText());
            Main.ContenidoDeTicket.add("Pago: " + getPago);
            if(getPago > Conexion.Total){
                total = (Conexion.Total-=getPago) * -1;
            }
            else total = Conexion.Total-=getPago;
                        JOptionPane.showMessageDialog(null, "Devolver: " + total, "...", JOptionPane.INFORMATION_MESSAGE);
            modelo.addRow(new Object[] {"Devuelto: " + String.valueOf(total)});
            
            /*
            if(Conexion.Total <= 0){
                CrearOrden ord = new CrearOrden(PagarCuenta);
                ord.NuevaOrden();
                Conexion.Total=0;
            }
            */
            if(Conexion.Total <= 0){
                Main.ContenidoDeTicket.add("Devuelto: " + df.format(total));
                GuardarOrden ord = new GuardarOrden(PagarCuenta);
                ord.GuardarOrden();
                Conexion.Total=0;
                Vista.Main.ContenidoDeTicket.clear();
                this.dispose();
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Entrada incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JButton BtnPunto;
    private javax.swing.JButton BtnPunto1;
    private javax.swing.JButton BtnPunto2;
    private javax.swing.JButton BtnPunto3;
    private javax.swing.JPanel IngresarTotalAPagar;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTable TicketPagar;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}

