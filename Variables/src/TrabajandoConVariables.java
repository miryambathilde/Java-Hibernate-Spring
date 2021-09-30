
public class TrabajandoConVariables {
    // el metodo main nos permite ejecutar nuestro programa
    public static void main(String args[]){
        // DEFINIMOS LA VARIABLE
        // primero declaramos nuestra variable, 
        // siempre empieza indicando el tipo de dato de la variable
        int miVariableEntera = 10;
        // y ahora para que pinte en consola
        System.out.println(miVariableEntera);
        // MODIFICAMOS EL VALOR DE LA VARIABLE 
        //ahora vamos a reutilizar la variable y le vamos a reasignar el valor
        // una vez que ha sido definida anteriormente no es necesario indicar el tipo de dato
        miVariableEntera = 5;
        // ahora vamos a pintar en consola el valor: atajo sout + tabulador
        System.out.println(miVariableEntera);
        
        // DEFINIMOS VARIABLE DE TIPO STRING
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        // MODIFICAMOS EL VALOR DE LA VARIABLE DE TIPO STRING
        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);
        
    }
}