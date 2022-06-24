package day09_ternary_Switch;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

    // Kullanicidan iki syi alin ve buyuk olmayan sayiyi yazdirin.

    Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz.");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
}

}
