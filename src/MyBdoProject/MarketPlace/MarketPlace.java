package MyBdoProject.MarketPlace;

import MyBdoProject.Item.Inventory;
import MyBdoProject.Item.Item;

import java.util.HashMap;

public abstract class MarketPlace {


    private static int itemListed = 0;
    private static HashMap<String, Integer> itemShop = new HashMap<>();


    public static HashMap<String, Integer> getItemShop() {
        return itemShop;
    }
    public static void setItemShop(String itemName, int itemMarketValue) {
        itemShop.put(itemName,itemMarketValue);
        itemListed++;
    }

    public static int getMinPrice(String itemName){
        int result = itemShop.get(itemName) - 200000;
        return result;
    }

    public static int getMaxPrice(String itemName){
        int result = itemShop.get(itemName) + 200000;
        return result;
    }

    public static void addItemToMarketPlace(Item itemName){
        int itemMarketValue = itemName.getItemValue()*50;
        if (Inventory.getInventory().contains(itemName.getName())){
            itemShop.put(itemName.getName(),itemMarketValue);
            Inventory.removeInventory(itemName.getName());
            System.out.println("Your inventory after adding " + itemName.getName() + " to marketplace and your inventory " +  Inventory.getInventory());
            System.out.println(itemName.getName() + " added to the marketplace with the price of " + itemMarketValue);
        }else{
            throw new IllegalArgumentException("The item "+ itemName.getName()+" needs to be in your inventory.");
        }
    }





}
