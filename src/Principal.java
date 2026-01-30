public class Principal {
public static void main (String[] args){
    Cancion insCancion = new Cancion("hasta la madre","Jeison Jimenez","Popular"
    );
    System.out.println("cancion nueva:" + insCancion.NombreC());
    System.out.println("Artista" + insCancion.Artista());
    System.out.println("Genero" + insCancion.Genero());

}
    
}