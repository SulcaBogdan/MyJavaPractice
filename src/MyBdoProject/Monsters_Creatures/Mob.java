package MyBdoProject.Monsters_Creatures;

import MyBdoProject.CharacterTree.Classa;
import MyBdoProject.Monsters_Creatures.Behaviour.Aggressive;

public class Mob extends Creature implements Aggressive {
    int attackDamage;
    boolean isAngry;

    public Mob(String name, String appearance, int healthPoints, int attackDamage) {
        super(name, appearance, healthPoints);
        this.attackDamage = attackDamage;
    }

    @Override
    public void reactionToPlayer() {
        System.out.println("This " + name + " its really aggressive. Watch out!");
    }

    @Override
    public int attack(Classa object, int numOfHits) {
        System.out.println("The mob " + name + " attacked you");
        int damage = attackDamage * numOfHits;
        if (damage > 0){
            object.reduceHealthPoints(damage);
        }
        System.out.println("And dealt damage of " + damage + " health points, in "+ numOfHits + " hits");
        return damage;
    }

    @Override
    public void defend() {
        System.out.println("I can defend!");
        System.out.println(name + " restores his hp with "+ attackDamage + " health points!");
        healthPoints += attackDamage;
        }


    }

