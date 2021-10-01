
import java.util.Scanner;


public class ConversionTiposPrimitivos {
    public static void main(String args[]){
        // Conversión tipo String a un tipo Int: ParseInt
        var edad = Integer.parseInt("20"); 
        System.out.println("edad = " + (edad + 1)); //output 21
        var edad1 = "20";
        System.out.println("edad1 = " + (edad + 1));// output 201
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
//        // Pedir un valor con la clase Scanner
//        var consola = new Scanner(System.in);
//        System.out.println("Introduce tu edad: ");
//        // usamos parseInt porque edad es de tipo string y lo pasamos a int
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        // Conversión de tipo int a tipo String: String.valueOf
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        // Pasar de tipo String a Char: charAt(i) 
        var caracter = "hola".charAt(1); //index
        System.out.println("caracter = " + caracter);
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
}
