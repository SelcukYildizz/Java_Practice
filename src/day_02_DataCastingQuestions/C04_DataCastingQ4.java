package day_02_DataCastingQuestions;

import java.util.Scanner;

public class C04_DataCastingQ4 {

    public static void main(String[] args) {


        //Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve
        // bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir sayi giriniz...");
        double sayi1 = scanner.nextDouble();
        System.out.println("Lutfen ondalikli bir sayi daha giriniz...");
        double sayi2 = scanner.nextDouble();

        System.out.println("Bölme işleminin tamsayi sonucu : " + (int)(sayi1/sayi2));








    }


}
