package MyBdoProject.Monsters_Creatures;

import MyBdoProject.CharacterTree.Classa;
import MyBdoProject.Monsters_Creatures.Behaviour.Aggressive;



public class Carnivore extends Creature implements Aggressive {
    int atackDamage;
    public Carnivore(String name, String appearance, int healthPoints, int atackDamage) {
        super(name, appearance, healthPoints);
        this.atackDamage = atackDamage;
    }

    @Override
    public void reactionToPlayer() {
            System.out.println("The " + name + " saw you and will attack you! Keep your distance!!");
        }



    public int attack(Classa object, int numOfHits) {
        int damage = atackDamage * numOfHits;
        if (damage > 0){
            object.reduceHealthPoints(damage);
        }
        return damage;
    }

    @Override
    public void defend() {
        System.out.println("I am faster that you think! The "+ name + " dodges all the attacks");
    }
}
