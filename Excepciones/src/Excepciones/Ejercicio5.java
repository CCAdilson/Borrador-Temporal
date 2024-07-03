package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        //MutltiCath 
        //Trabaja con multiples catch
        int a, b, c;
        
        try{
            System.out.print("A:");
            a = id.nextInt();
            System.out.print("B: ");
            b = id.nextInt();
            c = a / b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero.");
        }catch(InputMismatchException i){
            System.out.println("Variable Incorrecta.");
        }
        
    }
}
