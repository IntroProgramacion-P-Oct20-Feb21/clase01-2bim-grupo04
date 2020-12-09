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
public class Ejercicio2 {

    public static void main(String[] args) {
        String cadena = "Que hay de Tarea";
        String cadenaReporte = "";
        int valor;
        int contadorm = 0;
        int contadorM = 0;

        for (int i = 0; i < cadena.length(); i++) {
            cadenaReporte = String.format("%s%s", cadenaReporte, cadena.charAt(i));
            char v = cadena.charAt(i);
            valor = (int) v;
            for (int j = 97; j <= 122; j++) {
                if (valor == j) {
                    contadorm = contadorm + 1;  
                }

            }
            for (int j = 65; j <= 90; j++) {
                if (valor == j) {
                    contadorM = contadorM + 1;

                }

            }
        }
        System.out.printf("%s\nHay %d minusculas\nHay %d mayusculas\n",
                cadenaReporte, contadorm, contadorM);  
    }
}
