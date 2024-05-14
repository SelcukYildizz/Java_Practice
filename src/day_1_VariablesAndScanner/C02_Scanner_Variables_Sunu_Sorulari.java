package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C02_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {

        //Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla
        //yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenTamsayi = scanner.nextInt();
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.next();
        System.out.println("Lutfen bir harf giriniz");
        char harf = scanner.next().charAt(0);


        System.out.println("Girilen tamsayi : " + girilenTamsayi);
        System.out.println("Girilen isim : " + isim);
        System.out.println("Girilen harf : " + harf);








    }
}
