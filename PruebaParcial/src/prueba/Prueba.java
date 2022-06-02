/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author JEanpa
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    File archivo = new File("datos.txt");
    MetArray objArrays;

    public static void main(String[] args) {
        Prueba obj = new Prueba();
        Persona[] arreglo = new Persona[10];
        obj.llenarArreglo(arreglo);
        int media = obj.calcularMedia(arreglo);
        System.out.printf("---------------------------------------------------"
                + "------------------------"
                + "\n\t\t    La media de la edad es: %d\n", media);
        obj.showDatosMenores(arreglo, media);
        obj.showDatosMayores(arreglo, media);
       
    }

    public void llenarArreglo(Persona[] arreglo) {
        FileReader leer;
        Persona pe;
        String _cadena = " ", _nombre = " ", _edad = " ", _direccion = " ", _genero = "";
        int aux = 0;
        BufferedReader almacenamiento;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (_cadena != null) {
                if (aux == 10) {
                    break;
                }
                _cadena = almacenamiento.readLine();
                _nombre = _cadena;

                _cadena = almacenamiento.readLine();
                _edad = _cadena;

                _cadena = almacenamiento.readLine();
                _direccion = _cadena;

                _cadena = almacenamiento.readLine();
                _genero = _cadena;

                pe = new Persona(_nombre, _edad, _direccion, _genero);
                arreglo[aux] = pe;
                aux++;
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
            System.out.println("Salio mal " + e);
        }
    }

    public int calcularMedia(Persona[] arreglo) {
        int media = 0;
        for (Persona arreglo1 : arreglo) {
            media += Integer.parseInt(arreglo1.edad);
        }
        media = media / arreglo.length;
        return media;
    }

    public void showDatosMenores(Persona[] arreglo, int media) {
        System.out.println("-------------------------------------------------------"
                + "---------------------------------");
        System.out.println("\t\tPersonas menores o iguales a la media");
        for (Persona arreglo1 : arreglo) {
            if (Integer.parseInt(arreglo1.edad) <= media) {
                System.out.printf("\nNombre:%s \tEdad:%s\t Genero:%s\tDirección:%s"
                        ,arreglo1.nombre,arreglo1.edad,arreglo1.genero,arreglo1.direccion);
            }
           
        }
        System.out.println("");
    }

    public void showDatosMayores(Persona[] arreglo, int media) {
        System.out.println("--------------------------------------------------"
                + "--------------------------------");
        System.out.println("\t\tPersonas mayores a la media");
        for (Persona arreglo1 : arreglo) {
            if (Integer.parseInt(arreglo1.edad) > media) {
                
                System.out.printf("\nNombre:%s \tEdad:%s\t Genero:%s\tDirección:%s"
                        ,arreglo1.nombre,arreglo1.edad,arreglo1.genero,arreglo1.direccion);
            }
        }
        System.out.println("");
    }

}
