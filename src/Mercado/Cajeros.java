package Mercado;

public class Cajeros extends Persona {

    private int idcajeros;
    private int idcaja;

    public Cajeros(String namePersona) {
        super(namePersona);
    }

    public Cajeros() {

    }
    public void setIDcajeros(int idcajeros) {
        this.idcajeros = idcajeros;
    }

    public int getIDcajeros() {
        return idcajeros;
    }

    public int getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(int idcaja) {
        this.idcaja = idcaja;
    }

    public int getidcaja() {
        return idcaja;
    }
}