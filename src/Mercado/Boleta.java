package Mercado;

public class Boleta {

    private int idboleta;
    private int idcajeros;
    private int idcliente;
    private int idcaja;
    private int cantidad;
    private int total;

    public Boleta() {

    }

    public int getIdboleta() {
        return idboleta;
    }

    public void setIdboleta(int idboleta) {
        this.idboleta = idboleta;
    }

    public int getIdcaja() {
        return idcaja;
    }

    public int getIdcajeros() {
        return idcajeros;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcaja(int idcaja) {
        this.idcaja = idcaja;
    }

    public void setIdcajeros(int idcajeros) {
        this.idcajeros = idcajeros;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int setIdboleta() {
        this.idboleta = idboleta;
        return idboleta;
    }

    public int getidboleta() {
        return idboleta;
    }
}