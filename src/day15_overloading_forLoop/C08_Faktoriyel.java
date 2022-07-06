package day15_overloading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        // input olarak verilen bir tamsayi icin faktoriyel hesaplayip yazdiran bir method olusturun.
        // verilen sayi 0, negatif veya 20'den buyuk olursa "girilen sayinin faktoriyeli hesaplanmaz"
        //uyarisi yazdirin.

        int input=7;
        faktoriyelHesapla(input);

    }

    public static void faktoriyelHesapla(int input) {
        int faktoryel=1;

        if(input<0 || input>20 ){
            System.out.println("verilen sayi icin faktoriyel hesaplanamaz");
        }else if(input==0){
            System.out.println("0!=1'dir");
        }else{
            for (int i =1 ; i <=input ; i++) {
                faktoryel*=i;

            }
            System.out.println("faktoryel = " + faktoryel); //24
        }

    }
}
