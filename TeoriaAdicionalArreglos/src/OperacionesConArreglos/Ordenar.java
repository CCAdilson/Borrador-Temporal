package OperacionesConArreglos;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        
        /*Ordenar
        Arrays.sort(arreglo);
        */
        System.out.println("EJEMPLO 1");
        StringBuilder sb = new StringBuilder();
        
        int [] numeros = {33, 45, 65, 32, 41, 38, 11};
        
        Arrays.sort(numeros);
        
        for(int i:numeros){
            sb.append(i).append(" ");
        }
        
        System.out.println(sb);
        
        
        
        System.out.println("EJEMPLO 2");
        StringBuilder sb2 = new StringBuilder();
        
        char [] frase = {'Y', 'o', ' ', 'A', 'm', 'o', ' ', 'J', 'a', 'V', 'a'};
        
        Arrays.sort(frase);
        
        for(char i: frase){
            sb2.append(i);
        }
        
        System.out.println(sb2);
        
    }
}
