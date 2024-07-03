package App;
import Vista.LectorDatos;
import Controlador.Controlador;
public class App {
    public static void main(String[] args) {
        
        LectorDatos lectorDatos = new LectorDatos();
        Controlador controlador = new Controlador(lectorDatos);
        
        controlador.iniciar();
        
    }
}
