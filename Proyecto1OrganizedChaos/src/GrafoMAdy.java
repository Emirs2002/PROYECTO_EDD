
/**
 *
 * @author ERodríguez
 */
public class GrafoMAdy {
    //Número de vértices
    private int numVerts;
    
    //tamaño máximo de la matriz
    private int maxNodos;
    
    //Lista con los vértices
    //private Vertice[] verts;
    
    //Forma la matriz
    private int [][] matAdy;
    
    //Indica si es dirigido el grafo
    private boolean dirigido;

    
    public GrafoMAdy(boolean d){
        maxNodos = numVerts = 0;
        dirigido = d;
    }
            
    public GrafoMAdy(int num, int max, boolean d) {
        matAdy = new int [num][num];
        //verts = new Vertice[num];
        maxNodos = max;        
        numVerts = 0;
        dirigido = d;
    }

//Getters y Setters
    public int getNumVerts() {
        return numVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public int getMaxVerts() {
        return maxNodos;
    }

    public void setMaxVerts(int maxVerts) {
        this.maxNodos = maxVerts;
    }

    public boolean isDirigido() {
        return dirigido;
    }

    public void setDirigido(boolean dirigido) {
        this.dirigido = dirigido;
    }
    
    //MÉTODOS
    
    public boolean esVacio(){
        return this.numVerts == 0;
    }
    
//Aristas 
        
    public void crearArista(int u, int v, int peso){
        /*En el código lo marcan con true, creo recordar que Ale
        dijo que en este caso se pondría el peso, así que añadí ese paramétro.        
        */
        if(!this.esVacio()){
            matAdy[u][v] = peso; 
        }
        else{
            System.out.println("Error, grafo vacío");
        }
    }
    
    
    public void eliminarArista(int u, int v){
        try{
            if(!this.esVacio()){
            matAdy[u][v] = 0; 
        }
        else{
            System.out.println("Error, grafo vacío");
        }
            
        } catch(Exception e){
            System.out.println("Vértice no existe");
        }
    }
    
//Vértice
    
    public void crearVertice(int n){
        if(n > maxNodos){
            System.out.println("Error. Número de vértices superado");
        }
        else{
            for (int i = 0; i < numVerts + n; i++) {
                for (int j = 0; j < numVerts + n; j++) {
                    matAdy[i][j] = matAdy[j][i] = 0; 
                }
            }
            
            numVerts += n;
        }
    }
    
//Eliminar vértice no está y no tengo cabeza para pensar en eso ahora. Sorry
    
//Imprimir la matriz de adyacencia
    
    public void printMatriz(){
        System.out.printf("La matriz contiene %d vértices \n", numVerts);
        
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                
                if(matAdy[i][j] != 0){
                    System.out.print(matAdy[i][j]);
                }
                else{
                    System.out.println(0);
                }
            }
            
        }
    }
    
//Tamaño del grafo
    
    public int tamanho(){
        int tm = 0;
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                tm += matAdy[i][j];                
            }
            
        }
        return tm;
    }
    
//Grados
    
//Calcula el grado de entrada del vértice
    
    //Recorre las filas, teniendo la columna fija
    public int gradoEnt(int j){
        int gEnt = 0;
        for (int i = 0; i < numVerts; i++) {
                gEnt += matAdy[i][j]; 
            
        }
        return gEnt;
    }
//Calcula el grado de salida del vértice
    public int gradoSal(int i){
        int gSal = 0;
        for (int j = 0; j < numVerts; j++) {
            gSal += matAdy[i][j];
            
        }
        return gSal;
    }
    
}
