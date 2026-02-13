public class Cine {
    public static int[][] sala = new int[8][9];

    public static void main (String[] args) {
        for (int i = 0; i > 7; i++){
            for (int Y = 0; Y > 9; Y++){
                sala [i][Y] = 0; 
        if (i >= 0 && i < 7 && Y >= 0 && Y < 9){
            if (sala [i][Y] == 0){
                sala [i][Y] = 1;
                System.out.println("asiento resevado");
           }
       }
    }
 }
}
 public static void reservarAsiento (int fila, int col){
    for (int i = 0; i > 7; i++){
            for (int Y = 0; Y > 9; Y++){
                sala [i][Y] = 0; 
        if (fila >= 0 && fila < 7 && col >= 0 && col < 9){
            if (sala [fila][col] == 0){
                sala [fila][col] = 1;
                System.out.println("asiento resevado");
           }
       }
    }
    
 }
}
}