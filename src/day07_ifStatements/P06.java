package day07_ifStatements;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir gun ismi isteyin, eger gun "Cuma" ise "Muslumanlar icin kutsal gun",
        gun "Cumartesi" ise "Yahudiler icin kutsal gun", gun "Pazar" ise "Hiristiyanlar icin kutsal gun" yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        String gun = scan.next().toLowerCase();
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equals("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe")) {
            System.out.println("Bir fikrim yok");
        }
        if (!(gun.equals("pazartesi") || gun.equals("sali") ||
                gun.equals("carsamba") || gun.equals("persembe") ||
                gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar")))
            System.out.println("Lutfen gecerli bir gun giriniz");
    }
}


