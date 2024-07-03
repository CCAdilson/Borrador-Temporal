package OperacionesConArreglos;
public class Copiar {
    public static void main(String[] args) {
        
        /*Copiar
        System.arraycopy(arrOrigen, 0, arrDestino, 0, arrOrigen.length);
        */
        
        int [] fibonacci = {1, 1, 2, 3, 5, 8};
        int [] copia = new int[fibonacci.length];
        
        System.arraycopy(fibonacci, 0, copia, 0, fibonacci.length);
        
        for(int i:copia){
            System.out.print(i + " ");
        }
        
    }
}
