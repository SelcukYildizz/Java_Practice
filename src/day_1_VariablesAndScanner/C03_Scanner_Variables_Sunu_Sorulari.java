package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C03_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {


        // Soru 2- Kullanicidan bir double,
        // bir de int sayi alip
        // bunlarin toplamini ve carpimini
        //yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int tamSayi = scanner.nextInt();

        System.out.println("Sayilarin toplami : " + (ondalikliSayi+tamSayi));
        System.out.println("Sayilarin carpimi : " + (ondalikliSayi*tamSayi));





    }
}
