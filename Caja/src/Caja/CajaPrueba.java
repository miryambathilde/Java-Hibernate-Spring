package Caja;

public class CajaPrueba {
    public static void main(String[] args) {

            // ASIGNAMOS EL VALOR DE LOS ATRIBUTOS DE LA CLASE
            int medidaAncho = 3;
            int medidaAlto = 2;
            int medidaProf = 6;

            // CREAMOS UN OBJETO DE LA CLASE CAJA
            Caja caja1 = new Caja();
            // ASIGNAMOS ATRIBUTOS
            caja1.ancho = medidaAncho;
            caja1.alto = medidaAlto;
            caja1.profundo = medidaProf;
            int resultado = caja1.calcularVolumen();

            System.out.println("resultado volumen de caja 1: " + resultado + " cm");

            // CREAMOS UN OBJETO NUEVO ESTA VEZ PASANDO LOS ARGUMENTOS
            // TRABAJAMOS CON EL CONSTRUCTOR QUE TIENE ARGUMENTOS
            Caja caja2 = new Caja(2, 4, 6);
            System.out.println("resultado volumen de caja 2: " + caja2.calcularVolumen() + " cm");
    }
}
