package day03_scanner;

import java.util.Scanner;

public class Odev05 {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

                Isminiz : Mehmet
                Soyisminiz : Bulut
                Kursa katiliminiz alinmistir, tesekkur ederiz.

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi ve soyisminizi giriniz. \nisminizi yazdiktan sonra lutfen enter tusuna basiniz");

        String name=scan.nextLine();
        scan.nextLine();

        String surName=scan.nextLine();

        System.out.print("Isminiz :" + name + "\nSoyisminiz :" + surName + "\nKursa katiliminiz alinmistir, tesekkur ederiz");


    }
}
