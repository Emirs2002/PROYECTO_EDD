
/**
 *
 * @author alesc
 * version: 02/06/22
 * 
 */
public class RutaMinima {
    
    int [][] matriz; //matriz de adyaciencias.
    int [] vertices_visitados; //indices de vertices visitados.
    int minimo; //cifra que se pone en los vertices que no tienen ruta directa con origen.
    int sigVertice = 0; 
    int [] antVertices;
    int [] caminos; //peso minimo de cada ruta desde el origen.
    int o; //origen
    int n; //numero de vertices 
    
    public RutaMinima(GrafoMAdy grafo, Vertice x){
        matriz = grafo.getmatAdy();
        n = grafo.getNumVerts();
        vertices_visitados = new int[n];
        minimo = grafo.tamanho();
        antVertices = new int[n];
        o = x.getIndex();        
        
        
        
        for(int i = 0; i < n; i++){     //Aqui inicializa los valores de las listas y el grfo con los minimo
            vertices_visitados[i] = 0;
            for(int j = 0; j<n; j++){
                if(matriz[i][j] == 0){
                    matriz[i][j] = minimo;
                }
            }
        }
        
        caminos = matriz[o];
        vertices_visitados[o]=1;
        caminos[o] = 0;   
        
       
        // AQUI EMPIEZA LA BUSQUEDA:
        for(int i=0; i < n; i++){ 
         
            //consigue el minimo mas pequenho
            for(int j =0; j < n; j++){
                if(minimo>caminos[j] && (vertices_visitados[j]!=1)){
                    minimo = caminos[j];
                    sigVertice = j;  
                }
            }
        //CAMBIA EL VERTICE SIGUIENTE A LA PARTIDA EN VISITADOS A 1:
        vertices_visitados[sigVertice]=1;
        
        //CAMBIA EL PESO DEL CAMINO SI ESTE ES MENOR QUE LO QUE TIENE EN LA LISTA DE CAMINOS INICIAL:
        for(int k = 0; k<n; k++){
            if(vertices_visitados[k]!=1){
                if(matriz[sigVertice][k]<=caminos[k]){
                    caminos[k]= minimo + matriz[sigVertice][k];
                      
                    }
                
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("the shortest rout from "+o+" to "+i+" is "+caminos[i]);
        }
    }    
}
    
