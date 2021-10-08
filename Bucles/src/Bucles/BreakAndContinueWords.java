package Bucles;

public class BreakAndContinueWords {
    public static void main(String[] args) {

        for (int contador1 = 0; contador1 < 4; contador1++) {
            // queremos que nos imprima los numeros pares
            // como sólo queremos que lo ejecute una vez, ponemos la palabra break
            // AQUI LE DECIMOS QUE SI EL NUMERO NO ES PAR, CONTINUE Y NOS IMPRIMA EL CONTADOR
            if (contador1 % 2 != 0) {
                continue; // ir a la siguiente iteración
            }
            System.out.println("contador1 = " + contador1);
        }
        
        for (int contador = 0; contador < 3; contador++) {
            // queremos que nos imprima los numeros pares
            // como sólo queremos que lo ejecute una vez, ponemos la palabra break
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break;
            }
        }

    }
}
