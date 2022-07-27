package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();

        // arb1 objesi uzerinden marka variable'ina ulasabildim, degistirebildim(set) ve yazdirabildim(get).
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //acces modifier kullanarak marka variable'ina ulasimi tamamen serbest yapabilir veya
       // tamamen engelleyebiliriz.
       // private yaptigimiz model'e hic ulasamayiz.
        // yani access modifier ya hep ya da hic diyor.

        //model'i degistirelim ama gormeyelim.
        //yakiti da gorelim ama degistiremeyelim.

        //set ve get yetkilerini ozel olarak tanimlamak isterseniz;
        //1.adim - ozel yetki tanimlayacagimiz variable'leri private yapalim.
        //        private bir dataya baska bie class'lardan ulasmak mumkun olmadigindan
        //2.adim -set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim.



        arb1.setModel("Corolla"); //model olarak suprayi atadik
        //model'i yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit());//yakit olarak elektrikli bilgisini yazdirabildik.
        // yakiti degistiremeyiz cunku setter method'u yok.





    }
}
