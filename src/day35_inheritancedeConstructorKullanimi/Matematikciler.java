package day35_inheritancedeConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler(){
        System.out.println("Matematik parametresiz cons");
    }

    Matematikciler(String isim){
        this();

        System.out.println("Matematik parametreli cons");

    }

    public static void main(String[] args) {

        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
    this() cons. call icinde bulunulan class'taki cons'lari super() ise parnt class'ta bulunan
    cons.lari cagirir.

    this() veya super() parametre yapisina uygun bir cons. bulamazsa Java CTE verir.

    contructor konusunda gordugumuz this. o class'taki instance variableleri refere ediyordu.

    inheritance'de da super. vardir.
    super. parent class'daki instance'leri refere eder.
     */
}
