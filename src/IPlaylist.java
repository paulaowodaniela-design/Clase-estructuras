public interface IPlaylist {
   void agergarCancion(Cancion cancionc);
   void eliminarCancion(String cancionc);
   Cancion reproducirSiguiente();
   void vaciarLista();
   int obtenerCantidadCanciones();
}