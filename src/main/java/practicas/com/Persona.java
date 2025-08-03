package practicas.com;

import java.util.Objects;

public class Persona{
    public static void main(String[] args) {
       NuevaPersona p1 = new NuevaPersona("48315472Q", 30);
       NuevaPersona p2 = new NuevaPersona("48315472Q", 30);
       NuevaPersona p3 = new NuevaPersona();
       aumentarEdad(p1);
       System.out.println(" Edad de p1 = " + p1.edad);
       // if (p1 == p2);
       //OJO TIPOS PRIMITIVOS
       //En los objetos no podemos hacer == por el tema de datos primitivos vs referencias de memoria por ello
       //tenemos que utilizar por ejemplo la funcion equals al no comparar los espacios reservados de
       //memoria if(p1.equals(p2))
       if (p1.equals(p2)) System.out.println("Las personas son iguales");
       else System.out.println("Las personas son diferentes");
    }
    static void aumentarEdad(NuevaPersona persona){
        persona.edad++;
    }
}
class NuevaPersona {
    String dni;
    int edad;
    public NuevaPersona(){}
    public NuevaPersona(String d, int e){
        this.dni = d;
        this.edad = e;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NuevaPersona that = (NuevaPersona) o;
        return Objects.equals(dni, that.dni);
    }

}

