package day35_inheritancedeConstructorKullanimi;

public class KDizalCorolla extends HCorolla{

    KDizalCorolla(){
        System.out.println("KDizalCorolla parametresiz cons");
    }

    KDizalCorolla(String isim){
        super(isim);
        System.out.println("KDizalCorolla parametreli cons. calisti.");
    }

    public static void main(String[] args) {
        KDizalCorolla obj1=new KDizalCorolla();

    }

}
