package day35_inheritancedeConstructorKullanimi;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    Child(){
        System.out.println("Child constructor calisti.");
    }

    public static void main(String[] args) {

        AGrandParent gp1= new AGrandParent();
        //Bu objeyi olusturmak icin Grandpa cons. calisir.
        //Parent veya Child cons. calismaz.


        Child child1= new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlubAdi="Child2";

        //chil1 objesi icin Child cons calisir.
        /*
        Java'da bir class'i kullanabilmek icin
        o class'tan obje olusturur dolayisiyla o class'in constructor'ini kullanirdik.
        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin
        constructor'larini otomatik calistiran bir yapi kurmustur.

        Ornegin biz child class'inda  Child class'indan bir obje olusturmak istedigimizde
        Child cons.ini kullaniriz.

        Java Child(){} godugunde once parent'in conc.ini calistirmam lazim der,
        buradan Parent cons'a gider,
        Parent class'inda Parent(){} gorunce once bunun parent'ini yani Grandparent cons.
        calismasi gerekir der.

        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak tum constructorlari asagiya
        dogru calistirir.


         */
    }
}
