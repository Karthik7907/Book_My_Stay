import java.util.Arrays;
import java.util.List;

class ReservationValidator {
    // Note: Case-sensitive as required by the use case
    private final List<String> validRooms = Arrays.asList("Single", "Double", "Suite");

    public void validate(String guestName, String roomType) throws InvalidBookingException {
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }
        if (!validRooms.contains(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }
    }
}