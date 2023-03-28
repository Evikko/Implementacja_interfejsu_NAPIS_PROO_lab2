public class Main {
    public static void main(String[] args) {
        Napis napis1 = new ZwykłyTekst("PROO");
        System.out.println(napis1.pobierzZawartość());

        Otoczenie nawiasy = new Nawiasy(napis1);                            //polimorfizm
        System.out.println(nawiasy.pobierzZawartość());

        Otoczenie kwadraty = new Kwadraty(napis1);
        System.out.println(kwadraty.pobierzZawartość());

        Otoczenie klamry = new Klamry(napis1);
        System.out.println(klamry.pobierzZawartość());

        Otoczenie udekorowany = new Klamry(new Nawiasy(new Klamry(napis1)));
        System.out.println(udekorowany.pobierzZawartość());

        Otoczenie string = new Klamry(new Nawiasy(new Kwadraty("PROOOOOOOOO")));
        System.out.println(string.pobierzZawartość());

        Otoczenie string1 = new Klamry(new Nawiasy(new Kwadraty(new Nawiasy("PROOOOOOOOO"))));
        System.out.println(string1.pobierzZawartość());

        Otoczenie string2 = new Klamry(new Nawiasy(new Kwadraty(new Nawiasy(new Klamry("PROOOOOOOOO")))));
        System.out.println(string2.pobierzZawartość());
    }

}