package day03_scanner;

import java.util.Scanner;

public class Odev01 {
    public static void main(String[] args) {
        // Kullsnicidan iki tamsayi alin ve bu sayilarin toplam carpim ve farklarini yazdirin/

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

    int sayi1=scan.nextInt();
    int sayi2=scan.nextInt();

    int toplam=sayi1+sayi2;
    int carpim=sayi1*sayi2;
    int fark=sayi1-sayi2;

        System.out.println("Girdiginiz sayilarin toplami :" + toplam);
        System.out.println("Girdiginiz sayilarin carpimi :" + carpim);
        System.out.println("Girdiginiz sayilarin farki : "+ fark);

    }
}
