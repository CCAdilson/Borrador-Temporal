package Excepciones;
public class Ejercicio3 {
    public static void main(String[] args) {
        
        //NullPointerException: Cuando no has inicializado un objeto antes de usarlo.
        
        String texto = null;
        
        try{
            System.out.println(texto.length());
        }catch(NullPointerException e){
            System.out.println("Error: Intestate acceder a un objeto nulo.");
        }
        //El bloque finally es opcional
        
        
    }
}
