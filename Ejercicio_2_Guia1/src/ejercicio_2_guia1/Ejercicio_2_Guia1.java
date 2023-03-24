/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_guia1;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_2_Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre");
        nombre = leer.next();
        
        
        System.out.println("Bienvenido " + nombre);
        
    }
    
}
