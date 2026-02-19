package src8;

import  java.util.Queue;
import java.util.LinkedList;

public class colaSoporte {
    public static void main(String[] args) {
        Queue<String> colaSoporte = new LinkedList<>();

        colaSoporte.add("cliente maria");
        colaSoporte.add("cliente jose");
        colaSoporte.add("cliente juan");
        System.out.println("los clientes que no se han atendido son: " + colaSoporte);

        String siguiente = colaSoporte.peek();
        System.out.println("el siguiente cliente en ser atendido es: " + siguiente);

        while (!colaSoporte.isEmpty()) {
            String atendido = colaSoporte.poll();
            System.out.println("Atendiendo a: " + atendido);
        }

    }
    
}
