package Ejercicio2_Poo;
public class Venta {
    
    private Producto producto;
    private Empleado empleado;
    private int cantidad;
    private String fecha;

    public Venta(Producto producto, Empleado empleado, int cantidad, String fecha) {
        this.producto = producto;
        this.empleado = empleado;
        this.cantidad = cantidad;
        this.fecha = fecha;
        producto.vender(cantidad);
    }
    
    @Override
    public String toString(){
        return "Producto: "+producto.getNombre()+", Empleado: "+empleado.getNombre()+
                ", Cantidad: "+cantidad+", Fecha: "+fecha;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
