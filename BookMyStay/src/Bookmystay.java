import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();
        CancellationService cancellationService = new CancellationService();

        cancellationService.cancelBooking("Single-1", "Single", inventory);

        cancellationService.showRollbackHistory();
    }
}