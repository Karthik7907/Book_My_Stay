import java.util.LinkedList;
import java.util.Queue;
public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Booking Request Queue\n");

        // Initialize booking queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create booking requests (Arrival order: Abhi, Subha, Vanmathi)
        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        // Add requests to the queue (FIFO - First In, First Out)
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Display queued booking requests in the order they arrived
        int position = 1;
        while (bookingQueue.hasPendingRequests()) {
            Reservation current = bookingQueue.processNextRequest();
            System.out.println("Processing Request #" + (position++) + ":");
            System.out.println("Guest: " + current.getGuestName());
            System.out.println("Room Type: " + current.getRoomType());
            System.out.println("---------------------------");
        }
    }
}