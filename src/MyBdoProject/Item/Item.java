package MyBdoProject.Item;

import MyBdoProject.CharacterTree.Classa;
import MyBdoProject.Item.Interfaces.ItemCategory;

import java.util.ArrayList;
import java.util.List;

public class Item implements ItemCategory {
    int enchanceLevel = 0;
    static int itemCount = 0;
    int itemPowerLevel;
    String itemType;
    String itemName;
    String itemGrade;
    String itemColor;
    int itemValue;
    int itemWeight;
    int itemDropRate;
    boolean isEnchantable;

    ///Constructor
    public Item(String itemName, String itemType, int itemPowerLevel, int itemValue, int itemWeight, String itemGrade, int itemDropRate , boolean isEnchantable){
        this.itemPowerLevel = itemPowerLevel;
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemWeight = itemWeight;
        this.itemDropRate = itemDropRate;
        this.itemGrade = itemGrade;
        this.isEnchantable = isEnchantable;
        itemCount++;
        Inventory.inventoryWeight -= itemWeight;

        for (int i = 0; i < itemCategory.length; i++) {
            boolean isCorrectType = true;
            if (itemCategory[i] == itemType){
                System.out.println("Category typed right");
                break;
            }
            if (i == itemCategory.length-1){
                isCorrectType = false;
                throw new IllegalArgumentException("Item type not good, retype your item type.");
            }
        }
        if (Inventory.inventoryWeight < 0){
            throw new IllegalArgumentException("You surpassed you inventory weight");
        }
    }

    public int getItemValue() {
        return itemValue;
    }

    public String getName(){
        return itemName;
    }

    public int getItemPowerLevel() {
        return itemPowerLevel;
    }

    public String getItemType() {
        return itemType;
    }

    public void equipWeapon(Item weaponObject, Classa characterName) {

        if (weaponObject.getItemType() == itemType){
            characterName.setPowerLevelIncrease(weaponObject.getItemPowerLevel());
            System.out.println("You have equipped your "+ itemType + " weapon " + "named " + itemName +
                    "\nCurrent character power level: " + characterName.getPowerLevel()  );
            Inventory.getInventory().remove(weaponObject.getName());

        }else if (weaponObject.getItemType() == itemType){
            System.out.println("You have equipped your "+ itemType + " weapon " + "named " + itemName +
                    "\nCurrent character power level: " + characterName.getPowerLevel()  );
            characterName.setPowerLevelIncrease(weaponObject.getItemPowerLevel());
            Inventory.getInventory().remove(weaponObject.getName());

        }else if (weaponObject.getItemType() == itemType){
            System.out.println("You have equipped your "+ itemType + " weapon " + "named " + itemName +
                    "\nCurrent character power level: " + characterName.getPowerLevel()  );
            characterName.setPowerLevelIncrease(weaponObject.getItemPowerLevel());
            Inventory.getInventory().remove(weaponObject.getName());
        }else {
            throw new IllegalArgumentException("Weapon type is wrong, retype again ");
        }
    }


    public void unequipWeapon(Item weaponObject, Classa characterName){
        characterName.setPowerLevelDecrease(weaponObject.getItemPowerLevel());
        System.out.println("You've unequipped your " + itemType + " and your power level is now "+ characterName.getPowerLevel());
        Inventory.getInventory().add(weaponObject.getName());
    }


    public void enchanceWeapon(Item weaponObject){

        if (!weaponObject.isEnchantable()){
            throw  new IllegalArgumentException ("This item cannot be enchanced");
        }

        double enchantChance = (int) (Math.random() * 100);
        int enchantPowerUp  = 1000;
        int enchantValueUp = 240000;

        if (!Inventory.getInventory().contains(weaponObject.getName())){
            System.out.println("Unequip the weapon first");
            return;
        }
        if (enchanceLevel > 10){
            enchantValueUp = 1000000;
        }
        if (enchanceLevel == 15){
            final int enchanceLevel = 15;
            System.out.println("Item reached max level");
            return;
        }


        if (enchantChance > 1 && enchanceLevel == 0){
            enchanceLevel++;
            itemPowerLevel += enchantPowerUp;
            itemValue += enchantValueUp;
            System.out.println("Succes!! your item is not +"+ enchanceLevel);
        } else if (enchantChance > 15) {
            enchanceLevel++;
            itemPowerLevel += enchantPowerUp;
            itemValue += enchantValueUp;
            System.out.println("Succes!! your item is now +"+ enchanceLevel);
        }else {
            enchanceLevel--;
            itemPowerLevel -= enchantPowerUp;
            itemValue -= enchantValueUp;
            System.out.println("Failed!! Your item is now +"+ enchanceLevel );
        }

    }

    @Override
    public void itemDropRate(Item itemObject) {
        for (int i = 0; i < itemForms.length; i++) {
            if (itemForms[i].equals(itemObject.itemGrade)) {
                itemDropRate += defaultItemDropRate;
                itemColor = itemColors[i];
                System.out.println("This item drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            } else if (itemForms[i].equals(itemObject.itemGrade)) {
                itemDropRate += defaultItemDropRate + 10;
                itemColor = itemColors[i];
                System.out.println("This item drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            } else if (itemForms[i].equals(itemObject.itemGrade)) {
                itemDropRate += defaultItemDropRate + 20;
                itemColor = itemColors[i];
                System.out.println("This item drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            }else{
                itemDropRate += defaultItemDropRate +50;
                itemColor = itemColors[i];
                System.out.println("This item drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            }
        }
    }

    @Override
    public void accessoryDropRate(Item itemObject) {
        for (int i = 0; i < itemAccessories.length; i++) {
            if (itemAccessories[i].equals(itemObject.itemGrade)) {
                itemDropRate += defaultAccesoriesDropRATE;
                itemColor = itemColors[i];
                System.out.println("This item named " + itemObject.getName() +
                        " drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            } else if (itemAccessories[i].equals(itemObject.itemGrade)) {
                itemDropRate += defaultAccesoriesDropRATE + 5;
                itemColor = itemColors[i];
                System.out.println("This item named " + itemObject.getName() +
                        " drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            } else if (itemAccessories[i].equals(itemObject.itemGrade)) {
                itemDropRate += defaultAccesoriesDropRATE + 10;
                itemColor = itemColors[i];
                System.out.println("This item named " + itemObject.getName() +
                        " drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            }else{
                itemDropRate += defaultAccesoriesDropRATE +30;
                itemColor = itemColors[i];
                System.out.println("This item named " + itemObject.getName() +
                        " drop rate is " + itemDropRate + " and its color and grade is " + itemColor + " and " + itemGrade);
                break;
            }
        }

    }
    public boolean isEnchantable() {
        return isEnchantable;
    }
}

