package HeadJavaOOP.DotComGame;

import java.util.ArrayList;
import java.util.Arrays;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;



    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput) {
        int intUserAnswer = Integer.parseInt(userInput);
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Kill";
                System.out.println("Ouch! You sunk " + name + "  :(");
            }else {
                result = "Hit";
            }
        }
        return result;
    }

    void setLocationCells(ArrayList<String> loc){
            locationCells = loc;
        }

    }



