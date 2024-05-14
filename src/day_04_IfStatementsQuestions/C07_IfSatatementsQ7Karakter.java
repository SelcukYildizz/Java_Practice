package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C07_IfSatatementsQ7Karakter {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz   : ");
        char harf = scanner.next().charAt(0);

        if (harf  >='A' && harf<='Z' ){
            System.out.println("Girilen " + harf + " harfi buyuk olarak girilmistir.");
        } else
            System.out.println("Girilen " + harf + " harfi kucuk olarak girilmistir.");





    }
}
