package day10_stringManipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {


        // Kullanicidan bir harf alin ve bir cumle isteyin, istenen harfin cumlede kullanip kullanilmadigini yazdirin.

        String str="Java'yi cok iyi ogrenmem lazim.";

        if(str.indexOf("x")==-1){
            System.out.println("Istenen harf cumlede kullanilmamistir");
        }else{
            System.out.println("Istenen harf cumlede kullanilmistir");
        }
    }
}
