public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Jaś", "Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());

        osoba.setImie("Jan");
        System.out.println(osoba.getImie());

    }
}