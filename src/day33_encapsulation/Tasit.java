package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean mayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
        //getter method'u da tek bir satirlik islem yapar.
        //baska class'larin private oldugu icin erisemedigi
        //tasitTuru bilgisini, class icinden alip
        //istenen farkli class'lara return ediyor.
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
        //burada bir satırlık islem yapıyor o bir satırlık islemde bizim gönderdiğimiz parametreyi instence variable a atıyor.
    }

    public boolean isMayenesiVarMi() {
        return mayenesiVarMi;
        //boolean variable'lar icin olusturulan getter methodlarinin ismi
        //isVariableIsmi seklinde olur.
    }

    public void setMayenesiVarMi(boolean mayenesiVarMi) {
        this.mayenesiVarMi = mayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
