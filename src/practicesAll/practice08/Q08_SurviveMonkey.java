package practicesAll.practice08;

public class Q08_SurviveMonkey {
    public static void main(String[] args) {

        /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;

        */

        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;

        do{
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas-=4;  // toplam muzdan 4 azalir
            survivalDays++; // ysadegi gun sayisi 1 artar.
            if(numberOfBananas<4){
                monkeyAlive = false; // maymun hayatta degil
                System.out.println("bugun " + survivalDays + ". gun muz kalmadi, maymun sizlere omur.. ");
            }else
                System.out.println("bugun " + survivalDays + ". gun, maymun halen hayatta..");

        }while(monkeyAlive);
        System.out.println("toplam yasadigi gun sayisi : " + (survivalDays-1));
    }
}
