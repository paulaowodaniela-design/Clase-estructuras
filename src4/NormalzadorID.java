package src4;

public class NormalzadorID {
    public static void main (String[] args){
        String idSucio = " User_123 ";
        String idLimpio = idSucio.trim().toUpperCase().substring(0, 4);
        System.identityHashCode(idSucio);
        System.identityHashCode(idLimpio);
        StringBuilder cambiante = new StringBuilder(idLImpio);
        cambiante.reverse();
        string idTerminado = cambiante.trostring(); 
    }
}
