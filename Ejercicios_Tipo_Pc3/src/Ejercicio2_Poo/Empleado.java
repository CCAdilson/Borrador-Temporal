package Ejercicio2_Poo;
public class Empleado {
    
    private String nombre;
    private String id;
    private String puesto;

    public Empleado(String nombre, String id, String puesto) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", Id: "+id+", Puesto: "+puesto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
 
}
