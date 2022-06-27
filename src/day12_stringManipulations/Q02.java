package day12_stringManipulations;

public class Q02 {
    public static void main(String[] args) {

        /*
        String seklinde verilen asagidaki sayilarin toplamini bulunuz:
        String str1="$13.99";
        String str2="$10.55";

        Ipucu:Double.parseDouble() mehodunu kullaniniz.

        */

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replace("$","");
        str2=str2.replace("$","");

        Double sayi1=Double.parseDouble(str1);
        Double sayi2=Double.parseDouble(str2);
        System.out.println("toplam : $" + (sayi1+sayi2));









    }
}
