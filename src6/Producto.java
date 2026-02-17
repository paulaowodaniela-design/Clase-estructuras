package src6;

public class Producto {
    int id;
    String nombre;
    double precio;

    public Producto(int idproducto, String nombreProducto, double precioProducto){
         this.id=idproducto;
         this.nombre=nombreProducto;
         this.precio=precioProducto;
    }
    public boolean equals(Object Comparar){
        Producto mercancia = (Producto) Comparar;
        return this.id == mercancia.id;
    }
}
