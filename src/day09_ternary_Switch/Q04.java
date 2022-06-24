package day09_ternary_Switch;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {


        // Kullanicidan bir sayi alin ve sayi pozotof ise "sayi pozitif" negatif ise sayinin karesini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi>=0 ? "sayi pozitif" : (sayi*sayi));

    }
}
