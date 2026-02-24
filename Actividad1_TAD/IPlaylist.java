public interface IPlaylist {
   void agergarCancion(Cancion cancionc);
   void eliminarCancion(String cancionc);
   Cancion reproducirSiguiente();
   void vaciarLista();
   int obtenerCantidadCanciones();
}
/*La estructura es lineal porque las canciones
se organizan en un orden secuencial cada elemento
tiene una posición dentro de la secuencia y se accede
de manera consecutiva mediante la operación reproducirSiguiente(),
lo que indica un comportamiento ordenado y progresivo. */