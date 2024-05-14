package day_02_DataCastingQuestions;

import java.util.Scanner;

public class C03_DataCastingQ3 {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        // kullanici kac degerini girerse girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz...");

        int girilenSayi = scanner.nextInt();

        byte sonSayi = (byte) girilenSayi;

        System.out.println(sonSayi);



    }
}
