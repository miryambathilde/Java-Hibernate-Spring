
public class OperadoresAritmeticos {
    public static void main(String args[]){
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        resultado = a / b;
        System.out.println("resultado division = " + resultado);
        
        //3.0 = 3D o 3F
        var resultado2 = 3F / b;
        System.out.println("resultado division = " + resultado2);
        
        // operador de modulo - devuelve el resto entero de la división
        resultado = a % b;
        System.out.println("resultado modulo:  = " + resultado);
        
        // comprobar si un numero es par o impar
        // en el if else no es necesario las llaves si sólo hay una línea de código dentro
        if(a % 2 == 0)
            System.out.println("El numero a es par");
        else 
            System.out.println("El numero a es impar");
        
        if(b % 2 == 0)
            System.out.println("El numero b es par");
        else 
            System.out.println("El numero b es impar");
        
    }
}
