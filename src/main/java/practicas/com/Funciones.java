package practicas.com;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        int dia, mes, anyo;
        int diasmes = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        anyo = teclado.nextInt();
        String fechaIncorrecta = "Fecha incorrecta!!!!";
        if (mes < 1 || mes > 12){
            System.out.println(fechaIncorrecta);
        }
        else {
          diasmes = calcularDiasMes(mes, anyo);
        }
        if (dia < 1 || dia > diasmes){
            System.out.println(fechaIncorrecta);
        }
        else {
            System.out.println("Fecha Correcta !!!!");
        }
    }
    static int calcularDiasMes(int m, int a) {
        int diasmes;
        if (m == 2) {
            if (esBisiesto(a)) diasmes = 29;
            diasmes = 28;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) diasmes = 30;
        diasmes = 31;
        return diasmes;
    }
    static boolean esBisiesto (int aa){
        if (aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0) return true;
        return false;
    }
}
