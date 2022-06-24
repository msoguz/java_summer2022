package day09_ternary_Switch;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        // Kullanicidan bir syi alin ve sayi uc basamakli ise "Uc basamakli sayi" degilse "Uc basamakli degil" yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(sayi>=100 &&sayi<=999 ? "Uc basamakli sayi" : "Uc basamakli sayi degil");




    }
}
