/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alesc
 * version: 03/06/22
 * 
 */
public class RutaMinima {
    
    int [][] matriz; //matriz de adyaciencias.
    int pivote; //peso que se acarrea.
    int [] rutaFinal; //lista del peso minimo de cada ruta desde el origen.
    int o; //verice origen
    int n; //numero de vertices 
    int [] hilera; //lista para iterar sobre la matriz de adyaciencias.
    int infinito;
    
    
    //CONSTRUCTOR:
    public RutaMinima(GrafoMAdy grafo, Vertice x)
    { 
        matriz = grafo.getmatAdy();
        n = grafo.getNumVerts();
        pivote = grafo.tamanho();
        infinito = grafo.tamanho();//EL TAMANHO VA A FUNCIONAR COMO NUESTRO INFINITO
        o = x.getIndex();
        
        for(int i = 0; i < n; i++) //AQUI SE CAMBIAN TODOS LOS CEROS DE LA MATRIZ POR EL TAMANHO DEL GRAFO.
        {
                for(int j = 0; j<n; j++)
                {
                    if(matriz[i][j] == 0)
                    {
                        matriz[i][j] = pivote;
                    }
                }
        }

        rutaFinal = matriz[o]; //SELECCIONA LA FILA DE LA MATRIZ DEL VERTICE ORIGEN.
        rutaFinal[o] = 0; //DECLARA EL PESO DEL ORIGEN AL ORIGEN EN CERO.
        hilera = matriz[0]; //TOMA LA PRIMERA FILA DE LA MATRIZ PARA ITERAR CON HILERA.
        
    }
    
    
    public void conseguirRuta()
    {
        for(int contador = 0; contador<n; contador++)  //ESTE CONTADOR SE UTILIZARA PARA CAMBIAR LA FILA DE LA MATRIZ CONFORME SE AVANCE
        {       
        hilera = matriz[contador];
            if(rutaFinal[contador]!= infinito) //SI EL ELEMENTO DE LA FILA DEL VETICE DE ORIGEN NO ES INFINITO (tamanho) ES SELECCIONADO COMO PIVOTE.
                {
                    pivote = rutaFinal[contador]; 
                    
                    for(int x = 0; x<n; x++) //COMPARA CADA ELEMENTO DE LA RUTAFINAL CON LA SUMA DEL PIVOTE QUE SE ACARREA CON LA HILERA.
                    {       
                        if(pivote + hilera[x] < rutaFinal[x]) 
                        {
                            rutaFinal[x] = pivote + hilera[x]; 
                        }
                    }
                }    
        }
            
        for(int i =0; i<n; i++)
        {
            System.out.println(o + " to " + i +" = "+rutaFinal[i]);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
        

        
        

