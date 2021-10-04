
public class OperadoresUnarios {
        public static void main(String args[]){
            // operador de cambio de signo, invertimos el valor
            var a = 3;
            var b = -a;
            System.out.println("a = " + a); // 3
            System.out.println("b = " + b); // -3
            
            // operador de negación para boolean
            var c = true;
            var d = !c;
            System.out.println("c = " + c); // true
            System.out.println("d = " + d); // false
            
            // INCREMENTO operadores de incremento
            // 1. PREINCREMENTO (simbolo antes de la variable)
            var e = 3;
            var f = ++e; // primero se incrementa la variable y después se utiliza su valor
            System.out.println("e = " + e); // 4
            System.out.println("f = " + f); // 4
            
            // 2. POSTINCREMENTO (simbolo despues de la variable)
            var g = 5;
            var h = g++; // primero se utiliza el valor de la variable y despues se incrementa (queda un incremento pendiente)
            System.out.println("g = " + g); // 6: teniamos pendiente un incremento por eso imprime 6
            System.out.println("h = " + h); // 5
            
            // DECREMENTO 
            // 1. PREDECREMENTO (simbolo antes de la variable)
            var i = 2;
            var j = --i; // primero se decrementa la variable y después se utiliza su valor
            System.out.println("i = " + i); // 1
            System.out.println("j = " + j); // 1
            
            // 2. POSTDECREMENTO (simbolo despues de la variable)
            var k = 4;
            var l = k--; //primero se utiliza el valor de la variable y despues se decrementa (queda un decremento pendiente)
            System.out.println("k = " + k); // 3 - imprime 3 porque tenia un decremento pendiente
            System.out.println("l = " + l); // 4
            
        }

}
