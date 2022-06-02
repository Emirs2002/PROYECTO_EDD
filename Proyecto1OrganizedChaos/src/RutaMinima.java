/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alesc
 * version: 02/06/22
 * 
 */
public class RutaMinima {
    
    int [][] matriz; //matriz de adyaciencias.
    int [] vertices_visitados; //indices de vertices visitados.
    int minimos; //cifra que se pone en los vertices que no tienen ruta directa con origen.
    int sigVertice; 
    //int [] antVertices;
    int [] caminos; //peso minimo de cada ruta desde el origen.
    int o; //origen
    int n; //numero de vertices 
    
    public RutaMinima(GrafoMAdy grafo, Vertice x){
        matriz = grafo.getmatAdy();
        n = grafo.getNumVerts();
        vertices_visitados = new int[n];
        minimos = grafo.tamanho();
        o = x.getIndex();
        sigVertice = o;
        //System.out.println(x.getNombre());
        //System.out.println(n);
        
        
        for(int i = 0; i < n; i++){     //Aqui inicializa los valores de las listas y el grfo con los minimos
            vertices_visitados[i] = 0;
            for(int j = 0; j<n; j++){
                if(matriz[i][j] == 0){
                    matriz[i][j] = minimos;
                }
            }
        }
        
        caminos = matriz[o];
        vertices_visitados[o]=1;
        caminos[o] = 0;   
        
        for(int p =0; p<n ; p++){
            System.out.println(" ");
            for(int s=0; s<n; s++){
                System.out.print(matriz[p][s]);
            }      
        }
        
        // AQUI EMPIEZA LA BUSQUEDA:
        for(int i=0; i < n; i++){ 
          //impresion de prueba 
//        for(int d = 0; d<n; d++){
//            System.out.print(vertices_visitados[d]);
//        }
//            System.out.println(",,,,");
            //consigue el minimo mas pequenho
            for(int j =0; j < n; j++){
                if(minimos>caminos[j] && (vertices_visitados[j]!=1)){
                    minimos = caminos[j];
                    sigVertice = j;  
                }
            }
        //CAMBIA EL VERTICE SIGUIENTE A LA PARTIDA EN VISITADOS A 1:
        vertices_visitados[sigVertice]=1;
        //IMPRESION DE PRUEBA
//        for(int d = 0; d<n; d++){
//            System.out.print(caminos[d]);
//        }
//        System.out.println(",,,,");
//        System.out.println(minimos);
        //CAMBIA EL PESO DEL CAMINO SI ESTE ES MENOR QUE LO QUE TIENE EN LA LISTA DE CAMINOS INICIAL:
        for(int k = 0; k<n; k++){
            if(vertices_visitados[k]!=1){
                if(minimos + matriz[sigVertice][k]<caminos[k]){
                    caminos[k]= minimos + matriz[sigVertice][k];
                    vertices_visitados[k]=1;   
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("the shortest rout from "+o+" to "+i+" is "+caminos[i]);
        }
    }    
}
    
