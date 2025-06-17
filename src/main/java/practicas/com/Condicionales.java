package practicas.com;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado = 0;
        System.out.println("Introduce el numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el numero: ");
        num2 = teclado.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
        System.out.println();
        System.out.println("Si el resultado esta entre 24 y 48 o es par sacara la potencia de 2 si no se dividira por tres");
        if (resultado > 23 && resultado < 48 || resultado % 2 == 0) {
            resultado = resultado * resultado;
            System.out.println("La potencia del resultado es: " + resultado);
        }
        else {
            resultado = resultado / 3;
            System.out.println("El resltado dividido entre 3 es " + resultado);
        }
        switch (num1){
            case 1:
                System.out.println("El numero es: " + num1);
                break;
            case 22:
                System.out.println("El numero es: " + num1);
                break;
            case 33:
                System.out.println("El numero es: " + num1);
                    break;
           }
    }
}
