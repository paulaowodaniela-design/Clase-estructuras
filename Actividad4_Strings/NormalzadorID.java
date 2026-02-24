package src4;
/*String con S mayuscula es un dato inmutable, es decir una vez creado no se puede cambiar
cada que se use un metodo se va a crear una nueva copia en la memoria, en cambio
StringBuilder es mutable permitiendo modificaciones en el mismo objeto esto hace que
StringBuilder sea más eficiente para operaciones que requieren múltiples cambios
reduciendo el uso de memoria y el tiempo de ejecución */
public class NormalzadorID {
    public static void main (String[] args){
        String idSucio = " User_123 ";
        String idLimpio = idSucio.trim().toUpperCase().substring(0, 4);
        System.out.println(System.identityHashCode(idSucio));
        System.out.println(System.identityHashCode(idLimpio));
        StringBuilder cambiante = new StringBuilder(idLimpio);
        cambiante.reverse();
        String idTerminado = cambiante.toString(); 
        System.out.println(idTerminado);
    }
}
