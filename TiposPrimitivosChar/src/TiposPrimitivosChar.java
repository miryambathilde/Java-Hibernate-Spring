
public class TiposPrimitivosChar {
    public static void main (String[] args){
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        // ahora vamos a hacerlo usando VAR
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar);
        
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
    }
}
