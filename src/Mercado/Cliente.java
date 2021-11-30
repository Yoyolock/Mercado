package Mercado;

public class Cliente extends Persona{

    private int IDcliente;

    public Cliente(){

    }

    public Cliente(String namePersona){
        super(namePersona);
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }

    public int getIDcliente() {
        return IDcliente;
    }
}
