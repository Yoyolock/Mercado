package Mercado;

public class Reponedores extends Persona {

    private int idreponedor;

    public Reponedores(int idreponedor, String namePersona) {
        super(namePersona);
    }
    public Reponedores() {
    }
    public int getIDreponedor() {
        return idreponedor;
    }

    public void setIDreponedor(int idreponedor) {
        this.idreponedor = idreponedor;
    }
}