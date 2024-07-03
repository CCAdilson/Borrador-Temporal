package Paquete1;

public class Cliente {
    
    private String dni;
    private String apellidos;
    private String nombres;
    private String correo_electronico;
    private String direccion;
    private String fecha_nacimiento;
    private CuentaBancaria[] cuentas;
    private int contadorCuentas;
    
    public Cliente() {
        this.cuentas = new CuentaBancaria[5];
        this.contadorCuentas = 0;
    }

    public Cliente(String dni, String apellidos, String nombres, String correo_electronico, String direccion, String fecha_nacimiento) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cuentas = new CuentaBancaria[5];
        this.contadorCuentas = 0;
    }

    public void AgregarCuenta(CuentaBancaria nuevaCuenta) throws Exception{
        if(contadorCuentas < 5){
            cuentas[contadorCuentas] = nuevaCuenta;
            contadorCuentas++;
        }else{
            throw new Exception("No se pueden agregar más de 5 cuentas.");
        }
    }
    
    public void MostrarCuentas(){
        for(int i=0; i<contadorCuentas; i++){
            System.out.println(cuentas[i]);
        }
    }
    
    @Override
    public String toString(){
        return "Dni: "+dni+" - Apellidos: "+apellidos+", Nombres: "+nombres+
                "(Correo: "+correo_electronico+") - [Nro cuentas: "+contadorCuentas
                +"]";
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }

    public int getContadorCuentas() {
        return contadorCuentas;
    }

    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
    }
 
}
