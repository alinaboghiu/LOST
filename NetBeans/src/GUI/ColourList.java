/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * @author alina
 *
 */
public class ColourList extends JLabel implements ListCellRenderer {

    public ColourList() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        // Assumes the stuff in the list has a pretty toString
        setText(value.toString());
        
        int i = index % 7;
        if (i == 0) {
            setForeground(Color.RED);
        }
        else if (i == 1) {
            setForeground(Color.ORANGE);
        }
        else if (i == 2) {
            setForeground(Color.YELLOW);
        }
        else if (i == 3) {
            setForeground(Color.GREEN);
        }
        else if (i == 4) {
            setForeground(Color.BLUE);
        }
        else if (i == 5) {
            setForeground(Color.MAGENTA);
        }
        else {
            setForeground(Color.PINK);
        }
        
        if (isSelected) {
            this.setFocusable(isSelected);
            setBackground(Color.LIGHT_GRAY);
        } else {
            setFocusable(false);
        }
     
        return this;
    }
}
