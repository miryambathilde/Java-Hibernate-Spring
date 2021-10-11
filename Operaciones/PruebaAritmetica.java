package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        // definimos un nuevo objeto de la clase Aritmetica
        // CONSTRUCTOR VACÍO
        Aritmetica aritmetica1 = new Aritmetica(); // imprime "Ejecutando constructor"
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        // Creamos un objeto y usamos el contructor con parámetros
        // CONSTRUCTOR SOBRECARGADO
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);

        // asignamos el valor de los atributos del objeto aritmetica1
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        // vamos a trabajar con el método que tiene retorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde suma con retorno = " + resultado);

        aritmetica1.sumarConParametros(5, 8);
        System.out.println("resultado desde suma con parámetros = " + resultado);
    }
}
