import java.util.HashMap;
import java.util.Map;

class RoomAllocationService {
    private Map<String, Integer> roomCounter = new HashMap<>();

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {
        String type = reservation.getRoomType();
        if (inventory.getAvailability(type) > 0) {
            inventory.decreaseInventory(type);
            int count = roomCounter.getOrDefault(type, 0) + 1;
            roomCounter.put(type, count);
            String roomId = type + "-" + count;
            System.out.println("Booking confirmed for Guest: " + reservation.getGuestName() + ", Room ID: " + roomId);
        }
    }
}