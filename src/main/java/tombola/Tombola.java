package tombola;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tombola {

    Random generetor = new Random();
    private int n = 0;

    /*public void StampaNumeri(){
        for(int i = 0; i<20;i++){
            n= 1 + generetor.nextInt(90);
            System.out.print(n+ ", ");
        }
    }*/

    /*Set<Integer> numeri = new HashSet<>();

    public void StampaNumeri(){
        do{
            n= 1 + generetor.nextInt(90);
            numeri.add(n);
        }while(numeri.size()<20);
        System.out.println(numeri);
    }*/

    ArrayList<Integer> numeri = new ArrayList<>();

    public void StampaNumeri(){

        int j = 0;

        //Inizialiazzazione arrayList con i numeri da 1 a 90
        for(int i = 0; i < 90; i++){
            numeri.add(i+1);
        }

        //Stampa ed elimina dei valori
        for(j =0;j<20;j++) {
            n = 1 + generetor.nextInt(numeri.size());
            System.out.println(numeri.remove(n));
        }

        System.out.println(numeri);



    }




    public static void main(String[] args) {
        Tombola t = new Tombola();

        t.StampaNumeri();
    }
}
