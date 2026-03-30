import java.util.HashMap;
import java.util.Map;

class RoomAllocationService {
    private Map<String, Integer> inventory = new HashMap<>();
    private Map<String, Integer> roomCounter = new HashMap<>();
    public RoomAllocationService() {
        inventory.put("Single", 2);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }
    public void processBooking(Reservation reservation) {
        String type = reservation.getRoomType();
        int available = inventory.getOrDefault(type, 0);

        if (available > 0) {
            inventory.put(type, available - 1);
            int currentCount = roomCounter.getOrDefault(type, 0) + 1;
            roomCounter.put(type, currentCount);
            String roomId = type + "-" + currentCount;

            System.out.println("Booking confirmed for Guest: " + reservation.getGuestName() +
                    ", Room ID: " + roomId);
        } else {
            System.out.println("Booking failed for Guest: " + reservation.getGuestName() +
                    ". No " + type + " Rooms available.");
        }
    }
}