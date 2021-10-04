
public class OperadoresDeAsignacion {
    
    public static void main(String args[]){
        // operador de asignación: =
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        // operador de asignación pero de composición de SUMA: +=
        a += 1; // a = a + 1;
        System.out.println("a = " + a);
        
        a += 3; // a = a + 3;
        System.out.println("a = " + a);
        
        // operador de asignación pero de composición de RESTA: -=
        a -= 2; // a = a - 2;
        System.out.println("a = " + a);
        
        // operador de asignación pero de composición de MULTIPLICACION: *=
        a *= 3; // a = a * 3;
        System.out.println("a = " + a);
        
        // operador de asignación pero de composición de DIVISION: /=
        a /= 2; // a = a / 2;
        System.out.println("a = " + a);
        
        // operador de asignación pero de composición de MODULO: %=
        a %= 2; // a = a % 2;
        System.out.println("a = " + a);
    }
}
