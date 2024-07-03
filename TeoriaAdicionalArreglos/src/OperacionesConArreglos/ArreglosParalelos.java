package OperacionesConArreglos;
import java.util.Scanner;
public class ArreglosParalelos {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        
        String [] nombres = new String[5];
        int [] edades = new int[5];
        
        for(int i=0; i<nombres.length; i++){
            System.out.printf("%d. Persona\n", i+1);
            System.out.printf("Nombre: ");
            nombres[i] = id.nextLine();
            System.out.printf("Edad: ");
            edades[i] = id.nextInt();
            id.nextLine();
        }
        
        System.out.printf("\n\n");
        
        for(int i=0; i<nombres.length; i++){
            System.out.printf("%-18s %2d [%s]\n", nombres[i], edades[i],
                    edades[i] >= 18? "Mayor de edad" : "Menor de edad");
        }
        
    }
}
