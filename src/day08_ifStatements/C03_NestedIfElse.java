package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        // Kullanicidan cinsiyet ve yas aliniz
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
        // emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
        // Erkek icin E, Kadin icin K giriniz
        // negatif yas veya 80'den buyuk yas girilirse hata mesaji versin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz\nErkek icin E, Kadin icin K giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') { // Erkekse

            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin \nDaha " + (65 - yas) + " yil calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet == 'K') { // Kadinsa

            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin \nDaha " + (65 - yas) + " yil calismalisin");
            } else {
                System.out.println("Emekli olabilirsin");

            }
        }
    }
}

