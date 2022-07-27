package day33_encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";  //markanin access modifier'i default oldugundan package icinde kullanilabilir.
    private String model="Model belritilmedi";
    private String yakit="Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim.
        //private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim.
        // model'e deger atanabilsin ama gorulemesin.(setter)
        // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor.(getter)



    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
