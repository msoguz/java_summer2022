package day03_scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

        //Kullanicidan adini ve soyadini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin.
        // Isim - soyisim : Mehmet Bulut

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");

        String isim = scan.nextLine();

        System.out.println("Lutfen soy adinizi giriniz");

        String soyIsim = scan.nextLine();


        System.out.println("Isim - soyisim : " + isim + " " + soyIsim);

    }
}
