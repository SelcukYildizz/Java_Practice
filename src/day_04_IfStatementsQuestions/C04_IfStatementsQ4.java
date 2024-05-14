package day_04_IfStatementsQuestions;

import java.util.Scanner;

public class C04_IfStatementsQ4 {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 1. kenar uzunlugunu yaziniz");
        double kenar1 = scanner.nextDouble();
        System.out.println("Lutfen ucgenin 2. kenar uzunlugunu yaziniz");
        double kenar2 = scanner.nextDouble();
        System.out.println("Lutfen ucgenin 3. kenar uzunlugunu yaziniz");
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Olculeri verilen ucgen bir eskanar ucgendir.");
        } else
            System.out.println("Olculeri verilen ucgen bir eskanar ucgen degildir");


    }
}
