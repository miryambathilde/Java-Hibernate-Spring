
public class IfElse {
    public static void main (String args[]){
        
        var condicion = true;
        
        if (condicion){
            System.out.println("Condición verdadera");
        }
        else {
            System.out.println("Condición falsa");
        }
        
        // vamos a convertir un numero en letra
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        // con el else if evitamos que el programa se ejecute en cada condicion a evaluar
        // ya que en cuanto una condición se cumpla para su ejecución y no sigue
        if(numero == 1){
            numeroTexto = "Numero 1";
        }
        else if (numero == 2){
            numeroTexto = "Numero 2";
        }
        else if (numero == 3){
            numeroTexto = "Numero 3";
        }
        else if (numero == 4){
            numeroTexto = "Numero 4";
        }
//        else {
//            numeroTexto = "Numero no encontrado";
//        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
