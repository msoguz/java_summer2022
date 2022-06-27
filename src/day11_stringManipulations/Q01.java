package day11_stringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {


        /*
        Kullanicidan bir cumle ve bir kelime isteyin, kelimenin durumuna gore,
        - verilen kelime cumlede kullanilmamis.
        -verilen kelime cumlede sadece 1 kere kullanilmis.
        -verilen kelime cumlede birden fazla kullanilmis
         yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle ve bir kelime giriniz \ncumleyi yazdikyan sonra enter tusuna basiniz.");

        String cumle=scan.nextLine();
        String kelime=scan.next();

        int ilkIndexKelime=cumle.indexOf(kelime);
        int sonIndexKelime=cumle.lastIndexOf(kelime);


        if(ilkIndexKelime==-1) {
            System.out.println("istediginiz kelime cumlede kullanilmamis.");
        }else if(ilkIndexKelime==sonIndexKelime) {
            System.out.println("Istediginiz kelime cumlede bir kez kullanilmis.");
        }else{
            System.out.println("Istediginiz kelime cumlede birden fazla kullanilmistir");
        }
    }
}
