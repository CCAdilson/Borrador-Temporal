package OperacionesConArreglos;
import java.util.Arrays;
public class Igualar {
    public static void main(String[] args) {
        
        /*Comparar
        boolean iguales = Arrays.equals(arreglo1, arreglo2);
        */
        
        char [] letras1 = {'c', 'a', 'm', 'p', 'e', 'o', 'n'};
        char [] letras2 = {'c', 'A', 'm', 'p', 'e', 'o', 'n'};
        
        boolean igualar = Arrays.equals(letras1, letras2);
        
        System.out.println(igualar? "Son iguales" : "Son diferentes");
        
    }
}
