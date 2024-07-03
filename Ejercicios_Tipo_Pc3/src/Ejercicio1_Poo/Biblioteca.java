
package Ejercicio1_Poo;

public class Biblioteca {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private Libro[] libros = new Libro[5];
    
    int nLibros = 0;

    public Biblioteca(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nNombre: "+nombre+
                "\nDireccion: "+direccion+
                "\nTelefono: "+telefono;
    }
    
    public String listarLibros(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<nLibros; i++){
            sb.append(libros[i].getTitulo()).append("\n");
        }
        return sb.toString();
    }
    
    public void agregarLibros(Libro libro){
        if(nLibros < 5){
            libros[nLibros] = libro;
            nLibros++;
        }
    }
    
}
