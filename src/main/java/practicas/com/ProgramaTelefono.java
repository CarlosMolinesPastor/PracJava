package practicas.com;

public class ProgramaTelefono {
    public static void main(String[] args) {
        boolean resultado;
        TelefonoPre telefono1 = new TelefonoPre(900900900,10);
        TelefonoPre telefono2 = new TelefonoPre(901901901);

        System.out.println("El saldo del telefono es de " + telefono1.saldo);
        resultado = telefono1.recarga(4);
        System.out.println(resultadoRecarga(resultado));
        System.out.println("El saldo del telefono es de " + telefono1.saldo);
        resultado = telefono1.recarga(4);
        System.out.println(resultadoRecarga(resultado));
        System.out.println("El saldo del telefono es de " + telefono1.saldo);
        telefono1.llamar(3);
        System.out.println("El saldo del telefono es de " + telefono1.saldo);
        resultado = telefono1.recarga(10);
        System.out.println(resultadoRecarga(resultado));
        System.out.println("El saldo del telefono es de " + telefono1.saldo);
    }
    static String resultadoRecarga(boolean resultado){
        String recarga = "";
        if (resultado) {
            recarga = "Has recargado";
        }
        else {
            recarga = "No recargado";
        }
        return recarga;
    }
}

