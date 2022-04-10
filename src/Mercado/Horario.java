package Mercado;

public class Horario {

    private String turno;
    private String entrada;
    private String salida;
    private int idcaja;
    private int idcajeros;
    private int id;
    private int cantidadVentas;

    public Horario(){

    }

    public int getIdcaja() {
        return idcaja;
    }

    public int getIdcajeros() {
        return idcajeros;
    }

    public void setIdcaja(int idcaja) {
        this.idcaja = idcaja;
    }

    public void setIdcajeros(int idcajeros) {
        this.idcajeros = idcajeros;
    }

    public String getTurno() {
        return turno;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
}
