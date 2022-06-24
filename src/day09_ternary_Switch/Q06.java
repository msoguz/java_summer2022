package day09_ternary_Switch;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin kucuk harf ise konsola "Kucuk harf", buyuk harf ise "Buyuk harf"
        // degilse "Girdiginiz karakter harf degil" yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char karakter= scan.next().charAt(0);

        System.out.println(karakter>='a' && karakter<='z' ? ("Kucuk harf" ): (karakter>='A' && karakter<='Z' ?
                "Buyk Harf" :"Girdiginiz karakter harf degil"));



    }
}
