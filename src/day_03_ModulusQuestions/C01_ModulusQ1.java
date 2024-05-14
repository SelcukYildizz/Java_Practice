package day_03_ModulusQuestions;

import java.util.Scanner;

public class C01_ModulusQ1 {
    public static void main(String[] args) {


        // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip
        // rakamlar toplamini bulalim.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir tamsayi giriniz  :");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;

        //rakamlarToplami = rakamlarToplami+sayi;

        System.out.println("Girilen sayi   : " + girilenSayi);
        System.out.println("Girilen sayinin rakamlari toplami   : " + rakamlarToplami);


    }
}
