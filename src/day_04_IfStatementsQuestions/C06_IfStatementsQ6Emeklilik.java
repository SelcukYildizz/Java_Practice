package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C06_IfStatementsQ6Emeklilik {

    public static void main(String[] args) {


        // Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz  :");
        int yas = scanner.nextInt();

        if (yas >=65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olmak için " + (65-yas) + " yil daha calismaniz lazim.");
        }


    }
}
