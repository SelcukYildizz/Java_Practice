package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C08_IfStatementsQ8Karakter2 {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz   : ");
        char harf = scanner.next().charAt(0);

        if (harf  >='a' && harf<='z' ) {
            System.out.println(Character.toUpperCase(harf));
        } else
            System.out.println(harf);

    }
}
