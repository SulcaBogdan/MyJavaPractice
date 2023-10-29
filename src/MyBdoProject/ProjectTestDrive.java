package MyBdoProject;
import MyBdoProject.CharacterTree.Classa;
import MyBdoProject.CharacterTree.Mage;
import MyBdoProject.Item.Inventory;
import MyBdoProject.Item.Item;
import MyBdoProject.Item.LegendaryWeapon.Sub_Weapon.Kutum;


public class ProjectTestDrive {
    public static void main(String[] args) {

        System.out.println("");
        Classa wizard = new Mage("Dodan", "Wizard", "male", 166, 78, 60000, 34000);

        Item kutum = new Kutum("Kutum", "Sub-Weapon", 3250, 255000, 25, 10, "Legendary", true);
        kutum.equipWeapon(kutum, wizard);
        kutum.itemDropRate(kutum);
        kutum.unequipWeapon(kutum, wizard);
        kutum.enchanceWeapon(kutum);
        System.out.println(Inventory.getInventory());



















    }
}
