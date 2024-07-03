package Excepciones;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        //ArithmeticException: Cuando realizas operaciones matemáticas inválidas,
        //como dividir por cero.
        
        //System.out.println("Divison entre cero.");
        
        
        
        
        try{
            int a = 10, b=0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Error: Division entre cero.");
        }
 
    }
}
