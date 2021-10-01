
public class CaracteresEspeciales {
   public static void main(String args[]){
       var nombre = "Carla";
       
       // salto de linea
       System.out.println("Nueva linea: \n" + nombre);
       // tabulador
       System.out.println("Tabulador: \t" + nombre);
       // retroceso - por cada retroceso, retrocede un caracter
       System.out.println("Retroceso: \b" + nombre);
       System.out.println("Retroceso: \b\b" + nombre);
       // comilla simple
       System.out.println("Comilla simple: \'" + nombre + "\'");
       // comilla doble
       System.out.println("Comilla doble: \"" + nombre + "\"");
   } 
}
