
import java.util.Scanner;


public class ScannerClass {
    public static void main(String args[]){
        System.out.println("Escribe tu nombre:");
        //clase scanner
        // Systema.in = in es de input
        Scanner consola = new Scanner(System.in);
        // el metodo nextLine lo que hace es detener la ejecución del programa
        // y no vuelve a ejecutarse hasta que el usuario haya introducido los datos
        // y una vez que le da a enter, el valor introducido se asigna automáticamente a la var usuario
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe tu titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
    }
           
}
