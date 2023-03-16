public class Ksiazka {
    String tytul;
    int iloscStron;
    double cena;

    Ksiazka(String tytul) {
        this.tytul = tytul;
    }

    Ksiazka(String tytul, double cena, int iloscStron) {
        this.tytul = tytul;
        this.cena = cena;
        this.iloscStron = iloscStron;
    }

    void info () {
        System.out.println("Ksiezka "+  this.tytul + " kosztuje " + this.cena + " i ma " + this.iloscStron + " stron" );
    }
    
}
