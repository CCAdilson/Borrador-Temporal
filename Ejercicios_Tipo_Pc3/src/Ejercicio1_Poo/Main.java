package Ejercicio1_Poo;
public class Main {
    public static void main(String[] args) {

        //Agregar libros a la biblioteca
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, "Ficción", 96);
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "Fantasía", 223);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Novela", 1072);
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle Principal 523", "453594374");
        
        //Imprimir informacion de la biblioteca
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);
        
        
        
        //Listar libros en la biblioteca
        System.out.println(biblioteca.toString());
        System.out.println("\nLibros en la biblioteca");
        System.out.println(biblioteca.listarLibros());
        
        //Imprimir informacion de los libros y su clasificacion por edad
        System.out.println(libro1.toString() + " - Clasificación: " + libro1.clasificacionEdad());
        System.out.println(libro2.toString() + " - Clasificación: " + libro2.clasificacionEdad());
        System.out.println(libro3.toString() + " - Clasificación: " + libro3.clasificacionEdad());

    }
}
