package Paneles;

import Controlador.Conexion;
import Controlador.Dir;
import Reporte.*;
import Modelo.VistaTicket;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class Inicio extends javax.swing.JPanel {
    DefaultTableModel model;
    private String user;
    private String key;
    private Conexion sql = Conexion.Instancia();
    
    public Inicio() {
        initComponents();
        model = (DefaultTableModel) TablaTicket.getModel();
        CargarCarpetaDeOrdenens();
 
    }
    
    
    private void CargarCarpetaDeOrdenens(){
        for(var i : Dir.retornarArchivosEnCarpetaOrdenes()){
            model.addRow(new Object[] {i});
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTicket = new javax.swing.JTable();
        BtnAbrir = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        BtnReporte = new javax.swing.JButton();
        BtnAnular = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();

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

        BtnAbrir.setText("ABRIR");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        BtnImprimir.setText("REIMP");
        BtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirActionPerformed(evt);
            }
        });

        BtnReporte.setBackground(new java.awt.Color(0, 0, 0));
        BtnReporte.setText("GENERAR REPORTE");
        BtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteActionPerformed(evt);
            }
        });

        BtnAnular.setBackground(new java.awt.Color(255, 0, 51));
        BtnAnular.setText("ANULAR");
        BtnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnularActionPerformed(evt);
            }
        });

        BtnIniciar.setText("INICIAR DIA");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(BtnAnular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnAnular, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(BtnImprimir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAbrir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        String ticket = JOptionPane.showInputDialog(null, "Ingrese numero de Ticket: ", "Ticket", JOptionPane.WARNING_MESSAGE);
        
        new AbrirOrd(sql.getOrder(Integer.parseInt(ticket)));
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirActionPerformed
        int index = TablaTicket.getSelectedRow();
        String value = (String) model.getValueAt(index, 0);
       
        new Controlador.Imprimir(value);
    }//GEN-LAST:event_BtnImprimirActionPerformed

    private void BtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteActionPerformed
        // TODO add your handling code here:
        Get get = new Get();
        JOptionPane.showMessageDialog(null, get, "", JOptionPane.INFORMATION_MESSAGE);
        
        JReporte jReporte = new JReporte(get.getFechaInicio(), get.getFechaFinal());
        jReporte.setVisible(true);
    }//GEN-LAST:event_BtnReporteActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        // TODO add your handling code here:
        AbrirOrd.IniciarDia();
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnularActionPerformed
        // TODO add your handling code here:
        AbrirOrd.AnularOrden();        
    }//GEN-LAST:event_BtnAnularActionPerformed
    
    public class AbrirOrd extends VistaTicket{
        private List<String> value;
        private static Conexion sql = Conexion.Instancia();
        
        public AbrirOrd(List<String> value){
            super("a");
            this.value = value;
            this.ActualizarTabla();
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        
        private final void ActualizarTabla(){
            for(var s : value){
                modelo.addRow(new Object[] {s});
            }
            repaint();
        }
        
        public static void AnularOrden(){
            if(sql.IniciarSesion(InicioSesion())){
                new Anulacion().setVisible(true);
            }else JOptionPane.showMessageDialog(null, "usuario o contraseña incorrectos", "", JOptionPane.WARNING_MESSAGE);

        }
        
        public static void IniciarDia(){
            String user = JOptionPane.showInputDialog(null, "NOT: ", "", JOptionPane.WARNING_MESSAGE);
            if(user.equals("admin")){
                String password = new String(getPasswords());
                
                if(password.equals("12345")){
                }
                else JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "", JOptionPane.ERROR_MESSAGE);

            }
            else JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "", JOptionPane.ERROR_MESSAGE);
        }
        
        
        private static char [] getPasswords(){
            JPanel panel = new JPanel();
            JLabel label = new JLabel("Enter a password:");
            JPasswordField pass = new JPasswordField(10);
            panel.add(label);
            panel.add(pass);
            String[] options = new String[]{"OK", "Cancel"};
            int option = JOptionPane.showOptionDialog(null, panel, "",
                         JOptionPane.NO_OPTION, JOptionPane.WARNING_MESSAGE,
                         null, options, options[1]);
            if(option == 0) // pressing OK button
            {
                char[] password = pass.getPassword();
                return password;
            }
            else return new char[0];
        }
    }
    
    public static Object[] InicioSesion(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("User: ");
        JTextField userField = new JTextField(10);
        JLabel label2 = new JLabel("Password: ");
        JPasswordField pass = new JPasswordField(10);

        panel.add(label);
        panel.add(userField);
        panel.add(label2);
        panel.add(pass);
        Object[] options = {"YES", "CANCEL"};
        inicioSesionPanel ins = new inicioSesionPanel();
        var index = JOptionPane.showOptionDialog(null, ins, "", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(index == 0){
            return new Object[] {ins.getUser(), ins.getPass()};
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnAnular;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnReporte;
    private javax.swing.JTable TablaTicket;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
