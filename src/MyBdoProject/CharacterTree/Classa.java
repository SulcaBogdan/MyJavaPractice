package MyBdoProject.CharacterTree;

public class Classa extends GameCharacter {
    String className;
    private int healthPoints;
    int powerLevel;

   public static final String[] CLASS_LIST = {"Warrior", "Ranger", "Sorceress", "Berserker", "Tamer", "Musa", "Maehwa", "Valkyrie", "Kunoichi", "Ninja", "Wizard", "Witch","Dark Knight",
    "Striker", "Mystic", "Archer", "Lahn", "Shai", "Hashashin", "Guardian", "Nova", "Sage", "Corsair","Drakania", "Woosa", "Maegu"};

    public Classa(String name ,String className, String gender , int height, int weight, int powerLevel, int healthPoints){
        super(name, gender, height, weight);
        this.className = className;
        this.healthPoints = healthPoints;
        this.powerLevel = powerLevel;

        boolean classExists = false;

        for (String nume : CLASS_LIST){
            if (nume.equals(className)){
                classExists = true;
                System.out.println("You created succesfully a  "+ className);
                break;
            }
        }
            if (!classExists){
                throw new IllegalArgumentException("Class " + className + " does not exists in the game. Please retype you class name.");
            }
        }

    public int getPowerLevel() {
        return powerLevel;
    }
    public int setPowerLevelIncrease(int value){
        powerLevel += value;
        return powerLevel;
    }

    public int setPowerLevelDecrease(int value){
        powerLevel -= value;
        return powerLevel;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int newHealthPoints){
        healthPoints = newHealthPoints;
    }

    public void reduceHealthPoints(int damage){
        int newHealth = healthPoints - damage;
        if (newHealth < 0){
            System.out.println("Your character died");
            newHealth = 0;
        }
        setHealthPoints(newHealth);
    }


    public void classInfo() {
        System.out.println("Hello i am a " + className );
    }


}











