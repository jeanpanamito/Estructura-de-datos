/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class MetArray {
    Scanner entrada;
    String[] myArray;
    String[] nombres;
    public MetArray(int _n) {
        this.entrada = new Scanner(System.in);
        this.myArray= new String[10]; // primer numero de nuestro archivo   
    }
      public void showMatriz() {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i] + " ");

              
            }
  System.out.println("\n");

        }

    }
      
     
}
