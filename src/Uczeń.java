public class Uczeń extends Osoba implements Dyzurny{
    //dziedziczenie - dziedziczymy wszystko public i protected

    private int nrEwidencyjny;
    public static int liczbaUczniow = 0;

    public Uczeń(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaUczniow++;
        nrEwidencyjny = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczeń:" +
                "imie:"+getImie()+
                " nazwisko: "+getNazwisko()+
                " nrEwidencyjny=" + nrEwidencyjny;
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Ścieram tablicę");
    }
}
