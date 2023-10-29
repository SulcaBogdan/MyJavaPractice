package MyBdoProject.CharacterTree;

import MyBdoProject.Item.Item;

public class Mage extends Classa {

    public Mage(String name ,String className, String gender , int height, int weight, int powerLevel, int healthPoints ){
        super(name,className,gender,height,weight, powerLevel, healthPoints);
    }

    @Override
    public void classInfo() {
        super.classInfo();
        System.out.println("I have a magic power level of -> " + powerLevel);
    }









}














