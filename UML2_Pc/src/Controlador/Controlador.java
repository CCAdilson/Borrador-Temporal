package Controlador;
import Modelo.Estudiante;
import Vista.LectorDatos;
public class Controlador {
    
    private Estudiante[] estudiantes;
    private LectorDatos lectorDatos;
    private int cantidadEstudiantes;
    
    public Controlador(LectorDatos lectorDatos){
        this.lectorDatos = lectorDatos;
        this.estudiantes = new Estudiante[100]; // Asignamos un tamaño fijo al arrelgo
        this.cantidadEstudiantes = 0;
    }
    
    public void iniciar(){
        int opcion;
        do{
            mostrarMenu();
            opcion = lectorDatos.leerEntero("Elige la opcion: ");
            switch(opcion){
                case 1->{
                    agregarEstudiante();
                }
                case 2->{
                    mostrarEstudiante();
                }
                case 3->{
                    buscarEstudiante();
                }
                case 4->{
                    System.out.println("Saliendo del sistema.");
                }
                default->{
                    System.out.println("Opcion no valida.");
                }
            }
        }while(opcion != 4);
        lectorDatos.cerrar();
    }
    
    private void mostrarMenu(){
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Mostrar Estudiante");
        System.out.println("3. Buscar Estudiante");
        System.out.println("4. Salir");
    }
    
    private void agregarEstudiante(){
        String nombre = lectorDatos.leerCadena("Ingrese el nombre del estudiante: ");
        int edad = lectorDatos.leerEntero("Ingresa la edad del estudiante: ");
        double promedio = lectorDatos.leerDoble("Ingresa el promedio del estudiante: ");
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes++] = new Estudiante(nombre, edad, promedio);
            System.out.println("Estudiante agregado.");
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }
    
    private void mostrarEstudiante(){
        if(cantidadEstudiantes == 0){
            System.out.println("No hay estudiantes registrados.");
        } else {
            for(int i = 0; i < cantidadEstudiantes; i++){
                System.out.println(estudiantes[i]);
            }
        }
    }
    
    private void buscarEstudiante(){
        String nombre = lectorDatos.leerCadena("Ingresa el nombre del estudiante a buscar: ");
        for(Estudiante estudiante : estudiantes){
            if(estudiante.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(estudiante);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
    
}
