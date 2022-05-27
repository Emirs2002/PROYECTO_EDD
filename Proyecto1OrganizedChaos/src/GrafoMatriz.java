/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author simon
 */
public class GrafoMatriz {
    private boolean dirigido; // Indica si es dirigido o no.
    private int maxNodos; // Tamaño máximo de la tabla.
    private int numVertices; // Número de vértices del grafo.
    private boolean matrizAdy [ ] [ ]; // Matriz de adyacencias del grafo.

    public GrafoMatriz(boolean dirigido, int n) {
        this.dirigido = dirigido;
        this.maxNodos = n;
        this.numVertices = 0;
        this.matrizAdy = new boolean [n][n];
    }
    
    public void insertaArista (int i, int j) {
    matrizAdy [i] [j] = true;
    if (!dirigido)
    matrizAdy [j] [i] = matrizAdy [i] [j];
    }
    
    public void eliminarArista (int i, int j) {
    matrizAdy [i] [j] = false;
    if (!dirigido)
    matrizAdy [j] [i] = false;
    }
    public void insertaVertice (int n) {
    if ( n > maxNodos - numVertices )
    System.out.println ("Error, se supera el número máximo de nodos");
    else {
    for (int i=0; i < numVertices + n; i++) {
    for (int j = numVertices; j < numVertices + n; j++)
    matrizAdy [i] [j] = matrizAdy [j] [i] = false;
    }
    numVertices = numVertices + n;
}
}
    public int gradoIn(int j) {
    int gIn = 0;
    for (int i = 0; i < numVertices; i++) //recorrido por filas
    if (matrizAdy [i] [j])
    gIn++; //manteniendo la posición de la columna en [j]
    return gIn;
}    
}
