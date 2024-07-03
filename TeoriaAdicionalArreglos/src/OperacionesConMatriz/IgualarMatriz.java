package OperacionesConMatriz;
import java.util.Arrays;
public class IgualarMatriz {
    public static void main(String[] args) {
        
        int [][] matriz1 = {{5,4,7},{1,3,8},{2,9,6}};
        int [][] matriz2 = {{5,4,7},{1,3,8},{2,9,0}};
        
        boolean igualarMatrices = Arrays.deepEquals(matriz1, matriz2);
        //Utilizando Operador Ternario
        String mensaje = igualarMatrices? "Son iguales" : "Son diferentes";
        
        System.out.println(mensaje);
    }
}
