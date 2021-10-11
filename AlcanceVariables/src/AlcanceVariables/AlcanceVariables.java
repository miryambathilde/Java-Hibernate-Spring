package AlcanceVariables;

public class AlcanceVariables {
    public static void main(String[] args) {
        // VARIABLES LOCALES - Se crea y se destruye dentro de este método
        // no es accesible desde fuera de este método
        int a = 10;
        int b = 2;
        miMetodo();
    }

    public static void miMetodo(){
        System.out.println("Mi Método");
    }
}
