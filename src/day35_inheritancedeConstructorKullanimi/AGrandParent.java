package day35_inheritancedeConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class'ta gorunmese bile bir constructor vardir.
    Bu class'tan obje olusturmak istedigimizde default constructor devreye girecektir.

    Default constructor'i gozlemleyemeyecegimiz icin onun yerine kullanilabilecek parametresiz construector oluaturalim.
     */

    protected  String grandpaKlupAdi="Grandpa Klubu";

    AGrandParent (){
        System.out.println("Grandpda constructor calisti");
    }

}
