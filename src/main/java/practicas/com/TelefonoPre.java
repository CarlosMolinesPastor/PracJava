package practicas.com;

public class TelefonoPre {
    public long numTelefono;
    public double saldo;

    //constructor
    public TelefonoPre(long nT, double s) {
        this.numTelefono = nT;
        this.saldo = s;
    }
    public TelefonoPre(long nT) {
        this.numTelefono = nT;
        this.saldo = 0;
    }
    public boolean recarga(int imprecarga){
        if (imprecarga %5==0) {
            saldo += imprecarga;
            return true;
        }else {
            return false;
        }

    }
    public void llamar (int minutos){
        saldo -= minutos * 0.03;
    }
}
