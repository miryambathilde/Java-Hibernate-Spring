
public class OperadoresDeIgualdadYRelacionales {
        public static void main(String args[]){
            var a = 3;
            var b = 2;
            
            // operador de igualdad: == 
            // devuelve un boolean
            var c = (a == b);
            System.out.println("c = " + c); // FALSE
            
            // operador de diferencia: !=
            // devuelve un boolean
            var d = (a !=b);
            System.out.println("d = " + d); // TRUE
            
            // OPERADOR DE IGUALDAD EN CADENAS (STRING): método EQUALS
            var cadena1 = "Hola";
            var cadena2 = "Adios";
            var e = cadena1 == cadena2; // se compara la referencia del objeto
            System.out.println("e = " + e); // FALSE
            
            var f = cadena1.equals(cadena2);// se compara el contenido del objeto
            System.out.println("f = " + f);
        }

}
