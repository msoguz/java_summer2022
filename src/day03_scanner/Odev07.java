package day03_scanner;

import java.util.Scanner;

public class Odev07 {
    public static void main(String[] args) {
       // Kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz");

        char ilkHarf=scan.next().charAt(0);

        System.out.println("Girdiginiz kelimenin ilk harfi : " + ilkHarf);


    }
}
