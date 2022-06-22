package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,
        50' ye esit veya buyuk 60'dan kucukse “C”,
        60'a esit veya buyuk  80'den kucukse “B”,
        80’e esit veya buyukse “A”
        Gecersiz not girildiginde uyari verelim
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not degeri giriniz");
        double note=scanner.nextDouble();
        
        if (note<0 || note>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note<50) {                    // bu satira geldiysek notumuz 0 ile 100 arasindadir
            System.out.println("Notunuz : D");
        }else if(note<60){
            System.out.println("Notunuz :C");
        }else if(note<80){
            System.out.println("Notunuz :B");
        }else {
            System.out.println("Notunuz :A");
        }
    }
}
