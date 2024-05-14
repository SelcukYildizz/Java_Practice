package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C01_IfStatementsQ1 {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile
        // bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.
        // değilse "5 in kati değil" yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Girilen sayi 5 in katidir.");
        } else
            System.out.println("Girilen sayi 5 in kati degil");


    }
}
