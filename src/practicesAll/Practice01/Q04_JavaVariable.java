package practicesAll.Practice01;

public class Q04_JavaVariable {

    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme

        int yas=33;
        double boy=1.70;

        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);




        // To copy the variable's value

        int yasim=33;
        int enesYas=yasim;
        System.out.println("yasim = " + yasim);
        System.out.println("enesYas = " + enesYas);


        // you can declare multiple variables in the same line

        int yil=2022, ay=6, gun=20;

        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        // updating a variable

        yil=2032;
        System.out.println("update yil " + yil);


        //Bir degisken tanimlayin : x
        int x;


        //Baska bir degiskeni initialize edin : y
        int y=2000;
        //x degiskenini initialize edin
        x=30;

        //y degiskenini yeni bir degerle guncelleyin
        y=1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
