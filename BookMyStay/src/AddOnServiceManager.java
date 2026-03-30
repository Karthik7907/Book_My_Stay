import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AddOnServiceManager {
    private Map<String, List<Service>> selections = new HashMap<>();

    public void addService(String reservationId, Service service) {
        selections.computeIfAbsent(reservationId, k -> new ArrayList<>()).add(service);
    }

    public void displaySelectedServices(String reservationId) {
        List<Service> services = selections.get(reservationId);
        if (services != null) {
            double total = 0;
            for (Service s : services) {
                System.out.println("- " + s.getName() + " ($" + s.getPrice() + ")");
                total += s.getPrice();
            }
            System.out.println("Total Add-On Cost: $" + total);
        }
    }
}