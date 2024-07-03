package Vista;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LectorDatos {
    
    private Scanner id = new Scanner(System.in);
    
    public int leerEntero(String mensaje){
        try{
            System.out.println(mensaje);
            return id.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error: Por favor ingresa un numero entero.");
            id.next();
        }
            return 0;
    }

    public double leerDoble(String mensaje) {
        try{
            System.out.println(mensaje);
            return id.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Error: Por favor ingresa un numero doble.");
            id.next();
        }
            return 0;
    }

    public String leerCadena(String mensaje) {
        System.out.println(mensaje);
        return id.nextLine();
    }
    
    public void cerrar(){
        id.close();
    }
    
}
