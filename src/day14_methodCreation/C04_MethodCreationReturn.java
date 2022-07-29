package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        //verilen isim ve soyismi ilk harfi buyuk digerleri * olacak sekilde degistirip bize bu halini donduren bir method olusturun.
        //NOT: programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz.


        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsim=isimGizle(isim, soyIsim);
        System.out.println(isim+ " " + soyIsim);//Enes Bozkurt
        System.out.println(gizliIsim); //E*** B******




    }

    public static String isimGizle(String isim, String soyIsim) {


        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w", "*");

        return isim+ " " + soyIsim;

    }
}
