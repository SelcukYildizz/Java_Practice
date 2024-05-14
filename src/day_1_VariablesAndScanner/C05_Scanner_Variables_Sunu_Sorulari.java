package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C05_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {

       // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
       // dikdortgenin alanini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen diktörtgenin bir kenar uzunlugunu giriniz");
        double kenar1 = scanner.nextDouble();
        System.out.println("Lutfen diktörtgenin diger kenar uzunlugunu giriniz");
        double kenar2 = scanner.nextDouble();

        System.out.println("Diktörtgenin alani : " + (kenar1*kenar2) + " m2 dir");





    }
}
