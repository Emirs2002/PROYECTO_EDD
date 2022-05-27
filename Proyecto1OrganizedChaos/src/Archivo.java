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
    public GrafoMatriz armarGrafo(String dir, GrafoMatriz grafo){
        String texto="";
        try{
           
            BufferedReader bf = new BufferedReader(new FileReader(dir));
            
            String temp = "";
            String bfRead;
            
            while((bfRead = bf.readLine()) != null){//hacer clclo mientras bfRead tiene datos
                temp += bfRead;    
            }System.out.println(temp);
            String[] arr = temp.split(";");
            int cont = 0;
            
            for (int i=0; i < arr.length; i++) {
                System.out.println(arr[i]);
                System.out.println("llega1");
                if(!arr[i].equals("Rutas")) {
                    cont ++;   
                }
            }
            for (int j = cont; j < arr.length; j++) {
                System.out.println("llega2");
                String line = arr[j];
                String[] b = line.split(",");
                System.out.println(b[0]+b[1]+b[2]);         
            }
            return grafo;
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR, NO SE PUDO CREAR EL GRAFO");
        }
        return grafo;
    }    
}
