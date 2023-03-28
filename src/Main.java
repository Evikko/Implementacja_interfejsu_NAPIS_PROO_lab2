abstract class Tekst implements Napis {
    String napis = "PROO";
    public String getNapis() {
        return napis;
    }
    public Tekst(String napis){
        this.napis = napis;
    }
}


public class Main {
    Tekst słowo = new Tekst()

    public static void main() {
        System.out.println(słowo.getNapis);
    }
}