package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C08_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {


       // Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen bir tamsayi daha giriniz");
        int sayi2 = scanner.nextInt();

        int sonSayi = sayi1;
        sayi1 = sayi2;
        sayi2 = sonSayi;

        System.out.println(sayi1);
        System.out.println(sayi2);




    }
}
