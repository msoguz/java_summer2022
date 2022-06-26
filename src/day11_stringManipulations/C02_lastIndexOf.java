package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, java cok guzel";
        String kelime="Java";

        /*
        //Verilen kelime icin asagidaki sartlardan uygun olan bir program yaziniz
        - verilen kelime cumlede kullanilmamis.
        -verilen kelime cumlede sadece 1 kere kullanilmis.
        -verilen kelime cumlede birden fazla kullanilmis

        */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if(kelimeIlkIndex==-1){
            System.out.println("Verilen kelime cumlede kullanilmamis");
        }else if(kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede bir kez kullanilmis");
        }else{
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }




    }

}
