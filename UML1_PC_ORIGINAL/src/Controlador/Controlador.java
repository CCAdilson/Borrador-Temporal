package Controlador;
import Modelo.LectorDatos;
import Vista.Vista;
public class Controlador {
    
    private LectorDatos lectorDatos;
    private Vista vista;

    public Controlador(LectorDatos lectorDatos, Vista vista) {
        this.lectorDatos = lectorDatos;
        this.vista = vista;
    }
    
    public void iniciar(){
        int opcion;
        
        do{
            
            vista.mostrarMenu();
            opcion = lectorDatos.leerEntero("Selecciona una opcion: ");
            
            switch(opcion){
                case 1 ->{
                    vista.mostrarMensaje("Has seleccionado la opcion 1.");
                }
                case 2 ->{
                    vista.mostrarMensaje("Has seleccionado la opcion 2.");
                }
                case 3 ->{
                    vista.mostrarMensaje("Saliendo...");
                }
                default ->{
                    System.out.println("Opcion no valida. Intenta de nuevo.");
                }
            }
            
        }while(opcion != 3);
        
        lectorDatos.cerrar();
        
    }
    
}
