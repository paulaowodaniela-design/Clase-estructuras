public class Cancion {
    private String NombreC;
    private String Artista;
    private String Genero;


    public Cancion(String NombreC, String Artista, String Genero){
        this.NombreC=NombreC;
        this.Artista=Artista;
        this.Genero=Genero;
    }
    //get para cambiar el private
    public String getNombreC(){
        return NombreC;
    }  
    public String getArtista(){
        return Artista;
    }
    public String getGenero(){
        return Genero;
    }
    // aqui los setters para modificarlos 
    public void setNombreC(String NombreC){
        this.NombreC=NombreC
    }
    public void setArtista(String Artista){
        this.Artista=Artista
    }
    public void setGenero(String Genero){
        this.Genero=Genero
    }
    
}