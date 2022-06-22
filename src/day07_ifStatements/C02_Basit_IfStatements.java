package day07_ifStatements;

public class C02_Basit_IfStatements {
    public static void main(String[] args) {
        int sayi=10;

        if(sayi>0){
            System.out.println("sayi pozitif");
        }

        if(sayi%2==0){
            System.out.println("sayi cift");
        }

        if (sayi%5==0){
            System.out.println("sayi 5'in tam kati");

        }


        /*
        Basit if cumleleri kodun diger parcalarindan bagimsizdir
        sadece bir sart kontrol eder. SArt saglaniyorsa if body calisir, yoksa calismaz.
        Birden fazla basit if body varsa girilen sarta bagli olarak,
        tumunde if body calisabilir, kismmen if body calisabilir veya hicbir if body calismayabilir.
         */
    }
}
