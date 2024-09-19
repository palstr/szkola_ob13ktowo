public class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        //zmienne lokalne imie, nazwisko i wiek

        this.imie = imie;
        //this.imie to pole klasy
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //przeciążanie konstruktora
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7; //wiek to pole klasy
    }
}
