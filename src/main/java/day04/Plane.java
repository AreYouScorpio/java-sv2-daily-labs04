package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    private boolean addPassenger(Passenger passenger) {
        if (passengers.size() < maxCapacity) {
            return passengers.add(passenger);
        }
        return false;
    }


    public int getNumberOfPackages() {
        int sum = 0;
        for (Passenger actual : passengers) {
            sum += actual.getPackageNumber();
        }
        return sum;
    }




        public static void main (String[]args){

        // ha változtatod a repgép kapacitását, kevesebb személyt vesz fel rá
            Plane plane = new Plane(3);
            Passenger passenger1 = new Passenger("Akos", "B1", 3);
            Passenger passenger2 = new Passenger("Barbi", "B2", 2);
            Passenger passenger3 = new Passenger("Mugli", "B3", 1);

plane.addPassenger(passenger1);
plane.addPassenger(passenger2);
plane.addPassenger(passenger3);

            System.out.println("A gépen lévő utasok és csomagjaik száma:");
            for (int i=0; i<plane.passengers.size();i++) {
            System.out.println(plane.passengers.get(i).getName());
            System.out.println(plane.passengers.get(i).getPackageNumber());
                            }
            System.out.println("A gépen lévő összes csomag száma: ");
            System.out.println(plane.getNumberOfPackages());


        }
}

