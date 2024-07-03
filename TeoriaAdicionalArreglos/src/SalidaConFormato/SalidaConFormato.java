package SalidaConFormato;
import java.util.Date;
public class SalidaConFormato {
    public static void main(String[] args) {
        
        String message = "I love programming!";
        
        System.out.printf("%s%n", message);
        System.out.printf("%S%n", message);
        System.out.printf("'%28s'%n", message);
        System.out.printf("'%-28s'%n", message);
        System.out.printf("'%16.10s'%n", message);
        System.out.printf("'%-12.6s'%n", message);
        
        System.out.printf("\n");
        
        Date today = new Date();
        
        System.out.printf("%tD\n", today);
        System.out.printf("%tT\n", today);
    }
}
