package practice03;

import java.util.Scanner;

public class Q09_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz :\nisim : ");

        String isim=scan.next();
        System.out.println("Soyisim : ");
        String soyIsim=scan.next();

        if(isim.length()>soyIsim.length()) {
            System.out.println("isminiz soyisminizden uzun");
        }else if(soyIsim.length()>isim.length()) {
            System.out.println("soyisminiz isminizden uzun");
        }else{
            System.out.println("isim ve soyisminiz birbirine esit");
        }
    }
}
