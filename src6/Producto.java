package src6;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    int id;
    String nombre;
    double precio ;
    
    public Producto(int idproducto, String nombreProducto, double precioProducto){
         this.id=idproducto;
         this.nombre=nombreProducto;
         this.precio=precioProducto;
    }
    public boolean equals(Object Comparar){
        Producto mercancia = (Producto) Comparar;
        return this.id == mercancia.id;
    }

    public static void añadirAlCarrito(Producto nuevo, List<Producto> lista){
        if (!lista.contains(nuevo)){
            lista.add(nuevo);
                System.out.println("añadido: " + nuevo.nombre);
        }
        else{ System.out.println(" error el producto" + nuevo.nombre + " ya esta añadido");}
    }
    public static void main(String[] args) {
         List<Producto> lista = new ArrayList<>();
         Producto p1 = new Producto(1, "arroz", 1.99);
         Producto p2 = new Producto(2, "fruta", 3.00);
         Producto p3 = new Producto(3, "pan", 2.99);

            añadirAlCarrito(p1, lista);
            añadirAlCarrito(p2, lista);
            añadirAlCarrito(p3, lista);
         System.out.println("agregaste al carrito estos productos: " + p1 + p2 + p3);
        }
    }