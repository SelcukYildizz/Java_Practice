package day_02_DataCastingQuestions;

import java.util.Scanner;

public class C05_DataCastingQ5 {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir double, bir tamsayi alin,
        // double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz...");
        double sayi1 = scanner.nextDouble();
        System.out.println("Lutfen ondalikli bir tamsayi giriniz...");
        int sayi2 = scanner.nextInt();

        System.out.println("Bölme işleminin tamsayi sonucu : " + (int)(sayi1/sayi2));





    }
}
