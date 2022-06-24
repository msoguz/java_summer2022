package day09_ternary_Switch;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin ve sayi 10'dan kucukse "Rakam", 100'den kucukse "Iki basamakli sayi",
        // degilse "uc basamakli ve daha buyuk sayi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi<10 ? "Rakam" : (sayi<100 ? "Iki basamakli sayi" : "Uc basamakli ve daha buyuk sayi")) ;

    }
}
