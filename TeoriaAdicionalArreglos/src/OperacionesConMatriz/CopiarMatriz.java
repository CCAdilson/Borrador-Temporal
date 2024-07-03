package OperacionesConMatriz;
public class CopiarMatriz {
    public static void main(String[] args) {
        
        int [][] matrizOriginal = {{24,32,19},{11,45,78},{36,11,90}};
        int [][] matrizCopia = new int[3][3];
        
        //Copiando la matriz original a la matriz copia
        System.arraycopy(matrizOriginal, 0, matrizCopia, 0, matrizOriginal.length);
        
        for(int f=0; f<matrizCopia.length; f++){
            for(int c=0; c<matrizCopia.length; c++){
                System.out.printf("%d ", matrizCopia[f][c]);
            }
            System.out.println("");
        }
    }
}
