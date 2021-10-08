package Clases;

// PUBLIC: palabra reservada que nos permite acceder a esa clase desde otros archivos de nuestro programa
// el NOMBRE de la CLASE SIEMPRE debe empezar en MAYUSCULA
public class Persona {
    // Atributos de la persona Clase
    String nombre;
    String apellido;

    // Metodos de la clase
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
