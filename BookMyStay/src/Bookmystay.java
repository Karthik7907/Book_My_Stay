import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Add-On Service Selection");
        System.out.println("---------------------------");

        AddOnServiceManager manager = new AddOnServiceManager();

        // Define available services
        Service wifi = new Service("High-Speed WiFi", 15.0);
        Service breakfast = new Service("Buffet Breakfast", 25.0);
        Service spa = new Service("Spa Treatment", 100.0);

        // Simulation for a specific Reservation ID (e.g., from Use Case 6)
        String resId = "Single-1";
        System.out.println("Guest Reservation ID: " + resId);

        // Guest selects services
        manager.addService(resId, wifi);
        manager.addService(resId, breakfast);

        // Display results
        System.out.println("Selected Add-Ons:");
        manager.displaySelectedServices(resId);
        System.out.println("---------------------------");
    }
}