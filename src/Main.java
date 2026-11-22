public class Main{
    public static void main(String[] args){
        System.out.println("  ----- PASSENGER LIST ----- ");

        // Create a new Passenger List
        PassengerList passengerFly = new PassengerList();

        // Add 5 passeneger in a Passenger List
        passengerFly.addPassenger(new Passenger(100  , "Tunahan ", "THK1234  ", "Bussines ", 3));
        passengerFly.addPassenger(new Passenger(101  , "Ali Berk", "THK1234  ", "Economy  ", 2));
        passengerFly.addPassenger(new Passenger(102  , "Eren    ", "THK1234  ", "First    ", 1));
        passengerFly.addPassenger(new Passenger(104  , "Elif    ", "THK1234  ", "Bussines ", 4));
        passengerFly.addPassenger(new Passenger(105  , "Eylül   ", "THK1234  ", "First    ", 3));

        System.out.println("\n Initial Passenger List : ");
        passengerFly.printList();

        // Remove one passenger by ID
        int removeID = 101;
        System.out.println("\n Removing passenger with ID: " + removeID);

        boolean isRemoved = passengerFly.removePassenger(removeID);
        if(isRemoved){
            System.out.println(" Passenger " + removeID + " successfully removed. ");
        }
        else{
            System.out.println(" Passenger " + removeID + " not found.");
        }

        // Search one passenger in the list
        int searchID = 102;
        System.out.println("\n Searching passenger with ID: " + searchID);
        Passenger found = passengerFly.findPassenger(searchID);
        if(found != null){
            System.out.println(" Found: " + found);
        }
        else{
            System.out.println(" Passenger not found. ");
        }

        // Final passenger list.
        System.out.println(" \n Final Passenger List: ");
        passengerFly.printList();

    }
}