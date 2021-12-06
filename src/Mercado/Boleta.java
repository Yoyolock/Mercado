package Mercado;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZonedDateTime;

public class Boleta {

    private int idboleta;
    private int idcajeros;
    private int idcliente;
    private int idcaja;

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
}