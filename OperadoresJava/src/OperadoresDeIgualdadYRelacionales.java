
public class OperadoresDeIgualdadYRelacionales {

    public static void main(String args[]) {
        var a = 3;
        var b = 2;

        // operador de igualdad: == 
        // devuelve un boolean
        var c = (a == b);
        System.out.println("c = " + c); // FALSE

        // operador de diferencia: !=
        // devuelve un boolean
        var d = (a != b);
        System.out.println("d = " + d); // TRUE

        // OPERADOR DE IGUALDAD EN CADENAS (STRING): método EQUALS
        var cadena1 = "Hola";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2; // se compara la referencia del objeto
        System.out.println("e = " + e); // FALSE

        var f = cadena1.equals(cadena2);// se compara si el contenido de la cadena es el mismo
        System.out.println("f = " + f); // FALSE

        // OPERADORES RELACIONALES: MAYOR O IGUAL QUE / MENOR O IGUAL QUE
        // mayor que: >
        // mayor o igual: >=
        //var g = a > b; // TRUE
        var g = a >= b; // TRUE 
        System.out.println("g = " + g);

        // numero par o impar
        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar"); // como 3 es impar
        }

        var edad = 30;
        var adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }

    }

}
