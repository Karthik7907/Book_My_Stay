import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Bookmystay
{
    public static void main(String[] args) {
        System.out.println("Booking Validation");
        Scanner scanner = new Scanner(System.in);
        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue bookingQueue = new BookingRequestQueue();
        try {
            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();
            System.out.print("Enter room type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();
            validator.validate(guestName, roomType);
            System.out.println("Booking successfully validated and queued!");
        } catch (InvalidBookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}