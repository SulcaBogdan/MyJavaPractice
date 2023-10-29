package MyBdoProject.Monsters_Creatures;

import MyBdoProject.Monsters_Creatures.Behaviour.Paceful;

public class Vegetal extends Creature implements Paceful {
    int atackDamage;
    public Vegetal(String name, String appearance, int healthPoints, boolean isAggressive, int atackDamage) {
        super(name, appearance, healthPoints);
        this.atackDamage = atackDamage;
    }

    @Override
    public void reactionToPlayer() {
        System.out.println("This is a cute herbivore creature. You can even pet him. :)");
        }

    @Override
    public void creatureActivity() {
        System.out.println("Eating grass , sleep , repeat...");
    }


}
