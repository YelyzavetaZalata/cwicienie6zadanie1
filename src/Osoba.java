import java.util.Scanner;

class Osoba{
    public static String Nazwisko;
    public static String Imie;
    public static String  ulica;
    public static String kod;
    public static String miasto;
    public void inicjuj(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz nazwisko: ");
        Nazwisko = scan.next();
        System.out.println("Wpisz imię: ");
        Imie = scan.next();
        System.out.println("Wpisz ulicę: ");
        ulica = scan.next();
        System.out.println("Wpisz kod: ");
        kod = scan.next();
        System.out.println("Wpisz miasto: ");
        miasto = scan.next();
    }
    public void drukuj(){
        System.out.println("Nazwisko: " + Nazwisko);
        System.out.println("Imię: " + Imie);
        System.out.println("ulica: " + ulica);
        System.out.println("kod: " + kod);
        System.out.println("miasto: " + miasto);
    }
}
