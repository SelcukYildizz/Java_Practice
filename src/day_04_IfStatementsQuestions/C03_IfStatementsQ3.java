package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C03_IfStatementsQ3 {

    public static void main(String[] args) {

       // Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        // sayi”, 5 ile bolunebiliyorsa
        // “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz  : ");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0){
            System.out.println("Girilen sayi " + girilenSayi + ", 3 ile bolunebilir");
        }
        if (girilenSayi % 5 == 0){
            System.out.println("Girilen sayi " + girilenSayi + ", 5 ile bolunebilir");
        }




    }
}
