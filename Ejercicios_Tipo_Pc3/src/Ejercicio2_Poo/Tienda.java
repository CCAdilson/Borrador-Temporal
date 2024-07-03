package Ejercicio2_Poo;
import java.util.ArrayList;
public class Tienda {
    
    private String nombre;
    private String direccion;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados;
    private ArrayList<Venta> ventas;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void registrarVenta(Producto producto, Empleado empleado, int cantidad, String fecha){
        if(producto.getCantidad() >= cantidad){
            Venta venta = new Venta(producto, empleado, cantidad, fecha);
            ventas.add(venta);
        }else{
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+", Direccion: "+direccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
   
    
    
}
