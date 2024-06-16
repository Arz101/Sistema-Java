/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modelo;

import static Vista.Main.ContenidoDeTicket;
import Controlador.Ticket;
import javax.swing.table.DefaultTableModel;
import Controlador.Control;
/**
 *
 * @author adria
 */
public class VistaTicket extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private Ticket ticket = Ticket.ObtenerInstancia();
    private static VistaTicket instancia;
    
    private VistaTicket() {
        initComponents();
        modelo = (DefaultTableModel) TablaTicket.getModel();
        modelo.addRow(new Object[]{"Sub Total: "});    
        ActualizarTabla(true);
        
        Control.RegistrarFrame(this);
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
    
    
    public static void closeTicket(){
        instancia = null;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
