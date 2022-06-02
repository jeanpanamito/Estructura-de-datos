/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author JEanpa
 */
public class MetFile {
      File archivo = new File("datos.txt");
    MetArray objArrays;
     public void llenarArreglo() {
        FileReader leer;
        String _cadena = "";
        int x [] = new int[10];
        BufferedReader almacenamiento;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            objArrays = new MetArray(10);
            int k = 0;
            for (int i = 0; i < archivo.length(); i++) {
                _cadena = _cadena +  almacenamiento.readLine()+" " ;
                
                if((i+1)%4==0 && i != 0){
                    objArrays.myArray[k] = _cadena ; 
                    _cadena = "";
                    k++;
                }
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
        }
        objArrays.showMatriz();
        
    }
    
  
    
 
    
   
}
