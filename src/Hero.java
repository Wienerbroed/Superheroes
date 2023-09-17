public class Hero {
    private String name;
    private String realName;
    private String superpower;
    private int yearCreated;
    private String isHuman;
    private int strength;

    public Hero(String name, String realName, String superpower, int yearCreated, String isHuman, int strength) {
        this.name = name;
        this.realName = realName;
        this.superpower = superpower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }
    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }
    public String getSuperpower(){
        return superpower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getIsHumanisHuman() {
        return isHuman;
    }

    public int getStrength() {
        return strength;
    }
public String toString() {
        return ("\nYour Hero is ready to fight crime!\n" +
                "Name: " + name + "\n" +
                "Secret identity: " + realName + "\n" +
                "Superpower: " + superpower + "\n" +
                "Year of creation: " + yearCreated + "\n" +
                "Is a Human: " + isHuman + "\n" +
                "Strenght: " + strength + "\n");
}
}
