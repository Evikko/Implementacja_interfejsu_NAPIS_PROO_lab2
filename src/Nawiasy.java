public class Nawiasy extends Otoczenie {        //dodatkowa klasa w otoczeniu - dziedziczenie po Otoczeniu

    public Nawiasy(Napis zawartość) {
        super(zawartość);                   //wywołanie konstruktora klasy wyżej
    }

    public Nawiasy(String zawartość) {      //konstruktor korzystający z obiektu String
        super(zawartość);
    }

    @Override                                           //nadpisanie metody
    public String pobierzZawartość() {
        return "(" + zawartość.pobierzZawartość() + ")";    //zwraca "(naszTekst)"
    }

}
