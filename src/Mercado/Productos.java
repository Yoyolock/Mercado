package Mercado;

public class Productos {

    int IDproducto;
    String nameProducto;
    private String precio;


    public Productos(){

    }
    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public int getIDproducto() {
        return IDproducto;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
