package Paquete1;

import Paquete1.Dueño;
import Paquete1.Mascota;

public class Main {
    public static void main(String[] args) {
        
        Dueño dueño = new Dueño("Juan Perez", "Called Lurin", "663-434-666");
        System.out.println(dueño.toString());
        
        Mascota mascota1 = new Mascota("Rex", "Perro", "Pitbull", 2);
        Mascota mascota2 = new Mascota("Miau", "Gato", "Siames", 4);
        
        dueño.agregarMascota(mascota1);
        dueño.agregarMascota(mascota2);
        
        dueño.nombreMascota();
        
        System.out.println(mascota1);
        System.out.println(mascota2);
        
        System.out.println("\nEdad de "+mascota1.getNombre()+": "+mascota1.getEdad());
        System.out.println("Edad de "+mascota2.getNombre()+": "+mascota2.getEdad());
        
        Mascota.peligrosidad(mascota1.getRaza());
        Mascota.peligrosidad(mascota2.getRaza());
        
        
    }
}