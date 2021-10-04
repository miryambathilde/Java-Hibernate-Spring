
public class PrecedenciaDeOperadores {
    
    public static void main(String args[]){
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 6 + 10 = 16
        
        // como la * y la / tienen precedencia sobre la suma, la suma será lo ultimo que ejecuta
        var resultado = 4 + 5 * 6 / 3; // 4 + ((5*6)/3): 30/3= 10+4
        System.out.println("resultado = " + resultado); // 14
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }
}
