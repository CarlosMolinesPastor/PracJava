package practicas.com;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definimos un array  --   tipo [] nombre
        // El tipo puede ser int String....
        // Los arrays en java los trata como objetos, por lo que se ha de tener
        // en cuenta lo visto hasta ahora de los objetos
        int [] arr1 = new int [10];
        int [] arr2 = new int [] {1,12,22,23};
        //Hacerlo de forma arcaica
        //arr1[0] = 10;
        //arr1[1] = 20;
        //arr1[2] = 30;
        //Hacerlo con un bucle;
        for (int i = 0; i < arr1.length; i++){
            System.out.println("Introduzca valor del array: " + i);
            arr1[i] = teclado.nextInt();
        }
        for  (int i = 0; i < arr1.length; i++){
            //Ojo printf para que lo formateee con el %d
            System.out.printf("Pos %d -> % d%n", i, arr1[i]);
        }
        // Tambien lo podemos recorrer con while y si no nos importa el lugar que
        // ocupa lo podemos hacer con un foreach
        // a es cada elemento del array no las posiciones
        System.out.println("");
        System.out.println("FOREACH");
        for(int a  : arr1){
            System.out.println(a);
        }
        //Copiar arrays, se deben copiar cada uno de los valores de los arrays, si igualamos lo unico que
        // hacemos es copiar la referencia por lo que apuntarian al mismo sitio. Para copiar tenemos
        // Systen.arraycopy(array1, posicion_array1, array2, posicion_array2, numeroElementosquierocopiar en el segundo array)
        //Ojo que tiene que tener los mismos numeroElementos a copiar que tenga el arr2 es decir 4
        System.arraycopy(arr1, 5, arr2, 0, 4 );
        //
        System.out.printf("%n Arraycopy %n Valor arr2 %n");
        for(int a : arr2){
            System.out.println(a);
        }
    }
}
