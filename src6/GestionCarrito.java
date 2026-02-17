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

        System.out.println("productos agregados al carrito: ");
        for(Producto A: carrito){
            System.out.println("- " + A.nombre + " ID: " + A.id + "el valor: ");
        }
    }

    private static void agregarProducto(Producto A, List<Producto> lista) {
        if (!lista.contains(A)) {
            lista.add(A);
            System.out.println("Agregado exitosamente: " + p.nombre);
    }
}
