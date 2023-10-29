package MyBdoProject.Item.Interfaces;

import MyBdoProject.Item.Item;

public interface ItemCategory {

    String[] itemCategory = {"Awakening", "Sub-Weapon", "Main-Weapon", "Helmet", "Chest", "Gloves", "Shoes"};
    String[] itemAccessories = {"Belt", "Earring","Necklace", "Ring"};
    String[] itemForms = {"Legendary", "Epic", "Rare", "Common"};
    String[] itemColors = {"Yellow", "Purple", "Blue", "White"};

    int defaultItemDropRate = 10;
    int defaultAccesoriesDropRATE = 5;

     void itemDropRate(Item itemObject);
     void accessoryDropRate(Item ItemObject);





}
