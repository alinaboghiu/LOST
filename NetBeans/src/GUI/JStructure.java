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

            Object[] objects = new Object[Main.activeStruct.terms.size()];
            
            int i = 0;
            for (Term t : Main.activeStruct.terms) {
                objects[i] = graph.insertVertex(parent, null, t.name, 100 * i, 100 * i, 50, 50);
                i++;
            }
            graph.insertEdge(parent, null, "Edge", objects[1], objects[2]);

        } finally {
            graph.getModel().endUpdate();
        }

        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        this.add(graphComponent);
    }
}