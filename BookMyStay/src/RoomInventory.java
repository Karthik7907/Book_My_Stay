import java.util.LinkedHashMap;
import java.util.Map;

class RoomInventory {
    private Map<String, Integer> inventory = new LinkedHashMap<>();

    public RoomInventory() {
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    public void setInventory(String roomType, int count) {
        inventory.put(roomType, count);
    }

    public Map<String, Integer> getInventoryMap() {
        return inventory;
    }

    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: " + inventory.get("Single"));
        System.out.println("Double: " + inventory.get("Double"));
        System.out.println("Suite: " + inventory.get("Suite"));
    }
}