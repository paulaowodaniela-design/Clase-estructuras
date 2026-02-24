package src9;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    public static void main(String[] args) {
        Map<String, String> inventario = new HashMap<>();

        //agregar productos
        inventario.put("A001", "laptop Dell");
        inventario.put("A002", "Televisor Sony");
        inventario.put("A003", "Celular Samsung");

        //insertamos clave
        inventario.put("A001", "Laptop HP"); 

        // muestra el nuevo resultado
        System.out.println("Producto con SKU A001: " + inventario.get("A001"));
        //las claves en map son unicas por eso es que el valor anterior se remplaza

        // busca productos existentes e inexistentes
        String productoExistente = inventario.get("A002"); 
        String productoInexistente = inventario.get("A999"); 
        System.out.println("Producto con SKU A002: " + productoExistente);
        System.out.println("Producto con SKU A200: " + productoInexistente);

        // El método get() de HashMap permite acceder a los valores de manera muy rápida,
        // sin necesidad de recorrer todo el mapa. Su complejidad es cercana a O(1).
    }
}