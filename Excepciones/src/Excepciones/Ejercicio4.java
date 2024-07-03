package Excepciones;
public class Ejercicio4 {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException: Cuando intentas acceder a un índice 
        //de un arreglo que no existe.
        
        int [] numeros = {1,2,3};
        
        try{
            System.out.println(numeros[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        
        
    }
}
