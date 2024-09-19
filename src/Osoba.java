import java.util.Scanner;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    //modyfikatory dostępu
    /*
     public - dostępne wszędzie
     private - dostępne tylko w tej klasie
     protected - dostępne w tej klasie i klasie pochodnej
     (w javie protected to dostępne też w ramach pakietu)

     brak modyfikatora - dostępne w pakiecie
    */
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

    //metody dostępowe


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        System.out.println("Podaj hasło");
        Scanner skaner = new Scanner(System.in);
        String haslo = skaner.next();
        if(haslo.equals("qwe123") ){
            //przy typach złożonych nie ma porównania tylko .equals() i .contains()

            this.imie = imie;
        }
        else{
            System.out.println("Odmowa dostępu");
        }
    }

    @Override
    public String toString() {
        return "Osoba" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '.';
    }
}
