package day35_inheritancedeConstructorKullanimi;

public class GToyota {

    GToyota(){
        System.out.println("GToyota parametresiz constructor");
    }
    GToyota(String isim){
        //super(isim); extends olmadigi icin
        System.out.println("GToyota parametreli constructor");
    }
}
