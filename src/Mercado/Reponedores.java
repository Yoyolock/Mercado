package Mercado;

public class Reponedores extends Persona {

    private int IDreponedor;

    public Reponedores(int IDreponedor, String namePersona) {
        super(namePersona);
    }
    public Reponedores() {
    }
    public int getIDreponedor() {
        return IDreponedor;
    }

    public void setIDreponedor(int IDreponedor) {
        this.IDreponedor = IDreponedor;
    }
}