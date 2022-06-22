package day07_ifStatements;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyin vae sayinin tek mi cift mi oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0) {
            System.out.println("Girdiginiz sayi cift sayidir");
        }else if (sayi%2==1) {
            System.out.println("Girdiginiz sayi tek sayidir");
        }else{
            System.out.println("Lutfen gecerli bir tamsayi giriniz");
        }
    }
}
