package practicas.com;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Los Arrays son fijos, no se pueden modificar, si modificamos desplazamos
        // todos las posiciones para ello tenemos el arraylist
        // Se forma con ArrayList <onject> nombre = new Arraylist <> ();
        // En el object no se puede usar tipos primitivos solo clases no int si String
        // Java tiene unos tipos llamados envoltorios que permite usar los tipos primitivos
        // Clases Wrapper o envoltorio
        // boolean -> Boolean
        // int -> Integer
        // double -> Double ..
        // lenght no size si
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        ArrayList <Integer> lista = new ArrayList<>();
        for  (int i = 1; i <= 10; i++){
            lista.add(r.nextInt(100));
        }
        //Lo sacamos por pantalla
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //el foreach tambien
        for (Integer i : lista){
            System.out.println(i);
        }
        System.out.println("------Añadimos al final 300------------");
        //Añadimos nuevos elementos
        lista.add(300);

         for (Integer i : lista){
            System.out.println(i);
        }
        System.out.println("------Insertamos en la posicion 3--- 300 ---------");
         //Añadimos en la posicion 3 el numero 300
         lista.add(3, 300);
        for (Integer i : lista){
            System.out.println(i);
        }

        System.out.println("------sustituimos en la posicion 3--- 300 por 1000---------");
        lista.set(3,1000);
        for (Integer i : lista){
            System.out.println(i);
        }
    }
}
