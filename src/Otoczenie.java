public abstract class Otoczenie implements Napis{       //referencja do zawartości
    protected Napis zawartość;                          //pole typu napis, protected - jeśli coś po niej dziedziczy to można mieć dostęp

    protected Otoczenie(Napis zawartość) {              //konstruktor "napisu"(argumenty - typ nazwa zmiennej)
        this.zawartość = zawartość;                     //this.odwołanie_do_pola = wartość
    }

    protected Otoczenie(String zawartość) {             //konstruktor korzystający z obiektu String
        this.zawartość = new ZwykłyTekst(zawartość);
    }
}

