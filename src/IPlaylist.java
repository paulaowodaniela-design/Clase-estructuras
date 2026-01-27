public interface IPlaylist {
   void agergarCancion(Cancion cancionc);
   void eliminarCancion(String titulo);
   Cancion reproducirSiguiente();
   void vaciarLista();
   int obtenerCantidadCanciones();
}