package MyBdoProject.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    static int inventoryWeight = 250;
    static List<String> inventory = new ArrayList<String>();


    public static List<String> getInventory() {
        return inventory;
    }

    public static void addInventory(String itemName) {
        for (int i = 0; i < inventory.size(); i++) {
            inventory.add(itemName);
        }
    }

    public static void removeInventory(String itemName){
        if (inventory.contains(itemName)){
            inventory.remove(itemName);
        }
        System.out.println("Item does not exist in inventory");
    }

}
