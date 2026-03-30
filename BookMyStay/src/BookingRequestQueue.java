import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {
    private Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation request) {
        queue.add(request);
    }

    public boolean hasPendingRequests() {
        return !queue.isEmpty();
    }

    public Reservation processNextRequest() {
        return queue.poll();
    }
}