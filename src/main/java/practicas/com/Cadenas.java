package practicas.com;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String texto = teclado.nextLine();
        /* concatenamos cadenas */
        String cadenaFinal = texto + ".";
        System.out.println("Cadena final: " + cadenaFinal);
        /* Metodos de objetos, en caso de string */
        int longitud = texto.length();
        System.out.println("La longitud de la cadena es: " + longitud);
        if (longitud < 10) {
            System.out.println("La longitud de la cadena es menor de 10");
        }
        String mayusculas = texto.toUpperCase();
        System.out.println("El texto en mayus es:" + mayusculas);
        /* Substring nos ayuda a coger un trozo de la cadena, desde 0 has n sin que este contada n como parte de lo
        que cogemos
         */
        String cadena = "Me llamo carlos";
        String trozo = cadena.substring(0,2);
        System.out.println("Trozo: " + trozo );
        /* comparacion */
        String cadena2= "hola";
        System.out.println(" El texto es: " + texto);
        System.out.println(" La cadena2 es: " + cadena2);
        /* EN JAVA NO SE COMPARAN LOS OBJETOS COMO SI, si no la ocupacion de memoria, es decir hay que comparar letra
        a letra, se tiene que comparar con equals que devuelve un booleano
         */
        System.out.println("En java solo se puede comparar cadenas con equals no con if");
        System.out.println("Con if da error");
        if (texto == cadena2) {
            System.out.println("El texto es igual");
        }
        else {
                System.out.println("Los textos son diferentes");
            }
        System.out.println("Con equals:");
        if (texto.equals(cadena2)){
            System.out.println("El texto es igual");
        }
        else {
            System.out.println("Los textos son diferentes");
        }
        /* indexof
        Nos devuelve la posicion donde se encuentra algo, si no lo encuentra devueve -1
         */
        int pos = texto.indexOf(".");
        if (pos == -1){
            System.out.println("La cadena no tiene punto");
        }
        else {
            System.out.println("La cadena tiene punto en la posicion " + pos);
        }
        /*
        Conversion entre tipos

        String conversion = String.valueOf(123);
        String conversion2 = Integer.toString(244,16); /*Base 16*/
        String conversion3 = Integer.toBinaryString(123);
        int numEntero = Integer.parseInt("10");
        int  numEntero2 = Integer.parseInt("F7A3", 16); /*Base Hexaecimal*/
        float numFloat = Float.parseFloat("20.1");
        /* StringBuilder es una clase mas potente que String
        insert, append, delete, replace */
        String cadenaBuilder = "Carlos es guapo";
        StringBuilder sb = new StringBuilder(cadenaBuilder);
        sb.deleteCharAt(8);
        cadenaBuilder = sb.toString();
        System.out.println("La cadenaBuilder es: " + cadenaBuilder);
        /* Concatenado */
        cadenaBuilder = new StringBuilder(cadenaBuilder).deleteCharAt(8).toString();
        System.out.println("La cadenaBuilder es: " + cadenaBuilder);
    }
}
