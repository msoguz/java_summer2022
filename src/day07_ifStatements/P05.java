package day07_ifStatements;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

/*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        String gun=scan.next().toLowerCase();

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("Girilen gun hafta ici");
        }
        if(gun.equals("cumartesi")|| gun.equals("pazar")){
            System.out.println("Girilen gun hafta sonu");
        }
        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
             gun.equals("persembe") || gun.equals("cuma") ||gun.equals("cumartesi")|| gun.equals("pazar")){
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


    }
}
