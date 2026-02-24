package src7;

import java.util.Stack;


public class Navegador { 
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        historial.push("google.com");
        System.out.println("Navegando a: " + historial.peek());
        historial.push("spotify.com");
        System.out.println("Navegando a: " + historial.peek());
        historial.push("instagram.com");
        System.out.println("Navegando a: " + historial.peek());

        System.out.println("URL actual (peek): " + historial.peek());

        if (!historial.empty()) {
            String urlAnterior = historial.pop();
            System.out.println("regresando desde: " + urlAnterior);
            if (!historial.empty()) {
                System.out.println("ahora en: " + historial.peek());
            } else {
                System.out.println("Historial vacío.");
            }
    }

     // 5. Validación: Vaciar la pila y manejar excepción
        while (!historial.empty()) {
            System.out.println("Saliendo de: " + historial.pop());
        }
        // Intentar hacer pop en pila vacía
        try {
            historial.pop();
        } catch (java.util.EmptyStackException e) {
            System.out.println("No se puede regresar, el historial está vacío.");
        }
    }
    
}

