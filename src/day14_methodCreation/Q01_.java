package day14_methodCreation;

import java.util.Scanner;

public class Q01_ {
    public static void main(String[] args) {

        /*
         * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
         * degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin
         * toplamini yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk
         * girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Kac sayi toplamak istersiniz");

        int sayiAdedi = scan.nextInt();

        if (sayiAdedi < 2) {
            System.out.println("toplama icin en az iki sayi giriniz");
        } else if (sayiAdedi == 2) {
            ikiSayiTopla();
        } else if (sayiAdedi == 3) {
            ucsayitopla();
        } else if (sayiAdedi == 4) {
            dortsayitopla();
        } else {
            System.out.println("Cok sayi girdiniz ben toplayamam");


        }
    }

    public static void dortsayitopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        int sayi4 = scan.nextInt();
        System.out.println("dort sayi girmeyi tercih ettiniz " + "\nGirilen dort sayinin toplami :"
                + (sayi1 + sayi2 + sayi3 + sayi4));


    }

    public static void ucsayitopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        System.out.println("uc sayi girmeyi tercih ettiniz " + "\nGirilen uc sayinin toplami :"
                + (sayi1 + sayi2 + sayi3));


    }

    public static void ikiSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("iki sayi girmeyi tercih ettiniz " + "\nGirilen iki sayinin toplami :" + (sayi1 + sayi2));


    }
}
