package practicesAll.Practice02;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {

        /*
         Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

         BMI = kilo(kg) /(boy*boy)(m)
         BMI <=20 oldukca zayifsiniz
         20<BMI<=25 Normal sinirlardasiniz
         25<BMI<=30 Sisman kategorisindesiniz
         30<BMI ==> Obez grubundasiniz.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble()/100;      // boy'u metre'ye cevirdik.

        System.out.println("agirliginizi kg olarak giriniz");
        double agirlik= scan.nextDouble();

        double bmi= agirlik/(boy*boy);
        if(bmi<=20){
            System.out.println("bmi index'iniz " + bmi + " oldukca zayifsiniz");
        }else if(bmi<=25){
            System.out.println("bmi index'iniz " + bmi + " normal sinirlardasiniz");
        }else if(bmi<=30){
            System.out.println("bmi index'iniz " + bmi + " sisman kategorisindesiniz");
        }else{
            System.out.println("bmi index'iniz " + bmi + " obez grubundasiniz");
        }



    }
}
