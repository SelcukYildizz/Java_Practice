package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C01_EasyJavaQuestions {

    public static void main(String[] args) {


        // Kullanicidan bir harf alin
        // ve alfabede o harften sonraki 3 harfi yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char girilenHarf = scanner.next().charAt(0);

        System.out.println(girilenHarf+1); // bu şekilde ascii degerlerini verir,
        System.out.println(girilenHarf+2);// bu şekilde ascii degerlerini verir,
        System.out.println(girilenHarf+3);// bu şekilde ascii degerlerini verir,

        System.out.println((char) (girilenHarf+1));// burada ise harf degeri verir
        System.out.println((char) (girilenHarf+2));
        System.out.println((char) (girilenHarf+3));







    }
}
