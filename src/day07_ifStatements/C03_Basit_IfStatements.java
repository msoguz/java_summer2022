package day07_ifStatements;

public class C03_Basit_IfStatements {
    public static void main(String[] args) {

        /*
        Bir if statement'te {} kullanilmazsa Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        Eger birden fazla ayni if sartina baglanmis ise mutlaka {} kullanmaliyiz
         */

        int sayi=-13;

        if(sayi>0)
            System.out.println("sayi pozitiftir"); // degere bagli
            System.out.println("pozitift kalacaktir"); // her zaman calisir
            System.out.println("ucuncu satir");  //her zaman calisir


        if(sayi%2==0)
            System.out.println("sayi cift"); // degere bagli
            System.out.println("sayi cift kalacaktir"); // her zaman calisir


        if (sayi%5==0)
            System.out.println("sayi 5'in tam kati"); //degere bagli


    }
}
