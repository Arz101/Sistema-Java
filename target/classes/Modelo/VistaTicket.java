/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import static Vista.Main.ContenidoDeTicket;
import Controlador.Ticket;
import javax.swing.table.DefaultTableModel;
import Controlador.Control;
import javax.swing.JOptionPane;
/**
 *
 * @author adrian
 */
public class VistaTicket extends javax.swing.JFrame {

    protected final DefaultTableModel modelo;
    private Ticket ticket = Ticket.ObtenerInstancia();
    private static VistaTicket instancia;
    private Conexion con = Conexion.Instancia();
    
    private VistaTicket() {
        initComponents();
        modelo = (DefaultTableModel) TablaTicket.getModel();
        modelo.addRow(new Object[]{"Sub Total: "});    
        ActualizarTabla(true);
        
        Control.RegistrarFrame(this); 
        RegistrarFrame();
    }
        
    protected VistaTicket(String value) {
        modelo = (DefaultTableModel) TablaTicket.getModel();
        Control.RegistrarFrame(this); 
    }
    
    public void RegistrarFrame(){
          Control.RegistrarTicket(this);
    }
    
    
    public static VistaTicket Instancia(){
        if(instancia != null){
           Control.EliminarFrame(instancia);
           return instancia; 
        }
        return instancia = new VistaTicket();
    }
    
    public void ActualizarTabla(boolean e){
        
        modelo.setRowCount(0);
        if(true){
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
    
    public void ActualizarTabla(String XD){
        
        modelo.setRowCount(0);
        if(true){
            for(String inf : ticket.ModificarCont(ContenidoDeTicket)){
                modelo.addRow(new Object[]{inf});
            }
        }
        else { 
            for(String inf : ContenidoDeTicket){
                modelo.addRow(new Object[]{inf});
            }
        }
        
        AgregarSubTotalPendiente();
        AgregarPendienteDePagoPendiente();
        
    }
    
    private void AgregarSubTotal(String Total){
        modelo.addRow(new Object[] {"Sub Total: " + Total});
    }
    
    private void AgregarPendienteDePago(String Total){
        modelo.addRow(new Object[] {"Pendiente de Pago: " + Total});
    }
    
    private void AgregarSubTotalPendiente(){
        modelo.addRow(new Object[] {"Sub Total: " + Conexion.TotalPendiente});
    }
    
    private void AgregarPendienteDePagoPendiente(){
        modelo.addRow(new Object[] {"Pendiente de Pago: " + Conexion.TotalPendiente});
    }
    
    public static void closeTicket(){
        instancia = null;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTicket;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dispose(){
        Control.EliminarFrame(this);
        
        super.dispose();
    }
}
