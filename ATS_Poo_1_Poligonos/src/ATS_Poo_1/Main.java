package ATS_Poo_1;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner id = new Scanner(System.in);
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {

            do {
                System.out.println("Digite que poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = id.nextInt();
            } while (opcion<1 || opcion>2);
            
            switch(opcion){
                case 1 -> {
                    llenarTriangulo();
                }
                case 2 -> {
                    llenarCuadrado();
                }
            }
            
            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = id.next().charAt(0);
            System.out.println("");
        } while(respuesta == 's' || respuesta == 'S');

    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.print("\nDigite el lado1 del triangulo: ");
        lado1 = id.nextDouble();
        System.out.print("Digite el lado2 del triangulo: ");
        lado2 = id.nextDouble();
        System.out.print("Digite el lado3 del triangulo: ");
        lado3 = id.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        poligonos.add(triangulo);
    }
    
    public static void llenarCuadrado(){
        double lado1, lado2;
        
        System.out.print("\nDigite el lado1 del rectangulo: ");
        lado1 = id.nextDouble();
        System.out.print("Digite el lado2 del rectangulo: ");
        lado2 = id.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligonos.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        
        for(Poligono poligono : poligonos){
            System.out.println(poligono.toString());
            System.out.println("Area: "+poligono.area());
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
    
        llenarPoligono();
        mostrarResultados();
    } 
 
}
