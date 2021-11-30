package Mercado;

public class Cajeros extends Persona{

    private int IDcajeros;
    private int IDcaja;
    private int idcaja;

    public Cajeros(String namePersona){
        super(namePersona);
    }

    public Cajeros(){

    }

    public void setIDcaja(int IDcaja) {
        this.IDcaja = IDcaja;
    }

    public int getIDcaja() {
        return IDcaja;
    }

    public void setIDcajeros(int IDcajeros) {
        this.IDcajeros = IDcajeros;
    }

    public int getIDcajeros() {
        return IDcajeros;
    }

    public void setIdcaja(int idcaja) {
        this.idcaja = idcaja;
    }

    public int getIdcaja() {
        return idcaja;
    }
}