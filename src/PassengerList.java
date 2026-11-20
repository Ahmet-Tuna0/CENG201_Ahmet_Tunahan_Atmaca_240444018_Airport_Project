public class PassengerList {
    private Node head;

    private PassengerList(){
        this.head = null;
    }

    // This method add the new passenger at end of the queue
    public void addPassenger(Passenger p){
        Node newNode = new Node(p);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // This method remove a passenger at head of the queue.
    public boolean removePassenger(int id){  // We look for a parameter which is we want to find.
        if(head == null){
            return false;
        }

        if(head.data.getPassengerId() == id){
            head = head.next;
            return true;
        }

        Node current = head;
        while(current.next != null){
            if (current.next.data.getPassengerId() == id){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //  This method find the passenger whom is we want to
    public Passenger findPassenger(int id){
        Node temp = head;
        while(temp != null){
            if(temp.data.getPassengerId() == id){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // This method prints the passenger list.
    public void preintList(){
        if(head == null){
            System.out.println("Passenger list is empty !! ");
        }

        System.out.println(" --------- Passenger List ---------");
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Node getHead(){
        return head;
    }
}
