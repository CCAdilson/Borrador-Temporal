
package OperadorTernario;

public class OperadorTernario {
    public static void main(String[] args) {
        
        /*Ejemplo 1
        Escribir un programa que solicite la edad de una persona y muestre
        con un mensaje si es mayor o menor de edad*/
        
        int edad = 20;
        
        String mensaje1 = edad >= 18? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje1);
        
        /*Ejemplo 2
        Escribir un programa que solicite un numero entero y muestre
        con un mensaje si es positivo, negativo o cero*/
        
        int numero = 0;
        
        String mensaje2 = numero > 0? "Positivo" :
                          numero < 0? "Negativo" : "Cero";
        System.out.println(mensaje2);
        
    }
}
