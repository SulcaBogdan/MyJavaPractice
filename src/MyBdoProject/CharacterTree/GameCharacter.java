package MyBdoProject.CharacterTree;

public abstract class GameCharacter {
    private static int charactersCount = 0;

    private String name;
    private String gender;
    private int height;
    private int weight;

    public GameCharacter(String name, String gender, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        charactersCount++;

    }


    public static int getCharactersCount() {
        return charactersCount;
    }

}
