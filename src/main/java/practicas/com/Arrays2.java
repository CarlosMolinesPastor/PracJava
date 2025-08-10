package practicas.com;
import java.util.Random;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Arrays bidimensionales
        int [][] arr2 = new int [5][10]; //Filas y columnas
        Random r = new Random();
        // Hay que recorrer las filas y dento las columnas
        for (int f =0 ; f < 5 ; f++){
            for (int c = 0 ; c <10 ; c++){
                arr2 [f][c] = r.nextInt(11);
            }
        }
    }
}
