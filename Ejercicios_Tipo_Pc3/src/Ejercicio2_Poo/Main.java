package Ejercicio2_Poo;
public class Main {
    public static void main(String[] args) {
        
        //Crear productos
        Producto producto1 = new Producto("Laptop", 1500, 10);
        Producto producto2 = new Producto("Mouse", 25.00, 50);
        
        //Crear empleados
        Empleado empleado1 = new Empleado("Juan Perez", "E001", "Cajero");
        Empleado empleado2 = new Empleado("Ana Lopez", "E002", "Vendedor");
        
        //Crear tienda
        Tienda tienda = new Tienda("Tech Store", "Avenida Principal 522");
        
        //Agregar productos y empleados a la tienda
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarEmpleado(empleado1);
        tienda.agregarEmpleado(empleado2);
        
        //Registrar ventas
        tienda.registrarVenta(producto1, empleado1, 2, "2024-06-27");
        tienda.registrarVenta(producto2, empleado2, 5, "2024-06-28");
        
        //Imprimir informacion de la tienda
        System.out.println(tienda.toString());
        
        System.out.println("");
        
        //Listar productos de la tienda
        System.out.println("Productos en la tienda: ");
        for(Producto producto : tienda.getProductos()){
            System.out.println(producto.toString());
        }
        
        System.out.println("");
        
        //Listar empleados en la tienda
        System.out.println("Empleados en la tienda: ");
        for(Empleado empleado : tienda.getEmpleados()){
            System.out.println(empleado.toString());
        }
        
        System.out.println("");
        
        //Listar ventas registradas
        System.out.println("Ventas registradas: ");
        for(Venta venta : tienda.getVentas()){
            System.out.println(venta.toString());
        }
        
    }
}
