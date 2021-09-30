
public class TiposPrimitivos {

    public static void main(String[] args) {
        /*
            tipos pimitivos enteros: byte(8), short(16), int(32), long(64 bytes)
        */
        
        byte numeroByte = 10;
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);
        
        byte numero1Byte = (byte)129;
        System.out.println("Valor byte: " + numero1Byte);
        
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        
        short numero1Short = (short)32768;
        System.out.println("Valor short: " + numero1Short);
        
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo: " + Integer.MAX_VALUE);
        
        // la l del final significa tipo long y pasa de 32 a 64 bytes
        int numero1Int = (int)2147483648L;
        System.out.println("numeroInt = " + numero1Int);
        
        long numeroLong = 10;
        System.out.println("Valor minimo: " + Long.MIN_VALUE);
        System.out.println("Valor maximo: " + Long.MAX_VALUE);    
        
        // F: FLOAT - D: DOUBLE 
        long numero1Long = (long)9223372036854775808F;
        System.out.println("numero1Long = " + numero1Long);
        
    }
}
