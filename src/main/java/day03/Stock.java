package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {

    private List<Double> values;

    public Stock(List<Double> values) {
        this.values = values;
    }

    public double maxProfit() {


            double max = 0;
        for (int i = 0; i < values.size(); i++) {
               for ( int j= i+1 ; j < values.size();j++) {
                   if(max < values.get(j)-values.get(i)){
                       max=values.get(j)-values.get(i);
                   }
               }

        }
        return max;
    }


}