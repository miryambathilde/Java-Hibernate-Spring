
public class TiposPrimitivosBoolean {
    public static void main(String[] args){
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es true");
        }
        else {
            System.out.println("La bandera es false");
        }
        
        var edad = 15;
        //var esAdulto = edad >= 18;
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
    
}
