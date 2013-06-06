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

        setText(value.toString());
        try {
            int colour = Main.controller.unaryListModel.getElementAt(index).toString().hashCode();
//            int colour = Main
            if (colour > -1) {
                if (index == 0) {
                    setForeground(new Color(colour));
                } else if (index == 1) {
                    setForeground(new Color(colour));
                } else if (index == 2) {
                    setForeground(new Color(colour));
                } else if (index == 3) {
                    setForeground(new Color(colour));
                } else if (index == 4) {
                    setForeground(new Color(colour));
                } else if (index == 5) {
                    setForeground(new Color(colour));
                } else {
                    setForeground(new Color(colour));
                }
            }
        } catch (Exception e) {
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
