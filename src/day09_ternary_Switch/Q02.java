package day09_ternary_Switch;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {


        // Kullanicidan bir sayi alin ve sayinin tek mi cift mi oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

    }
}
