public class Passenger {
    private int passengerId;
    private String name;
    private String flightNumber;
    private String ticketClass;  //Economy business or first
    private int boardingGroup;

    // Constructor to initialize passenger object
    public Passenger(int passengerId,String name, String flightNumber, String ticketClass, int boardingGroup ){
        this.passengerId = passengerId;
        this.name = name;
        this.flightNumber = flightNumber;
        this.ticketClass = ticketClass;
        this.boardingGroup = boardingGroup;
    }

    // Getter and setter methods for private values
    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId){
        this.passengerId = passengerId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public String getTicketClass(){
        return ticketClass;
    }

    public void setTicketClass(String ticketClass){
        this.ticketClass = ticketClass;
    }

    public int getBoardingGroup(){
        return boardingGroup;
    }

    public void setBoardingGroup(int boardingGroup){
        this.boardingGroup = boardingGroup;
    }

    // Readable passenger information for the output
    @Override
    public String toString(){
        return "Passenger ID: " + passengerId +
                "Name: " + name +
                "Flight Number: " + flightNumber +
                "Boarding Group: " + boardingGroup;
    }
}
