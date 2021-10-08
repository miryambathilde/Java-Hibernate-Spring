package Bucles;

public class EtiquestasLabels {
    public static void main(String[] args) {
        // NO ES UNA BUENA PRACTICA PORQUE PUEDE ROMPER CICLOS ANIDADOS
        inicio:
        for (int contador = 0; contador < 4; contador++) {
            // queremos que nos imprima los numeros pares
            // como sólo queremos que lo ejecute una vez, ponemos la palabra break
            // AQUI LE DECIMOS QUE SI EL NUMERO NO ES PAR, CONTINUE Y NOS IMPRIMA EL CONTADOR
            if (contador % 2 != 0) {
                continue inicio; // ir a la linea de codigo de la etiqueta
            }
            System.out.println("contador = " + contador);
        }
    }
}
