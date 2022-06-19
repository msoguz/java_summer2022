package day03_scanner;

import java.util.Scanner;

public class Odev04 {
    public static void main(String[] args) {

       // Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        //hacim=a*b*c*

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini giriniz");

        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int yukseklik= scan.nextInt();

        int hacim=kenar1*kenar2*yukseklik;

        System.out.println("Prizmanin hacmi :" + hacim) ;
    }
}
