package practice01;

import java.util.Scanner;

public class Q08_Scanner01 {

    public static void main(String[] args) {

        // Kullanicidan 2 tamsayi alin
        // bu 2 tamsayilari toplayin ve sonucu yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki adet tamsayi giriniz.");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("toplam = " + toplam);

    }
}
