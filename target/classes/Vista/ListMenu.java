/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.EventMenuSelected;
import Modelo.Modelo_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class ListMenu<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
    }
    
    
    public ListMenu(){
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                if(SwingUtilities.isLeftMouseButton(me)){
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    
                    if(o instanceof Modelo_Menu){
                        Modelo_Menu menu = (Modelo_Menu)o;
                        
                        if(menu.getType() == Modelo_Menu.MenuType.MENU){
                            selectedIndex = index;
                            if(event!=null){
                                event.selected(index);
                            }
                        }
                    }
                    else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
        
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus){
                
                Modelo_Menu data;
                
                if(o instanceof Modelo_Menu){
                    data = (Modelo_Menu) o;
                }
                else {
                    data = new Modelo_Menu("", o + "", Modelo_Menu.MenuType.EMPTY);
                }
                
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                
                
                
                return item;
            }
        };
    }

    public void addItem(Modelo_Menu data){
        model.addElement(data);
    }
}
