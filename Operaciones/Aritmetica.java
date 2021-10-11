package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // CONSTRUCTOR VACÍO - Sirve para construir un objeto
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    // SOBRECARGA DE CONSTRUCTORES - Constructor con dos parámetros
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos o parámetros");
    }

    // Método de la clase sin retorno
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    // Método de la clase con retorno
    public int sumarConRetorno(){
        return this.a + this.b;
    }

    // MÉTODO CON PARÁMETROS
    public int sumarConParametros(int a, int b){
        // aquí estamos modificando el valor de los atributos anteriores
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
