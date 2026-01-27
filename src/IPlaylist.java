public interface Iplaylist {
   void agergarCancion(inster Cancion);
   void eliminarCancion(String titulo);
   Cancion reproducirSiguiente();
   void vaciarLista();
   int obtenerCantidadCanciones();
}