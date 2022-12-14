
import java.util.Scanner;



public class Main {
    public interface wynagrodzenie {
        void salaryToPay(double NeedToH, double dolarsPerH);
        void salaryForOvertime(double HOfWork, double dolarsPerExtraH);
        void Premia(int YOfEx);

    }
    public void baza(){
        Osoba os = new Osoba();
        Kadra kad = new Kadra();
        int wybor = 0;
        int wybor2 = 0;
        System.out.println("1. dane osoby.");
        System.out.println("2. kadry osoby.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Co chcesz zrobić: ");
        wybor = scan.nextInt();
        if (wybor == 1){
            System.out.println("1. Zmienić dane osoby.");
            System.out.println("2. Wyszwietlicz dane osoby.");
            System.out.println("Co chcesz zrobić: " );
            wybor2 = scan.nextInt();
            if(wybor2 == 1){
                os.inicjuj();
                baza();
            }else if(wybor2 == 2){
                os.drukuj();
                baza();
            }else {
                System.out.println("WPISAłEś NIEPOPRAWNY WYBOR");
                baza();
            }

        }
        else if (wybor == 2){
            System.out.println("1. Zmienić wykształcenie,lata Doświadczenia, stanowisko osoby etc.");
            System.out.println("2. Wyszwietlicz wszystkie dane osoby.");
            System.out.println("Co chcesz zrobić: " + wybor2);
            wybor2 = scan.nextInt();
            if(wybor2 == 1){
                kad.inicjuj1();
                baza();
            }else if(wybor2 == 2){
                kad.drukuj1();
                baza();
            }else {
                System.out.println("WPISAłEś NIEPOPRAWNY WYBOR!!!!!!!!!!!!!!!!!!");
                baza();
            }
        }else{
            System.out.println("WPISAłEś NIEPOPRAWNY WYBOR!!!!!!!!!!!!!!!");
            baza();
        }
    }
    public static void main(String[] args) {
        Main m  = new Main();
        m.baza();

    }
}
