
public class OperadoresCondicionales {
    
    public static void main(String args[]){
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        // vamos a comprobar si a se encuentra entre el rango valor minimo y maximo
        
        // AND: && se deben cumplir todas las condiciones
        var resultado = a >= valorMinimo && a <= valorMaximo; // TRUE
        if(resultado){
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        // OR: || se debe de cumplir al menos una de las condiciones
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if(vacaciones || diaDescanso) {
            System.out.println("Hoy tienes día de descanso");
        } else {
            System.out.println("Hoy te toca trabajar");
        }
    }
}
