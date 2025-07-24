package practicas.com;

import java.util.Scanner;

public class ProgramaGestionTaquillas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas entradas a la venta: ");
        int totalEntradas = teclado.nextInt();
        System.out.println("Cuantas entradas como maximo puede comprar una persona: ");
        int totalLimite = teclado.nextInt();

        Taquilla taquilla = new Taquilla(totalEntradas, totalLimite);

        do {
            System.out.println("Cuantas entradas quiere?");
            int entradas = teclado.nextInt();
            boolean result = taquilla.comprarEntradas(entradas);
            if (result) System.out.println("Compra ok");
            else System.out.println("Compra invalida");
        }
        while (taquilla.hayEntradasDisponibles());
        int max = taquilla.maxEntradasLlevadas;
        System.out.println("Maximo de entradas: " + max);
    }
}
