public class Principal {
public static void main (String[] args){
    Cancion insCancion = new Cancion("hasta la madre","Jeison Jimenez","Popular"
    );
    System.out.println("cancion nueva: " + insCancion.getNombreC());
    System.out.println("Artista " + insCancion.getArtista());
    System.out.println("Genero " + insCancion.getGenero());

}
    
}