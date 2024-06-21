
package Vista;

import Controlador.EventMenuSelected;
import Modelo.Modelo_Menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.GradientPaint;
/**
 *
 * @author adria
 */
public class Menu extends javax.swing.JPanel {
    
   //public ListMenu listMenu1 = new ListMenu();
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }
    
    private void init(){
        listMenu1.addItem(new Modelo_Menu("1", "COCTELES", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("2", "PLATOS", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("3", "ENTRADAS", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("4", "TEQUILA", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("7", "BOTELLAS", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("", "Pagos", Modelo_Menu.MenuType.TITTLE));
        
        listMenu1.addItem(new Modelo_Menu("5", "EFECTIVO", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("6", "TARJETA", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("", "Otros", Modelo_Menu.MenuType.TITTLE));
        listMenu1.addItem(new Modelo_Menu("9", "ABRIR NUEVA ORDEN", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("9", "ABRIR ORDEN PENDIENTE", Modelo_Menu.MenuType.MENU));
        listMenu1.addItem(new Modelo_Menu("9", "EDITAR ORDEN", Modelo_Menu.MenuType.MENU));

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new Vista.ListMenu<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerveza(1).png"))); // NOI18N
        jLabel1.setText("VIKINGOS");

        listMenu1.setOpaque(false);

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g){
        Graphics2D g2 =(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp=new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);   
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Vista.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
