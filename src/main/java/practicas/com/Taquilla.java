package practicas.com;

public class Taquilla {
    // caracteristicas de la clase taquilla
    public int entradasDisponibles;
    public int maxEntradasLlevadas;
    public int cantidadEntradasLimite;

    //Consttructor
    public Taquilla(int entDisp, int cantEntLimit) {
        this.entradasDisponibles = entDisp;
        this.maxEntradasLlevadas = 0;
        this.cantidadEntradasLimite = cantEntLimit;
    }
   //Metodo principal Comprar entradas
    public boolean comprarEntradas( int nE){
        if (nE > this.cantidadEntradasLimite) return false;
        if (nE > this.entradasDisponibles) return false;
        this.entradasDisponibles -= nE;
        if (nE > this.maxEntradasLlevadas) this.maxEntradasLlevadas = nE;
        return true;
    }
    public boolean hayEntradasDisponibles(){
        if (this.entradasDisponibles >0) return true;
        return false;
    }
}
