package practicas.com;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // for ejecutar unia instruccion un numrero de veces
        System.out.println("Introduce el numero de veces que quieres que se repita el bucle for");
        Scanner teclado = new Scanner(System.in);
        int veces = teclado.nextInt();
        for (int i = 1; i <= veces; i++) {
            if (i % 2 == 0){
                System.out.println("EL numero i " + i + " es par");
            }
            else {
                System.out.println("EL numero i " + i + " es impart");
            }
        }
        // While se ejecuta mientras que se cumpla una condicion
        int n = 0;
        while (n != -1){
            System.out.println(" Introduce un numero distinto de -1: ");
            n = teclado.nextInt();
            if  (n == -1){
                break;
            }
            if (n % 2 == 0){
                System.out.println("EL numero " + n + " es par");
            }
            else {
                System.out.println("EL numero i " + n + " es impart");
            }
        }
        // do while
        n = 0 ;
        do {
            System.out.println(" Introduce un numero distinto de -1: ");
            n = teclado.nextInt();
            if   (n == -1){break;}
            if (n % 2 == 0){
                System.out.println("EL numero " + n + " es par");
            }
            else {
                System.out.println("EL numero i " + n + " es impart");
            }
        }
        while (n != -1);
    }
}
