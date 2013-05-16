/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Tree.Const;
import Tree.Term;
import java.awt.Color;
import java.awt.Label;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Blob extends JLabel {

    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;
    JPopupMenu menu = new JPopupMenu("Popup");

    public Blob(final int limit) {
        setHorizontalAlignment(SwingConstants.CENTER);
        setBackground(Color.GRAY);
        setOpaque(true);

        addMouseListener(new PopupTriggerListener());
         JMenuItem item = new JMenuItem("Test1");
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Menu item Test1");
      }

//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                throw new UnsupportedOperationException("Not supported yet.");
//            }
    });
    menu.add(item);

    item = new JMenuItem("Test2");
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Menu item Test2");
      }
    });
    menu.add(item);
        

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();
                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = (e.getXOnScreen() - screenX);
                int deltaY = (e.getYOnScreen() - screenY);
                setLocation(myX + deltaX, myY + deltaY);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
    }

    class PopupTriggerListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent ev) {
            if (ev.isPopupTrigger()) {
                menu.show(ev.getComponent(), ev.getX(), ev.getY());
            }
        }

        @Override
        public void mouseReleased(MouseEvent ev) {
            if (ev.isPopupTrigger()) {
                menu.show(ev.getComponent(), ev.getX(), ev.getY());
            }
        }

        @Override
        public void mouseClicked(MouseEvent ev) {
        }
    }
}
