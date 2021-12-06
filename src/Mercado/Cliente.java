package Mercado;

public class Cliente extends Persona{

    private int idcliente;

    public Cliente(){

    }

    public Cliente(String namePersona){
        super(namePersona);
    }

    public void setidcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getidcliente() {
        return idcliente;
    }
}
