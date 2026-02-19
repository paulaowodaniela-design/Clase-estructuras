package src6;

public class Producto {
    int id;
    String nombre;
    double precio ;
    
    public Producto(int idproducto, String nombreProducto, double precioProducto){
         this.id=idproducto;
         this.nombre=nombreProducto;
         this.precio=precioProducto;
    }
    /* 
        escribimos equals para que ArrayList pueda comparar 
        el ID que esta contenido y no la ubicación en memoria
        Por defecto, equals solo devuelve true si son exactamente el mismo objeto físico.
    */
    public boolean equals(Object Comparar){
        if (!(Comparar instanceof Producto)) return false;
        Producto otro = (Producto) Comparar;
        return this.id == otro.id;
    }

 }