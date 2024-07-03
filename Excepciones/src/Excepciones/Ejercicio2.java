package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        //InputMismatchException es una excepción en Java que se lanza
        //cuando un programa intenta leer un tipo de dato que no
        //coincide con el tipo esperado.
        //InputMismatchException
        double numero;
        
        try{
            System.out.print("Ingresar un numero: ");
        numero = id.nextDouble();
        
        System.out.println(numero);
        }catch(InputMismatchException e){
            System.out.println("Tonto.");
        }
        
        
        /*
        int numero;
        
        try {
            System.out.print("Ingresar un numero: ");
            numero = id.nextInt();

            System.out.println(numero);
        } catch (InputMismatchException e) {
            System.out.println("No ingreso un numero correctamente.");
        } finally {
            System.out.println("Bloque finally siempre se ejecuta.");
        }
        */
    }
}
