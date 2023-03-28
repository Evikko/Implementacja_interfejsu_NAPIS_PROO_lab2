public class Klamry extends Otoczenie {
    public Klamry(Napis zawartość) {
        super(zawartość);
    }

    public Klamry(String zawartość) {
        super(zawartość);
    }

    @Override
    public String pobierzZawartość() {
        return "{" + zawartość.pobierzZawartość() + "}";
    }
}
