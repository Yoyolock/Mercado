package Mercado;

public class Boleta {

    private int IDboleta;
    private String numBoleta;
    private String [] boletas;

    public Boleta(){

    }
    public Boleta(String numBoleta){
        this.numBoleta = numBoleta;
    }

    public String getNumBoleta() {
        return numBoleta;
    }

    public void setNumBoleta(String numBoleta) {
        this.numBoleta = numBoleta;
    }

    public String[] getBoletas() {
        return boletas;
    }

    public void setBoletas(String[] boletas) {
        this.boletas = boletas;
    }
}