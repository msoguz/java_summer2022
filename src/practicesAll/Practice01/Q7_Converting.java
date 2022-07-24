package practicesAll.Practice01;

import java.util.Scanner;

public class Q7_Converting {
    public static void main(String[] args) {

        /*
        galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon
        */

        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1=gallon + " galon degeri " + litre + "litreye esittir";
        System.out.println(sonuc1);  //1000 galon degeri 3785.0litreye esittir


        int l=1000;
        double g=l/3.785;
        System.out.println(l+" litre degeri " +g + " galona esittir");    //1000 litre degeri 264.2007926023778 galona esittir


        /*
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("fahrenayt degerini giriniz :");
        double fh=scan.nextDouble();
        System.out.println("girdiginiz fahrenayt degeri :" + (fh-32)*5/9 + " santigrata esittir");


    }
}
