import java.util.List;

public class Room
{
    String name;
    String loot;
    String enemies;
    Encounter encounter;
    List<Character> characters;

    public Room(String name, String loot, String enemies, Encounter encounter, List<Character> characters)
    {
        this.name = name;
        this.loot = loot;
        this.enemies = enemies;
        this.encounter = encounter;
        this.characters = characters;
    }
    public int Play()
    {
        System.out.println("The Prince just entered : " + name);
        //encounter.TellMe();
        encounter.DisplayChoices();

        return encounter.getChoice();
    }
}
