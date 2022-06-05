
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
/**
 *
 * @author simon
 */
public class Archivo {
    
    /**
    *
    * @author ERodriguez
    * @version 02/06/2022
    * @return devuelve el grafo con la información del archivo txt
    */
    public GrafoMAdy armarGrafo(String dir){
        GrafoMAdy grafo = null;
       
        
        try{
                      
            BufferedReader bf = new BufferedReader(new FileReader(dir));
            
            String temp = "";
            String bfRead;
            
            while((bfRead = bf.readLine()) != null){//hacer ciclo mientras bfRead tiene datos
                temp += bfRead;    
            }
            
             bf.close();
            
            String[] arr = temp.split(";");             
            int cont = 0; //Contador para pasar a rutas
            String noms = ""; //string que contendrá los nombres de los almacenes
            
            for (int i=1; i < arr.length; i++) {
                if(!arr[i].equals("Rutas")) {
                    
                    char a = (arr[i].charAt(8)); 
                    noms += Character.toString(a);
                    cont ++;   
                }
                else{
                    break;
                }
                      
            }
            
            
            /*
            *Crear grafo a partir de la cantidad de almacenes. Se le resta 2
            *porque "Almacenes" y "Rutas" no cuentan.
            */
            
            grafo = new GrafoMAdy(cont);
            
            //Crear los vértices con los nombres de los almacenes
            for(int i = 0; i< noms.length(); i++){
                char nombre = noms.charAt(i);
                grafo.crearVertice(Character.toString(nombre));
            }
            
            
            //Asignar aristas
           
            String rutas = arr[cont+2]; //se toma todo el string con las rutas
            
            String[] rout = rutas.split(","); //se separan las rutas
            int j = 0;
            do{
                if(j == 0){
                    
                    int position = (rout[j+2].length())-1;
                    String subrout = rout[j+2].substring(0, position); //Esto es para eliminar la letra que acompaña al número                 
                    grafo.crearArista(rout[j], rout[j+1], Integer.parseInt(subrout));
                
                    j+=2;
                }
                else if(j+2 == rout.length-1){
                    int position1 = (rout[j].length())-1;
                    char subrout1 = rout[j].charAt(position1);
                   
                    grafo.crearArista(Character.toString(subrout1), rout[j+1], Integer.parseInt(rout[j+2]));
                    
                    j+=2;
                }
                else{                    
                    
                    int position1 = (rout[j].length())-1;
                    char subrout1 = rout[j].charAt(position1); //Tomar únicamente la letra 
                   
                    int position2 = (rout[j+2].length())-1;
                    String subrout2 = rout[j+2].substring(0, position2);
                    
                    grafo.crearArista(Character.toString(subrout1), rout[j+1], Integer.parseInt(subrout2));
                    
                    j+=2;
                }
            }while(j+2 <= (rout.length));
            
            
            //CREAR LISTAS DE PRODUCTOS E INSERTARLAS EN LOS VÉRTICES
            
           
            int index = -2;
            
            BufferedReader bf2 = new BufferedReader(new FileReader(dir));
            
            
            while(!(bfRead = bf2.readLine()).equals("Rutas;")){
                Vertice[] verts = grafo.getVerts();                
                
                
                if(bfRead.contains("Almacen")){
                    index++;
                }
                else{
                    if(bfRead.contains(";")){
                        String replace = bfRead.replace(";", "");
                    
                        String[] productoList = replace.split(",");

                        Producto product = new Producto(productoList[0], Integer.parseInt(productoList[1]));                    

                        if((verts[index].getProductos()).isEmpty()){
                            Lista lista = new Lista();
                            Nodo nodito = new Nodo(product);
                            lista.addAtEnd(nodito);
                            verts[index].setProductos(lista);
                        }
                        else{
                            Lista lista = verts[index].getProductos();
                            Nodo nodito = new Nodo(product);
                            lista.addAtEnd(nodito);
                            verts[index].setProductos(lista);
                            }
                    
                        }
                    else{
                        String[] productoList = bfRead.split(",");
                   
                        Producto product = new Producto(productoList[0], Integer.parseInt(productoList[1]));                    

                        if((verts[index].getProductos()).isEmpty()){
                            Lista lista = new Lista();
                            Nodo nodito = new Nodo(product);
                            lista.addAtEnd(nodito);
                            verts[index].setProductos(lista);
                        }
                        else{
                            Lista lista = verts[index].getProductos();
                            Nodo nodito = new Nodo(product);
                            lista.addAtEnd(nodito);
                            verts[index].setProductos(lista);
                        }
                    }
    
                    
                }
                
            }
            
            bf2.close();
            
            return grafo;
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR, NO SE PUDO CREAR EL GRAFO");
            return null;
        }
       
    }    
}
