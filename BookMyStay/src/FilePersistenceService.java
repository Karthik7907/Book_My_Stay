import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

class FilePersistenceService {
    public void saveInventory(RoomInventory inventory, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Map.Entry<String, Integer> entry : inventory.getInventoryMap().entrySet()) {
                writer.write(entry.getKey() + "-" + entry.getValue() + "\n");
            }
            System.out.println("\nInventory saved successfully.");
        } catch (IOException e) {
            System.out.println("\nError saving inventory.");
        }
    }

    public void loadInventory(RoomInventory inventory, String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("No valid inventory data found. Starting fresh.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("-");
                if (parts.length == 2) {
                    inventory.setInventory(parts[0], Integer.parseInt(parts[1]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No valid inventory data found. Starting fresh.");
        }
    }
}
