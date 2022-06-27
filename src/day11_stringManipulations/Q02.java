package day11_stringManipulations;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin,
        cumle, "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harfle,
        cumle "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harfle,
        cumle iki kelimeyi de icermiyorsa"cumle kucuk ya da buyuk kelimesi icermiyor"
        yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");

        String cumle = scan.nextLine().toLowerCase();

        if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
            System.out.println("Karar ver buyuk mu yazdirayim kucuk mu");
        }else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("cumle kucuk ya da buyuk kelimesi icermiyor");
        }





    }
}
