package day_02_DataCastingQuestions;

import java.util.Scanner;

public class C02_DataCastingQ2 {

    public static void main(String[] args) {

         // Soru 2- Kullanicidan bir harf alin
        // ve alfabede o harften sonraki 3 harfi yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char girilenHarf = scanner.next().charAt(0);

        char sonrakiHarf1 = (char) (girilenHarf+1);
        char sonrakiHarf2 = (char) (girilenHarf+2);
        char sonrakiHarf3 = (char) (girilenHarf+3);

        System.out.println("Girilen harf : " + girilenHarf);
        System.out.print("Sonraki 3 harf : "  +" " + sonrakiHarf1+" "+ sonrakiHarf2+" " + sonrakiHarf3);




    }
}
