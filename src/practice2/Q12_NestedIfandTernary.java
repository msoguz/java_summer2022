package practice2;

public class Q12_NestedIfandTernary {
    public static void main(String[] args) {

            /*
            0 ~ 9 arasındaki sayilari kelimelere cevirebilen bir java programi yazin,
            sayı 9'dan buyuk veya sifirdan kucukse,
            cikis "Gecersiz" olmalidir
            NestedIf ve Ternary kullanarak 2 yolla da cozunuz
            */

        int sayi=9;
        String sonuc=" ";
        if(sayi>=0 && sayi<=9){
            if(sayi==9){sonuc="dokuz";}
             else if(sayi==8){sonuc="sekiz";}
             else if(sayi==7){sonuc="yedi";}
             else if(sayi==6){sonuc="alti";}
             else if(sayi==5){sonuc="bes";}
             else if(sayi==4){sonuc="dort";}
             else if(sayi==3){sonuc="uc";}
             else if(sayi==2){sonuc="iki";}
             else if(sayi==1){sonuc="bir";}
             else sonuc="sifir";
        }else sonuc="gecersiz";

        System.out.println("sonuc="+sonuc);

        System.out.println("***********************************************************");

        int num=4;
        String result=num==9?"dokuz" : num==8?"sekiz" : num==7 ? "yedi" : num==6 ? "alti" :
                num==5 ? "bes" : num==4 ? "dort" : num==3 ? "uc" : num==2 ? "iki" :
                        num==1 ? "bir" : num==0 ? "sifir" : "gecersiz";
        System.out.println("num: " + num);
        }

}
