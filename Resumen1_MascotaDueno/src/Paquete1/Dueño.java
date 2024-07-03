package Paquete1;

import Paquete1.Mascota;

public class Dueño {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota[] mascotas;
    private int contadorMascota;
    
    public Dueño(){
        this.mascotas = new Mascota[5];
        contadorMascota = 0;
    }

    public Dueño(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascotas = new Mascota[5];
        contadorMascota = 0;
    }

    public void nombreMascota(){
        for(Mascota mascota : mascotas){
            if(mascota != null){
                System.out.println(mascota.getNombre());
            }
        }
    }
    
    public void agregarMascota(Mascota mascota){
        if(contadorMascota < 5){
            mascotas[contadorMascota] = mascota;
            contadorMascota++;
        }else{
            throw new RuntimeException("No se pueden agregar más de 5 mascotas");
            //throw new RuntimeException("No se puede agregar mas mascotas. Limite alcanzado.");
        }
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+" - Direccion: "+direccion+" - Telefono: "+telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }
    
}