/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author simon
 */
public class CrearGrafoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrafoMatriz grafo = new GrafoMatriz(false, 10);
        grafo.insertaArista(5, 5);
        grafo.insertaVertice(6);
        grafo.gradoIn(6);
        Archivo a = new Archivo();
        a.armarGrafo("C:\\Users\\simon\\OneDrive\\Documentos\\Simon Folder\\Trimestre 9\\EDD\\proyecto1.txt", grafo);
    }
    
}
