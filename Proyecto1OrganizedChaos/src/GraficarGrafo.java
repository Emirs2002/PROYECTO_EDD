
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simon
 */
public class GraficarGrafo {
        Archivo a = new Archivo();
        GrafoMAdy grafo = a.armarGrafo("test\\amazon.txt");
        Lista almacenes = new Lista();
        public void mostrar() {
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Almacenes");
        Archivo a = new Archivo();
        GrafoMAdy grafo = a.armarGrafo("test\\amazon.txt");
        grafo.getVerts();
        graph.setStrict(false);
        graph.setAutoCreate(true);
        graph.display();
        
        graph.setAutoCreate(true);
        graph.setAttribute("ui.quality");
        graph.setAttribute("ui.antialias");
        graph.setAttribute("ui.stylesheet", "node { size-mode: fit; shape:box;fill-color: white;  stroke-mode: plain; padding: 4px, 3px; }edge { arrow-shape: arrow; size: 2px; fill-color: #444; }");
        
        graph.addNode(grafo.getVerts()[0].getNombre());
        graph.addNode(grafo.getVerts()[1].getNombre());
        graph.addNode(grafo.getVerts()[2].getNombre());
        graph.addNode(grafo.getVerts()[3].getNombre());
        graph.addNode(grafo.getVerts()[4].getNombre());
        graph.addEdge(grafo.getVerts()[0].getNombre()+grafo.getVerts()[1].getNombre(), grafo.getVerts()[0].getNombre(), grafo.getVerts()[1].getNombre(), true);
        graph.addEdge(grafo.getVerts()[0].getNombre()+grafo.getVerts()[2].getNombre(), grafo.getVerts()[0].getNombre(), grafo.getVerts()[2].getNombre(), true);
        graph.addEdge(grafo.getVerts()[4].getNombre()+grafo.getVerts()[0].getNombre(), grafo.getVerts()[4].getNombre(), grafo.getVerts()[0].getNombre(), true);  
        graph.addEdge(grafo.getVerts()[1].getNombre()+grafo.getVerts()[2].getNombre(), grafo.getVerts()[1].getNombre(), grafo.getVerts()[2].getNombre(), true); 
        graph.addEdge(grafo.getVerts()[1].getNombre()+grafo.getVerts()[3].getNombre(), grafo.getVerts()[1].getNombre(), grafo.getVerts()[3].getNombre(), true);
        graph.addEdge(grafo.getVerts()[3].getNombre()+grafo.getVerts()[4].getNombre(), grafo.getVerts()[3].getNombre(), grafo.getVerts()[4].getNombre(),true);
        graph.addEdge(grafo.getVerts()[2].getNombre()+grafo.getVerts()[3].getNombre(), grafo.getVerts()[2].getNombre(), grafo.getVerts()[3].getNombre(),true); 
        graph.addEdge(grafo.getVerts()[2].getNombre()+grafo.getVerts()[4].getNombre(), grafo.getVerts()[2].getNombre(), grafo.getVerts()[4].getNombre(),true); 
        for(Node node : graph){
            node.setAttribute("ui.label", node.getId());
            }
        
        
        }
    
}
