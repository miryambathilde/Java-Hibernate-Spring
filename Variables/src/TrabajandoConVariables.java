
public class TrabajandoConVariables {
    // el metodo main nos permite ejecutar nuestro programa
    public static void main(String args[]){
        // DEFINIMOS LA VARIABLE
        // EL VALOR DE LA VARIABLE DE TIPO INT ES: LITERAL DE TIPO ENTERO
        // primero declaramos nuestra variable, 
        // siempre empieza indicando el tipo de dato de la variable
        int miVariableEntera = 10;
        // y ahora para que pinte en consola
        System.out.println(miVariableEntera);
        // MODIFICAMOS EL VALOR DE LA VARIABLE 
        //ahora vamos a reutilizar la variable y le vamos a reasignar el valor
        // una vez que ha sido definida anteriormente no es necesario indicar 
        //el tipo de dato
        miVariableEntera = 5;
        // ahora vamos a pintar en consola el valor: atajo sout + tabulador
        System.out.println(miVariableEntera);
        
        // DEFINIMOS VARIABLE DE TIPO STRING
        // EL VALOR DE LA VARIABLE DE TIPO STRING ES: LITERAL DE TIPO CADENA
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        // MODIFICAMOS EL VALOR DE LA VARIABLE DE TIPO STRING
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);
        
        // VAR - inferencia de tipos en Java
        // java infiere el tipo de variable segun el tipo del literal
        var miVariableEntera2 = 20;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Inferencia de datos";
        // atajo soutv
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //EJEMPLO PARA DEFINIR VARIABLES EN JAVA
        var miVariable = 1;
        System.out.println("miVariable = " + miVariable);
        var _miVariable = 2;
        System.out.println("_miVariable = " + _miVariable);
        var $miVariable = 3;
        System.out.println("$miVariable = " + $miVariable);
    }
}
