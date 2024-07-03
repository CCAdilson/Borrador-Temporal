package OperacionesConMatriz;

import java.util.Arrays;

public class OrdenarMatriz {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        int [][] matriz = {{5,4,7},{1,3,8},{2,9,6}};
        int [] vector = new int[9];
        int indice1 = 0;
        
        System.out.println("Matriz desordenado");
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                System.out.printf("%d ", matriz[f][c]);
            }
            System.out.println("");
        }
        
        //Reemplazando la matriz al vector
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                vector[indice1++] = matriz[f][c];
            }
        }
        
        //Ordenar vector
        Arrays.sort(vector);
        
        //Salto de linea
        System.out.println("");
        
        //Reemplazando el vector en la matriz
        //Salida de la matriz con formato
        System.out.println("Matriz ordenado");
        int indice2 = 0;
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                matriz[f][c] = vector[indice2++];
                System.out.printf("%d ", matriz[f][c]);
            }
            System.out.println("");
        }
        
        
    }
}
