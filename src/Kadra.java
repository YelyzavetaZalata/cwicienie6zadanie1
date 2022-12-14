
import java.util.Scanner;

class Kadra implements Main.wynagrodzenie {
    public static String wyksztalcenie, stanowisko;
    public static int YOfEx;
    public static double NeedToH = 176;
    public static double HOfWork, dolarsPerH, dolarsPerExtraH;
    Osoba os = new Osoba();



    public void inicjuj1(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz stanowisko: " );
        stanowisko = scan.nextLine();
        System.out.println("Wpisz wykształcenie: " );
        wyksztalcenie = scan.nextLine();
        System.out.print("Wpisz lata Doświadczenia: " );
        YOfEx = scan.nextInt();
        System.out.print("Wpisz godziny pracy: " );
        HOfWork = scan.nextDouble();
        System.out.print("Wpisz ile otrzymujesz dolarow za godzine: " );
        dolarsPerH = scan.nextDouble();
        System.out.print("Wpisz otrzymujesz dolarow za extra godzine: " );
        dolarsPerExtraH = scan.nextDouble();

    }
    public void drukuj1(){
        os.drukuj();
        System.out.println("wykształcenie: " + wyksztalcenie);
        System.out.println("lata Doświadczenia: " + YOfEx);
        System.out.println("stanowisko: " + stanowisko);
        System.out.println("dolarsPerH: " + dolarsPerH);
        System.out.println("HOfWork: " + HOfWork);
        System.out.println("dolarsPerExtraH: " + dolarsPerExtraH);
        salaryToPay(NeedToH, dolarsPerH);
        salaryForOvertime(HOfWork, dolarsPerExtraH);
        Premia(YOfEx);
    }
    @Override
    public void salaryToPay(double NeedToH, double dolarsPerH) {
        double salary = NeedToH * dolarsPerH;
        double overtime= HOfWork - NeedToH;

        System.out.println("do wypłaty za godziny pracy (176) = " + salary);
        System.out.println("Overtime w pracy = " + overtime);
    }

    @Override
    public void salaryForOvertime(double HOfWork, double dolarsPerExtraH) {
        double OverTime = HOfWork - NeedToH;
        double extrasalary = OverTime * dolarsPerExtraH;
        System.out.println("do wypłaty za extra godziny pracy ("+OverTime+") = " + extrasalary);
    }

    @Override
    public void Premia(int YOfEx) {
        if (YOfEx>=10){
            System.out.println("Jeszcze masz premie");
        }else {
            System.out.println("Niestety nie masz premii");
        }
    }

}
