
import java.util.Scanner;


public class DetallesLibro {
    public static void main(String args[]){
        System.out.println("Proporciona el titulo:");
        //clase scanner
        // Systema.in = in es de input
        Scanner consola = new Scanner(System.in);
        // el metodo nextLine lo que hace es detener la ejecución del programa
        // y no vuelve a ejecutarse hasta que el usuario haya introducido los datos
        // y una vez que le da a enter, el valor introducido se asigna automáticamente a la var usuario
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo);
        
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
