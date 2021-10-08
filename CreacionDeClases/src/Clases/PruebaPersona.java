package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        // instanciamos la clase Persona y la variable
        // creamos un objeto instanciando new + nombre de la clase (en este caso es un objeto de TIPO Persona)
        Persona persona1 = new Persona();
        //variable + atributo y le asignamos un valor
        persona1.nombre = "Miryam";
        persona1.apellido = "Bathilde";
        //aqui llamamos al metodo mostrarInformación, definido en la clase Persona
        // variable + metodo
        persona1.mostrarInformacion();

        // Creamos otro objeto de la clase Persona
        Persona persona2 = new Persona();
        persona2.nombre = "Sergio Tomas";
        persona2.apellido = "De Sousa";
        persona2.mostrarInformacion();
    }
}
