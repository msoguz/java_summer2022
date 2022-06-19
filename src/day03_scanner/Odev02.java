package day03_scanner;

import java.util.Scanner;

public class Odev02 {
    public static void main(String[] args) {


        // Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin.


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");

        double kenar=scan.nextDouble();

        double cevre=4*kenar;
        double alan=kenar*kenar;

        System.out.println("Karenin alani :" + cevre );
        System.out.println("Karenin cevresi :" + alan);


    }
}
