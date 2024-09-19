public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Jaś", "Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());

        osoba.setImie("Jan");
        System.out.println(osoba.getImie());

        System.out.println(osoba); //wywołana metoda toString()

        System.out.println("Liczba uczniów: " + Uczeń.liczbaUczniow);
        Uczeń uczen = new Uczeń("Ewa", "Mewa");
        System.out.println(uczen);
        System.out.println("Liczba uczniów: " + Uczeń.liczbaUczniow);
        Uczeń uczen2 = new Uczeń("Ada", "Pada");
        System.out.println(uczen2);
        System.out.println("Liczba uczniów: " + Uczeń.liczbaUczniow);
        Uczeń uczen3 = new Uczeń("Staś", "Paś");
        System.out.println(uczen3);
        System.out.println("Liczba uczniów: " + Uczeń.liczbaUczniow);

    }
}