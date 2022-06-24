package day09_ternary_Switch;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        // kullanicidan dikdortgenin uzunlugunu ve genisligini alin girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();

        System.out.println(kenar1==kenar2 ? "Girdiginiz dikdoertgen bir karedir" : "Girdiginiz dikdortgen kare degildir");


    }
}
