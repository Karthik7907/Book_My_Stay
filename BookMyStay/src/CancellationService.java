import java.util.Stack;

class CancellationService {
    private Stack<String> rollbackHistory = new Stack<>();

    public void cancelBooking(String reservationId, String roomType, RoomInventory inventory) {
        inventory.restoreRoom(roomType);

        String historyRecord = "Released Reservation ID: " + reservationId +
                "\nUpdated " + roomType + " Room Availability: " + inventory.getAvailability(roomType);
        rollbackHistory.push(historyRecord);

        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
    }
    public void showRollbackHistory() {
        System.out.println("\nRollback History (Most Recent First):");
        while (!rollbackHistory.isEmpty()) {
            System.out.println(rollbackHistory.pop());
        }
    }
}