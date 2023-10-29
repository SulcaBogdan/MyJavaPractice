package MyBdoProject.Monsters_Creatures.Behaviour;

import MyBdoProject.CharacterTree.Classa;


public interface Aggressive {

     boolean isAgressive = true;
    void reactionToPlayer();

    int attack(Classa object, int numOfHits);


    void defend();
}
