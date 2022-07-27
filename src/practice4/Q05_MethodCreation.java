package practice4;

import java.util.Scanner;

public class Q05_MethodCreation {
    public static void main(String[] args) {
      //cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen m ve km'ye donusturmek icin cm degerini giriniz");

        double cmValue=scan.nextDouble();
        convertCm(cmValue);

    }

    private static void convertCm(double cmValue) {
        double meter=cmValue/100;
        double kMeter=cmValue/100000;
        System.out.println("Girdiginiz " + cmValue + " degeri : " +  meter + " metredir ," + kMeter + "kilometredir" );
    }
}
