package day35_inheritancedeConstructorKullanimi;

public class FMemur extends EMuhasebe {

    /*
    Extends keyword kullanilan class'larda ister default cons bulunsun
    istersek de biZ yeni cons.lar olusturalim Java cons.in ilk satirina super(); constructor call yazar.


     super(); constructor call, default constructor'a bezer gorunmese de orada vardir ve calisir.
     Ancak biz ilk satira farkli bir cons. call yazarsak Java super ();'i siler.
     */

    FMemur() {

        System.out.println("Memur parametresiz cons");
    }

    FMemur(String isim){
        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1= new FMemur();

    }
}
