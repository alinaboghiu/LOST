package GUI;

import Tree.Const;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import javax.swing.JPanel;
import Tree.Term;
import Tree.UnaryRel;
import java.awt.Color;

public class JStructure extends JPanel {

//    private static final long serialVersionUID = -2707712944901661771L;

    public JStructure() {

        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try {
//            Object v1 = graph.insertVertex(parent, null, "Hello", 100, 20, 20,
//                    30);
//            Object v2 = graph.insertVertex(parent, null, "World!", 240, 150,
//                    80, 30);
            

        Object[] objects = new Object[3];
        int i=0;
        for (Term t : Main.activeStruct.terms) {
//            t.blob = new Blob(200);
//            if (t instanceof Const) {
//                t.blob.setText(t.name);
//                t.blob.setBounds(10, 10, t.name.length() * 10, 40);
//            } else {
//                t.blob.setBounds(10, 10, 30, 30);
//            }
            objects[i] = graph.insertVertex(parent, null, t.name, 100*i, 100*i, 50, 50);
            i++;
//            System.out.print("widht: " + StructurePanel.);
        }
        graph.insertEdge(parent, null, "Edge", objects[1], objects[2]);
//        for (UnaryRel r : Main.activeStruct.unaryRels) {
//            r.arg.blob.setBackground(Color.red);
//        }
        
        } finally {
            graph.getModel().endUpdate();
        }
        
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        this.add(graphComponent);
    }

}