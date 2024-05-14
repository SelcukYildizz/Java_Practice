package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C06_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini,
        // soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char isim = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.next().toUpperCase();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + isim +" "+ soyIsim + "," + yas );



    }
}
