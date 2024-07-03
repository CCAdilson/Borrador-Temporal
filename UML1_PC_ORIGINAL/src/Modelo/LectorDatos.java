package Modelo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LectorDatos {
    
    private Scanner id = new Scanner(System.in);
    /*Importancia de definir Scanner como privado:
    Definir Scanner como privado encapsula su uso dentro de
    la clase LectorDatos. Esto significa que el manejo de entradas
    está controlado exclusivamente por esa clase, manteniendo la
    coherencia y seguridad del acceso a los datos de entrada.
    También sigue el principio de encapsulación en programación orientada
    a objetos, que busca limitar el acceso directo a los atributos
    de una clase desde el exterior.*/
    
    public int leerEntero(String mensaje){

        while(true){
            try{
                System.out.println(mensaje);
                return id.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Por favor ingresa un numero entero.");
                id.next(); //Limpiar entrada inválida
            }
        }

/*
        try {
            System.out.print(mensaje);
            return id.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingresa un número entero.");
            id.next(); // Limpiar entrada inválida
            throw e;
        }
*/
    }
    
    public double leerDouble(String mensaje){

        while(true){
            try{
                System.out.println(mensaje);
                return id.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Por favor ingresa un numero decimal.");
                id.next(); //Limiar entrada inválida
            }
        }
/*
        try {
            System.out.print(mensaje);
            return id.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingresa un número decimal.");
            id.next(); // Limpiar entrada inválida
            throw e;
        }
*/
    }
  
    public char leerChar(String mensaje){
/*
        while (true) {
            System.out.print(mensaje);
            String input = id.next();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("Error: Por favor ingresa un solo carácter.");
            }
*/
        System.out.print(mensaje);
        String caracter = id.next();
        if (caracter.length() == 1) {
            return caracter.charAt(0);
        } else {
            System.out.println("Error: Por favor ingresa un solo carácter.");
            throw new InputMismatchException("Entrada no es un solo carácter.");
        }
    }
    
    public String leerCadena(String mensaje){
        System.out.println(mensaje);
        return id.next();
    }
    
    public void cerrar(){
        id.close();
    }
    
}
