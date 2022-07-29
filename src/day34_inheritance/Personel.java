package day34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa veya ilerde bu
    class'i parent yapmak isteyenler olabilir diyorsaniz, o zaman variable ve
    methodlarin acces modifier'ini protected olarak secmek
     */
    protected int persNo;
    protected String isim="Isim Belirtilmedi";
    protected String departman="Departman belirtilmedi";


    public void maas (){
        System.out.println("Tum personelin maasi vardir.");
    }

    public void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar.");
    }

    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir ");
    }
}
