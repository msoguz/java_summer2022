package day07_ifStatements;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        // Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char karakter= scan.next().charAt(0);

        if(karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){
            System.out.println("Girilen karakter bir harftir");
        }else{
            System.out.println("Girilen karakter harf degildir");
        }
    }
}
