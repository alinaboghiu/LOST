/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Tree.UnaryRel;
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

        if (index == index) {
            setForeground(new Color(getText().hashCode()));
        }

//        try {
//            String relName = Main.controller.unaryListModel.getElementAt(index).toString();
//            if (relName != null) {
//                Color colour = null;
//                for (UnaryRel r : Main.controller.activeStruct.unaryRels) {
//                    if (r.name.equals(relName)) {
//                        colour = r.colour;
//                    }
//                }

//                } else if (index == 1) {
//                    setForeground(colour);
//                } else if (index == 2) {
//                    setForeground(colour);
//                } else if (index == 3) {
//                    setForeground(colour);
//                } else if (index == 4) {
//                    setForeground(colour);
//                } else if (index == 5) {
//                    setForeground(colour);
//                } else {
//                    setForeground(colour);
//                }
//    }
//        } catch (Exception e) {
//        }

        if (cellHasFocus) {
            this.setFocusable(cellHasFocus);
            setBackground(Color.LIGHT_GRAY);
        } else {
            setBackground(null);
            setFocusable(false);
        }

        return this;
    }
}
