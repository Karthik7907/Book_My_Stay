import java.util.HashMap;
import java.util.Map;
public class Bookmystay {
    public static void main(String[] args) {
        // Initialize Inventory (System State)
        Map<String, Integer> availability = new HashMap<>();
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);

        System.out.println("--- Room Search Results ---\n");

        // Logic to check and display availability without modifying the map
        if (availability.get("Single") > 0) {
            System.out.println("Single Room:");
            new SingleRoom().displayInfo();
            System.out.println("Available: " + availability.get("Single"));
        }

        if (availability.get("Double") > 0) {
            System.out.println("\nDouble Room:");
            new DoubleRoom().displayInfo();
            System.out.println("Available: " + availability.get("Double"));
        }

        if (availability.get("Suite") > 0) {
            System.out.println("\nSuite Room:");
            new SuiteRoom().displayInfo();
            System.out.println("Available: " + availability.get("Suite"));
        }
    }
}