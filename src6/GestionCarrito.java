package src6;

import java.util.ArrayList;
import java.util.List;

public class GestionCarrito {
    public static void main(String[] args) {
        // 1. Declaración de la Lista Dinámica
        List<Producto> carrito = new ArrayList<>();

        // 2. Creación de los productos (Los instanciamos)
        Producto p1 = new Producto(1, "Arroz", 2.50);
        Producto p2 = new Producto(2, "Fruta", 3.00);
        Producto p3 = new Producto(1, "Arroz Repetido", 2.50);

        agregarProducto(p1, carrito);
        agregarProducto(p2, carrito);
        agregarProducto(p3, carrito);
        // elinimanos la Fruta (p2) para probar
        eliminarDelCarrito(p2, carrito);

        System.out.println("productos agregados al carrito: ");
        for (Producto A : carrito) {
            System.out.println("- " + A.nombre + " ID: " + A.id + " el valor: " + A.precio);
        }
    }

    private static void agregarProducto(Producto A, List<Producto> lista) {
        if (!lista.contains(A)) {
            lista.add(A);
            System.out.println("Agregado exitosamente: " + A.nombre);
        } else {
            System.out.println("Error: El ID " + A.id + " ya existe.");
        }
    }

    public static void eliminarDelCarrito(Producto A, List<Producto> lista) {
        if (lista.remove(A)) {
            // .remove(A) devuelve 'true' si lo encontró y lo borró
            System.out.println("Eliminado: " + A.nombre);
        } else {
            System.out.println("No se pudo eliminar: El producto no estaba en el carrito.");
        }
    }
}
/* 
El ArrayList tiene una capacidad que es un espacio reservado, inicial en 10 y un tamaño que son los elementos
cuando se llena Java crea un nuevo arreglo interno un 50% más grande (crecimiento dinámico).
Luego copia todos los elementos del viejo al nuevo. Esta copia es una operación O(n),
porque el tiempo que tarda crece proporcionalmente al número de elementos (n) a copiar.
*/