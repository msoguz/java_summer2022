package day16_forLoop;

import java.util.Scanner;

public class Q03_ForLoopFaktoryel {
    public static void main(String[] args) {

        //0 ile 10 arasinda verilen bir sayinin faktoriyelini hesaplayi konsolda ornegin 5!=1*2*3*4*5=120 olcak sekilde
        //yazdiran bir program yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir pozitif tamsayi giriniz.");

        int sayi= scan.nextInt();

        int faktoryel=1;

        for (int i=1; i<=sayi; i++) {
            faktoryel*=i;

            System.out.print(faktoryel);
        }

    }
}
