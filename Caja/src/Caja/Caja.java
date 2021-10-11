package Caja;

public class Caja {
    // ATRIBUTOS DE LA CLASE
    int ancho;
    int alto;
    int profundo;

    // CONSTRUCTOR VACÍO
    public Caja() {}

    // CONSTRUCTOR CON ARGUMENTOS O PARÁMETROS
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // METODO PARA CALCULAR EL VOLUMEN
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
