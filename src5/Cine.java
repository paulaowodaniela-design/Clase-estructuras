public class Cine {
    public static int[][] sala = new int[8][10];

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int Y = 0; Y < 9; Y++) {
                sala[i][Y] = 0;
            }
        }
        reservarAsiento(2, 4);
        reservarAsiento(2, 5);
        SaladeCine();
        asientoContiguo(2);
    }

    public static void reservarAsiento(int fila, int col) {
                if (fila >= 0 && fila < 7 && col >= 0 && col < 9) {
                    if (sala[fila][col] == 0) {
                        sala[fila][col] = 1;
                        System.out.println("asiento resevado en fila: " + fila + " y columna " + col);
                    }
                }
    }
// ahora buscamos dos asientos continuos con boolean ya que nos va adevolver un dato
    public static boolean asientoContiguo(int fila) {
            for (int Y = 0; Y < sala[fila].length - 1; Y++){
                //aqui lo que se hace es recorre toda la matriz de 1 a 8, luego el if busca 
                //una fila y la que esta al lado para ver si las dos estan libres y asi notificar
                if (sala[fila][Y] == 0 && sala[fila][Y+1] == 0) {
                System.out.println("hay dos asientos libres en la fila " + fila +
                        " y columna " + Y + " y columna " + (Y + 1));
                return true;
            }
    }
            System.out.println("no hay dos asientos continuos libres");
        return false;
}

    public static void SaladeCine(){
        for (int i =0; i < sala.length; i++ ){
            for ( int Y =0; Y < sala[i].length; Y++){
                System.out.print(sala[i][Y] + " ");
            }
            System.out.println(); // salto de línea al terminar la fila
        }
    }
}
