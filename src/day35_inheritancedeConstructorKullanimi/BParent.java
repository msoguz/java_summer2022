package day35_inheritancedeConstructorKullanimi;

public class BParent extends AGrandParent {
    protected String isim="Parent isim belrtilmedi";
    protected String parentKlubAdi="Parent Klubu";

    BParent(){

        System.out.println("Parent constructor calisti");
    }
}
