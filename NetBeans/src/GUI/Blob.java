/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Tree.UnaryRel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

public class Blob extends JLabel implements Serializable {

    volatile int screenX = 0;
    volatile int screenY = 0;
    volatile int myX = 0;
    volatile int myY = 0;
    JPopupMenu menu = new JPopupMenu("Popup");
    ArrayList<Color> relColours = new ArrayList<>();
    int selectedAsArg = 0;

    public Blob() {
        super();
        setHorizontalAlignment(CENTER);
        setOpaque(true);
        addMouseListener(new PopupTriggerListener());
        JMenuItem item = new JMenuItem("Delete");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.controller.removeBlob(Blob.this);
            }
        });
        menu.add(item);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Main.chooseParamButton.getForeground().equals(Color.RED)){
                    Main.controller.buildNewBinRel(Blob.this);
                }
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
                int w = getParent().getWidth() - e.getComponent().getWidth() - 5;
                if (newx > w) {
                    newx = w;
                }
                int h = getParent().getHeight() - e.getComponent().getHeight() - 5;
                if (newy > h) {
                    newy = h;
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
                System.out.println(ev.getComponent());
            }
        }

        @Override
        public void mouseClicked(MouseEvent ev) {
        }
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        setHorizontalAlignment(SwingConstants.CENTER);
//        g.setColor(getBackground());
//        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
//        super.paintComponent(g);
//    }
}