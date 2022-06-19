package day03_scanner;

import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {
        //Kullanicadan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap=scan.nextDouble();


        double cevre=2*3.14*yaricap;
        double alan=3.14*yaricap*yaricap;

        System.out.println("Cemberin cevresi : " + cevre);

        System.out.println("Dairenin alani :" + alan);




    }
}
