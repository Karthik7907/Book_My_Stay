import java.util.ArrayList;
import java.util.List;

class BookingHistory {
    private List<Reservation> history = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        history.add(reservation);
    }

    public List<Reservation> getHistory() {
        return history;
    }
}