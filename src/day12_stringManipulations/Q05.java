package day12_stringManipulations;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz.");

        String kelime=scan.next();
        String tersKelime=kelime.substring(3)+ kelime.substring(2,3) + kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println(tersKelime);


    }
}
