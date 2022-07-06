package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen String'deki kullanilan harfleri tekrarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yazpiniz.

        String input="Java her zaman guzel";

        tekrarsizYap(input);

    }

    public static void tekrarsizYap(String input) {

        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W",""); // Javaherzamanguzel
        System.out.print(input.substring(0,1)); //J
        benzersizInput+=input.substring(0,1);  //J

        for (int i = 0; i <islenecekKelime.length() ; i++) {

            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", " + islenecekKelime.substring(i,i+1));   //J, a, v, h, e, r, z, m, n, g, u, l
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("input :" +input);  //Java her zaman guzel
        System.out.println("benzrsizInput :" +benzersizInput); //Javherzmngul

    }
}
