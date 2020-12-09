/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author macbookair
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String cadena1 = "*";
        String cadena2 = "*";
        int intcontador;
        
        System.out.println(cadena1);
        for (int contador = 1; (contador <= 10); contador ++) {
            cadena1 = cadena1 + cadena2;
            
            System.out.println(cadena1);    

        }   
    }

}
