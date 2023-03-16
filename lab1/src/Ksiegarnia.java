import java.util.Arrays;
import java.util.Scanner;

public class Ksiegarnia {
    String adres; 
    Typ typ;
    double [] mPrzychod;

    Ksiegarnia(String adres, Typ typ, double [] mPrzychod) {
        this.adres = adres;
        this.typ = typ;
        this.mPrzychod = mPrzychod;
    }

    public void wypiszNajwiekszyPrzychod () {
        double max = Arrays.stream(this.mPrzychod).max().getAsDouble();  
        System.out.println("Przychód max: " + max);
    }

    public double przychodZnMiesiecy(int n) {
        double suma = 0;

        for (int i = 0; i < n; i++) {
            suma = suma + this.mPrzychod[i];
        }

        return suma;
    }

    public void dodajKsiezke (boolean ktory) {
        Ksiazka ksiazka;
        Scanner scan = new Scanner(System.in);
        if (ktory) {
            double cena = 39.99;
            System.out.println("Podaj tytul: ");
            String uTytul = scan.nextLine();
            System.out.println("Podaj ilosc stron: ");
            int iloscStron = scan.nextInt();
            ksiazka = new Ksiazka(uTytul, cena, iloscStron);
        } else {
            System.out.println("Podaj tytul: ");
            String uTytul = scan.nextLine();
            ksiazka = new Ksiazka(uTytul);
        }

        scan.close();
        ksiazka.info();
    }
}