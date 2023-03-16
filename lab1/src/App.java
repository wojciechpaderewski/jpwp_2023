enum Typ {
    JEZYKOWA,
    TECHNICZNA,
    RELIGIJNA,
    ROZRYWKOWA
  }

public class App {
    public static void main(String[] args) throws Exception {
        Ksiegarnia ksiazka = new Ksiegarnia(
            "ul. Ksiegowa 1",
            Typ.TECHNICZNA,
            new double[] { 1425.5,1320.81,3552.2 }
        );

        ksiazka.wypiszNajwiekszyPrzychod();
        System.out.println(ksiazka.przychodZnMiesiecy(2));
        ksiazka.dodajKsiezke(true);
    }
}
