/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.io.Serializable;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author alina
 */
public class Arrow extends JLabel implements Serializable {

    Blob from, to;
    Point f, t;
    Line2D.Double line;
    Arc2D.Double arc;
    Polygon arrowHead;
//    Color relColour;
    DefaultListModel menuModel = new DefaultListModel();
    protected JList menu = new JList(menuModel);

    Arrow() {
    }

    public void addRelation(String name) {
        if (!menuModel.contains(name)) {
            int i = 0;
            try {
                while (menuModel.getElementAt(i).toString().length() > name.length()) {
                    i++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
            menuModel.add(i, name);
        }
//        JMenuItem item = new JMenuItem(name);
//        item.setForeground(colour);
//        item.addAction 
    }

    public Arrow(Blob from, Blob to, String name) {
        super();
        this.from = from;
        this.to = to;
        menuModel.addElement(name);

        setBounds(5, 5, 5555, 5555);
//        to.arrowsIn++;
//        this.relColour = colour;
//        addMouseListener(new PopupTriggerListener());
//        menu.setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        f = from.getLocation();
        t = to.getLocation();
//        relations.getCellRenderer().getListCellRendererComponent(relations, ui, TOP, true, true);
        if (from.equals(to)) {
            drawArc((Graphics2D) g);
            menu.setBounds(t.x + (int) arc.height, t.y + (int) arc.height, menuModel.get(0).toString().length() * 11 + 5, menuModel.size() * 20);
        } else {
            drawLine((Graphics2D) g);
            menu.setBounds(((f.x + t.x) / 2 + t.x) / 2, ((f.y + t.y) / 2 + t.y) / 2 + 20, menuModel.get(0).toString().length() * 11, menuModel.size() * 20);
        }
        Graphics2D arrowGraphics = (Graphics2D) g.create();
        drawArrowHeads(arrowGraphics);
        menu.setBackground(getParent().getBackground());
        add(menu);
        repaint();
    }

    private void drawArc(Graphics2D g2d) {
        arc = new Arc2D.Double();
        int w = from.getWidth();
        int h = from.getHeight();
        arc.setArcByCenter(f.x + w, f.y + h, h / 2, 360, 360, Arc2D.OPEN);
        g2d.draw(arc);

    }

    public void drawLine(Graphics2D g2d) {
        line = new Line2D.Double();
        f.translate(from.getWidth() / 6, from.getHeight() / 6);
        t.translate(to.getWidth() / 2, to.getHeight() / 2);
        line.setLine(f, t);
        g2d.draw(line);
    }

    private void drawArrowHeads(Graphics2D g2d) {
//         d = new Distance(t, f);
        int[] xs = {0, 5, 5};
        int[] ys = {0, 5, -5};
        arrowHead = new Polygon(xs, ys, 3);
        if (line == null) {
            g2d.translate((int) (t.x + to.getWidth() - 7),
                    (int) (t.y + to.getHeight() * 1.6 / 3));
        } else {
            g2d.translate((int) ((t.x + f.x) / 2 + t.x) / 2,
                    (int) ((t.y + f.y) / 2 + t.y) / 2);
        }
        g2d.rotate(Math.atan2(f.y - t.y, f.x - t.x));
//        g2d.setColor(relColour);
        g2d.fill(arrowHead);
    }
//    class PopupTriggerListener extends MouseAdapter {
//
//        @Override
//        public void mousePressed(MouseEvent ev) {
//            Point click = new Point(ev.getX(), ev.getY());
//            Boolean b = line != null && line.getBounds().contains(click);
//            Boolean c = arc != null && arc.getBounds().contains(click);
//            if (ev.isPopupTrigger() && (b || c) ) {
//                menu.show(ev.getComponent(), ev.getX(), ev.getY());
//            }
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent ev) {
//            if (ev.isPopupTrigger()) {
//                menu.show(ev.getComponent(), ev.getX(), ev.getY());
//            }
//        }
//
//        @Override
//        public void mouseClicked(MouseEvent ev) {
//        }
//    }
}
