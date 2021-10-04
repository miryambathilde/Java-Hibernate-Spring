
public class OperadoresTernarios {
    
    public static void main(String args[]){
        // PARANTESIS CONDICION QUE EVALUA
        // SI ES VERDADERA EJECUTA ?
        // SI EL FALSA EJECUTA :
        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        var numero2 = 9;
        resultado = (numero % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultado = " + resultado);
        resultado = (numero2 % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultado = " + resultado);
    }
}
