/*se usa la herramienta Vector ya que es proceso mucho mas seguro que el Array
al usar la synchronized siendo mas lento pero mas seguro, ya que un solo hilo
 puede modificar el vector
*/
import java.util.ArrayList;
import java.util.Vector;

    public class Banco{
        public static void main (String[] args){
            Vector<String> logTransacciones = new Vector<>();
            logTransacciones.add("transacion hecha");
            logTransacciones.add("tu transacion fue realizda con exito");
            logTransacciones.add("no olvides pagar tu facturas");
            logTransacciones.add("en este momento esta desabilitado");
            logTransacciones.add("quieres conocer nuestros beneficios");

            compararRendimiento();
        }

        public static void compararRendimiento(){
            Vector<Integer> vector = new Vector<>();
            long inicioVector = System.currentTimeMillis();
            for (int i = 0; i < 1_000_000; i++){
                vector.add(i);
            }
            long finVector = System.currentTimeMillis();
            System.out.println("tiempo vector " +(finVector - inicioVector)+ "ms");
        
        //Arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioArray = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }

        long finArray = System.currentTimeMillis();
        System.out.println("tiempo ArrayList: " + (finArray - inicioArray) + " ms");

    }
}