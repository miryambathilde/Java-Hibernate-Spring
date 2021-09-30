
public class ConcatenaciónDeCadenas {

    public static void main(String args[]) {
        var usuario = "Miryam";
        var titulo = "Desarrolladora Web";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union); 
        //union = Miryam Desarrolladora Web
        
        var i = 3;
        var j = 4;
        
        // evaluación siempre de izquierda a derecha
        System.out.println(i + j); // 7
        //evaluación de izq a der, realiza suma
        System.out.println(i + j + usuario);// 7Miryam
        // contexto cadena, todo es una cadena
        System.out.println(usuario + i + j); // Miryam34 - Aqui no suma los num
        // uso de parentesis modifica la prioridad en la evaluacion
        // aqui si que lo suma, porque los parentesis toma la máxima prioridad
        System.out.println(usuario + (i + j));//Miryam7
    }
}
