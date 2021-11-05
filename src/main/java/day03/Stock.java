package day03;

import java.util.ArrayList;
import java.util.Arrays;

public class Stock {

    // void List(double) arfolyamok = new ArrayList<>();

    double [] arfolyamok = new double[];

    public double maxProfit(arfolyamok) {
            double max = Integer.MIN_VALUE;
        for (int i = 0; i < arfolyamok.length; i++) {
               if ( arfolyamok[i] > max) {
                   max = arfolyamok[i];
               }
             System.out.println(arfolyamok[i]);

        }
        return max;
    }


}
