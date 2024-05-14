package day_1_VariablesAndScanner;

import java.util.Scanner;

public class C07_Scanner_Variables_Sunu_Sorulari {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap = scanner.nextDouble();

        System.out.println("Cemberin cevresi : " + (yaricap*2*Math.PI) );
        System.out.println("Cemberin alani : " + (yaricap*yaricap*Math.PI));


    }
}
