/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

public class Blob extends JLabel implements Serializable {

    private volatile int screenX = 0;
    private volatile int screenY = 0;
    protected volatile int myX = 0;
    protected volatile int myY = 0;
    JPopupMenu menu = new JPopupMenu("Popup");

    public Blob() {
//        addMouseListener(new PopupTriggerListener());
//        JMenuItem item = new JMenuItem("Delete");
//        item.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(this.getClass());
//                this.getParent();
//            }
//        });
//        menu.add(item);
//        item = new JMenuItem("Test2");
//        item.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Menu item Test2");
//            }
//        });
//        menu.add(item);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                e.getComponent().requestFocusInWindow();
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
                int newx = myX + deltaX;
                int newy = myY + deltaY;
                if (newx > getParent().getWidth() - e.getComponent().getWidth()) {
                    newx = getParent().getWidth() - e.getComponent().getWidth();
                }
                if (newy > getParent().getHeight() - 40) {
                    newy = getParent().getHeight() - 40;
                }
                if (newx < 5) {
                    newx = 5;
                }
                if (newy < 5) {
                    newy = 5;
                }
                setLocation(newx, newy);
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
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setHorizontalAlignment(SwingConstants.CENTER);
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 30, 30);
        super.paintComponent(g);
    }
}