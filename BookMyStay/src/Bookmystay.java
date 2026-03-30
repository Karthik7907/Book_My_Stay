import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("System Recovery\n");

        String filePath = "inventory_state.txt";

        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        persistenceService.loadInventory(inventory, filePath);
        inventory.displayInventory();
        persistenceService.saveInventory(inventory, filePath);
    }
}