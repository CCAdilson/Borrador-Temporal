package Paquete1;
public class Main {
    public static void main(String[] args) throws Exception {
        
        //CuentaBancaria cuenta1 = new CuentaBancaria("5245705435", "01/01/2020", 1500f);
        //CuentaBancaria cuenta2 = new CuentaBancaria("5248801435", "07/05/2022", 3500f);
        //CuentaBancaria cuenta3 = new CuentaBancaria("5248444435", "07/05/2024", 4000f);
        
        Cliente cliente = new Cliente("40508973", "Perez", "Juan", "juan.perez@gmail.com", "Calle Las Flores 123", "01/01/1990");
        
        try {
            CuentaBancaria cuenta1 = new CuentaBancaria("001", "01/01/2020", 1500.0f);
            CuentaBancaria cuenta2 = new CuentaBancaria("002", "01/02/2020", 2000.0f);
            
            cliente.AgregarCuenta(cuenta1);
            cliente.AgregarCuenta(cuenta2);
            cliente.AgregarCuenta(cuenta2);
            cliente.AgregarCuenta(cuenta2);
            cliente.AgregarCuenta(cuenta2);
            cliente.AgregarCuenta(cuenta2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cliente.MostrarCuentas();
    }
}
