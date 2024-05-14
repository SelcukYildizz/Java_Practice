package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C02_IfStatementsQ2 {

    public static void main(String[] args) {

  //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz   :");
        char harf = scanner.next().toUpperCase().charAt(0);

        if (harf == 'o' || harf == 'O'){
            System.out.println("Ocak");
        }
        if (harf == 's' || harf == 'S') {
            System.out.println("Subat");
        }
        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart, Mayis");
        }
        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
        }
        if (harf == 'h' || harf == 'H') {
            System.out.println("Haziran");
        }
        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
        }
        if (harf == 'a' || harf == 'A') {
            System.out.println("Aralik, Agustos");
        }
        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylul, Ekim");
        } else {
            System.out.println("Lutfen gecerli bir harf giriniz.");
        }



    }
}
