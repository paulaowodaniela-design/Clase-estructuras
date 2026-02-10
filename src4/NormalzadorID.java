package src4;

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
