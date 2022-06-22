package day08_ifStatements;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

    /*
        Kullanicidan maas icin bir teklif isteyin ve;
        Teklif 80.000 'in uzerinde ise "Kabul Ediyorum"
        60.000-80.000 arasinda ise "Konusabiliriz"
        60.000'in altinda ise "Malesef Kabul Edemem"
        yazdirin.
        */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen maas teklifini giriniz");

        int maas=scan.nextInt();

        if (maas>80000){
            System.out.println("Kabul Ediyorum");
        }else if (maas>=60000) {
            System.out.println("Konusabiliriz");
        }else{
            System.out.println("Malesef kabul edemem");
        }
    }
}
