public class Kwadraty extends Otoczenie {
    public Kwadraty(Napis zawartość) {
        super(zawartość);
    }

    public Kwadraty(String zawartość) {
        super(zawartość);
    }

    @Override
    public String pobierzZawartość() {
        return "[" + zawartość.pobierzZawartość() + "]";
    }
}
