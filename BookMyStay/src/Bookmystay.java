import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Room Allocation Processing");
        System.out.println("---------------------------");
        Queue<Reservation> bookingQueue = new LinkedList<>();
        bookingQueue.add(new Reservation("Abhi", "Single"));
        bookingQueue.add(new Reservation("Subha", "Single"));
        bookingQueue.add(new Reservation("Vanmathi", "Single")); // This should fail as we only have 2
        RoomAllocationService service = new RoomAllocationService();

        while (!bookingQueue.isEmpty()) {
            service.processBooking(bookingQueue.poll());
        }
        System.out.println("---------------------------");
    }
}