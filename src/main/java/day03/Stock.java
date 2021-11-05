package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    // void List(double) arfolyamok = new ArrayList<>();


    public double maxProfit(ArrayList arfolyamok) {
            double max = Integer.MIN_VALUE;
        for (int i = 0; i < arfolyamok.size(); i++) {
               if (arfolyamok.get(i) > max) {
                   max = arfolyamok.get(i);
               }
             System.out.println(arfolyamok.get(i).toString());

        }
        return max;
    }



}
