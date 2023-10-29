package MyBdoProject.Monsters_Creatures;

public abstract class Creature {
    private static int creaturesCount = 0;
    int healthPoints;
    String name;
    String appearance;


    public Creature(String name, String appearance, int healthPoints){
        this.name = name;
        this.appearance = appearance;
        this.healthPoints = healthPoints;
        creaturesCount++;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
