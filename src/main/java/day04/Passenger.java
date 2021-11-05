package day04;

public class Passenger {

    private String name;
    private String ticketNumber;
    int packageNumber;


    public Passenger(String name, String ticketNumber, int packageNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.packageNumber = packageNumber;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }
}
