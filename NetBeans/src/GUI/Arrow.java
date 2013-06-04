/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author alina
 */
public class Arrow extends JLabel {

    Blob from, to;
    Point f, t;
    Line2D.Double line;
    Arc2D.Double arc;
    Polygon arrowHead;
    static JPopupMenu menu = new JPopupMenu();

    public static void addRelation(String name, Color colour) {
        JMenuItem item = new JMenuItem(name);
        item.setForeground(colour);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        menu.add(item);
    }

    public Arrow(Blob from, Blob to, String name, Color colour) {
        super();
        setHorizontalAlignment(CENTER);
        this.from = from;
        this.to = to;
        setBounds(5, 5, 5555, 5555);
//        addMouseListener(new PopupTriggerListener());
        menu.setOpaque(false);
        addRelation(name, colour);
    }

    @Override
    public void paintComponent(Graphics g) {
        f = from.getLocation();
        t = to.getLocation();

//        relations.setBounds((f.x+t.x)/2, (f.y+t.y)/2+20, 50, 50);
//        relations.setBackground(getParent().getBackground());
//        relations.getCellRenderer().getListCellRendererComponent(relations, ui, TOP, true, true);
//        add(relations);
        Graphics2D arrowGraphics = (Graphics2D) g.create();
        if (from.equals(to)) {
            drawArc((Graphics2D) g);
        } else {
            drawLine((Graphics2D) g);
        }
        drawArrowHead(arrowGraphics);
        repaint();
        super.paintComponent(g);
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
        f.translate(from.getWidth() / 2, from.getHeight() / 2);
        t.translate(to.getWidth() / 2, to.getHeight() / 2);
        line.setLine(f, t);
        g2d.draw(line);
    }

    private void drawArrowHead(Graphics2D g2d) {
//         d = new Distance(t, f);
        int[] xs = {0, 5, 5};
        int[] ys = {0, 5, -5};
        arrowHead = new Polygon(xs, ys, 3);
        if (line == null) {
            g2d.translate((int) t.x + to.getWidth()-7, (int) t.y + to.getHeight() * 1.6 / 3);
        } else {
            g2d.translate((int) ((t.x + f.x) / 2 + t.x) / 2, (int) ((t.y + f.y) / 2 + t.y) / 2);
        }
        g2d.rotate(Math.atan2(f.y - t.y, f.x - t.x));
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
