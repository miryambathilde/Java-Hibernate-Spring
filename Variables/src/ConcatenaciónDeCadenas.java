
public class ConcatenaciónDeCadenas {

    public static void main(String args[]) {
        var usuario = "Miryam";
        var titulo = "Desarrolladora Web";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union); 
        //union = Miryam Desarrolladora Web
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // 7
        System.out.println(i + j + usuario);// 7Miryam
        System.out.println(usuario + i + j); // Miryam34 - Aqui no suma los num
    }
}
