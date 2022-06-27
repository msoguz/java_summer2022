package day12_stringManipulations;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyismini isteyin ve hangisi uzunsa onu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz.");

        String isim=scan.next();
        String soyisim=scan.next();

        System.out.println(isim.length()> soyisim.length() ? isim : soyisim);



    }
}
