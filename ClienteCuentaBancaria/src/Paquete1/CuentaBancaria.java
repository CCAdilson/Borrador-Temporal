package Paquete1;
public class CuentaBancaria {
    
    private String numero_cuenta;
    private String fecha_apertura;
    private float saldo_actual;

    public CuentaBancaria(String numero_cuenta, String fecha_apertura, float saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.fecha_apertura = fecha_apertura;
        this.saldo_actual = saldo_actual;
    }

    @Override
    public String toString(){
        return "Numero de cuenta: "+numero_cuenta+" - Saldo: "+saldo_actual;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public float getSaldo_actual() {
        return saldo_actual;
    }
    
}
