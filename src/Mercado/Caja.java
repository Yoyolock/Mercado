package Mercado;

public class Caja {
    private int IDcaja;
    private String numCaja;

    public Caja(){

    }

    public Caja(String numCaja){
        this.numCaja = numCaja;
    }

    public String getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(String numCaja) {
        this.numCaja = numCaja;
    }
}

