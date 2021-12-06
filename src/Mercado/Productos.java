package Mercado;

public class Productos {

    int idproducto;
    String nameProducto;
    private float precio;



    public Productos(){

    }
    public void setIDproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }

    public int getIDproducto() {
        return idproducto;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
