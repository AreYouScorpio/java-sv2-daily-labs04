package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane (int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    private boolean addPassenger(Passenger passenger){
        if (passengers.size()<maxCapacity) {
           return  passengers.add(passenger);
            } else {return false;}




    public int getNumberOfPackages {
    int sum = 0;
    for (Passenger actual: passengers) {sum+= actual.getPackageNumber();
    }
    return sum;}

/*
    public static void main(String[] args) {
        Plane plane = new Plane(2);
        passengerList.add("Akos", "A1");
        passengerList.add("Barbi", "B1", 4 );
        System.out.println(passengerList.get(1).toString());
        System.out.println(passengerList.get(2).toString());

    }
*/
}
