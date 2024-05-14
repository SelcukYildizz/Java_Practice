package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C09_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {


        // Soru 8 (Interview)- Kullanicidan iki sayi alip,
        // ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen bir tamsayi daha giriniz");
        int sayi2 = scanner.nextInt();

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;


        System.out.println("Sayılar takas edildi. Birinci sayı: " + sayi1 + ", İkinci sayı: " + sayi2);





    }
}
