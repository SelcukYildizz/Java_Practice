package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C04_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {


        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println();

        System.out.println("Isminiz : " + isim );
        System.out.println("Soyisminiz : " + soyIsim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");



    }
}
