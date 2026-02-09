public class EstacionClimatica {
    public static void main (String[] args){
    double[] temperaturas = new double [24];
    
       for (int i = 0; i < temperaturas.length; i++){
   temperaturas[i]= Math.random() *40;
}
System.out.println(temperaturas[12]);
try{ temperaturas[24] = 10;
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("La hora ingresada no existe");
}     

    }
    
}