public class ZwykłyTekst implements Napis {     //zaimplementowanie interfejsu Napis w klasie ZwykłyTekst
    private String napis;                 //nasz napis - "nieedytowalny"

    public ZwykłyTekst(String napis) {          //obiekt tekst o wartości napis
        this.napis = napis;
    }

    @Override                             //nadpisanie metody
    public String pobierzZawartość() {
        return napis;
    }
}
