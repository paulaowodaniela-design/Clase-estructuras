public interface IPlaylist {
   void agergarCancion(inster Cancion);
   void eliminarCancion(String titulo);
   Cancion reproducirSiguiente();
   void vaciarLista();
   int obtenerCantidadCanciones();
}