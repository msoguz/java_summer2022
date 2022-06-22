package day07_ifStatements;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        // Kull.dan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup
        // olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarindan birini tamsayi olarak giriniz");
        int kenar1= scan.nextInt();

        System.out.println("Lutfen diger kenar uzunlugunu tamsayi olarak giriniz");
        int kenar2= scan.nextInt();

        if (kenar1 == kenar2){
            System.out.println("Girdiginiz dikdortgen bir karedir");
        }
        if (kenar1 != kenar2){
            System.out.println("Girdiginiz dikdortgen bir kare degildir");
        }
    }
}
