
public class TiposPrimitivosFlotantes {

    public static void main(String[] args) {
        /*
            tipos pimitivos de tipo flotante: float(32), double(64 bytes
        */
        
        float numeroFloat = (float)10.1;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo tipo float: " + Float.MAX_VALUE);
        
        // E38F aqui empieza el exponencial //
        float numeroLFloat = (float)3.4028235E38D;
        System.out.println("numeroLFloat = " + numeroLFloat);
        
        double numeroDouble = 10.32;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo tipo double: " + Double.MAX_VALUE);
        
        double numeroLDouble = 1.7976931348623157E308;
        System.out.println("numeroLDouble = " + numeroLDouble);
    }
}
