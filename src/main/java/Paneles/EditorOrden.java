/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;
import Controlador.Control;
import Controlador.Conexion;
import Modelo.VistaTicket;
import Vista.Main;
import static Vista.Main.ContenidoDeTicket;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.Ticket;
/**
 *
 * @author adria
 */
public class EditorOrden extends javax.swing.JPanel {
    
    DefaultTableModel model;
    Ticket ticket = Ticket.ObtenerInstancia();
    
    public EditorOrden() {
        initComponents();
        Control.closeAll();
        model = (DefaultTableModel) TablaTicket.getModel();
        CargarContenido();
        Controlador.Control.EliminarTicketFrame();
    }
    
    private void CargarContenido(){
        if(!isEmpty()){
            ActualizarTabla();
        }
        else {
            JOptionPane.showMessageDialog(null, "La orden esta vacia!", "Warning!!", JOptionPane.WARNING_MESSAGE);
            setVisible(false);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BtnBorrar = new javax.swing.JButton();
        BtnBorrarTodo = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        BtnBorrar.setText("BORRAR");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarTodoActionPerformed(evt);
            }
        });

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        jButton2.setText("CERRAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnBorrarTodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnBorrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarTodoActionPerformed
        // TODO add your handling code here:
        Main.ContenidoDeTicket.clear();
        Conexion.Total = 0;
        limpiarTabla();
        repaint();
    }//GEN-LAST:event_BtnBorrarTodoActionPerformed
    
    public void limpiarTabla(){
        try {
            model.setRowCount(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        try{
            Eliminar();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnAgregarActionPerformed
    
    private boolean isEmpty(){
        return Main.ContenidoDeTicket.isEmpty()? true : false;
    }
    
    private void Eliminar(){
        List<String> Eliminar = new ArrayList<>();
        String DatoABuscar = Mod(getValue());
        
        for(String s: ContenidoDeTicket){
            if(!s.contains(DatoABuscar)) Eliminar.add(s);   
        }
        ContenidoDeTicket = Eliminar;
        Control.closeAll();
        ActualizarTabla();
        repaint();
    }
    
    private String Mod(String s){
        String[] arr = s.split(" ");
        JOptionPane.showMessageDialog(null,s);
        Conexion.Total -= Double.parseDouble(arr[1]);
        if(Conexion.Total < 0) Conexion.Total=0;
        DecimalFormat df = new DecimalFormat("#.00");
        return arr[0];
    }
    
    private String getValue(){
        try{
            int index = TablaTicket.getSelectedRow();
            String value = String.valueOf(model.getValueAt(index, 0));
            model.removeRow(index);
            return value;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nVERIFIQUE QUE SELECCIONO UNA FILA DEL TICKET", "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
        return "";
    }
    
    private void ActualizarTabla(){
        
        model.setRowCount(0);
        if(true){
            for(String inf : ticket.ModificarCont(ContenidoDeTicket)){
                model.addRow(new Object[]{inf});
            }
        }
        else { 
            for(String inf : ContenidoDeTicket){
                model.addRow(new Object[]{inf});
            }
        }
        
        AgregarSubTotal(ticket.ObtenerTotal());
        AgregarPendienteDePago(ticket.ObtenerTotal());
        
    }
    private void AgregarSubTotal(String Total){
        model.addRow(new Object[] {"Sub Total: " + Total});
    }
    
    private void AgregarPendienteDePago(String Total){
        model.addRow(new Object[] {"Pendiente de Pago: " + Total});
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnBorrarTodo;
    private javax.swing.JTable TablaTicket;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
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
