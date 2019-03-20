import java.util.List;

public class Room
{
    String name;
    String loot;
    String enemies;
    Encounter encounter;
    List<Character> characters;
    String question;


    public Room(String name, String loot, String enemies, Encounter encounter, String question, List<Character> characters)
    {
        this.name = name;
        this.loot = loot;
        this.enemies = enemies;
        this.encounter = encounter;
        this.characters = characters;
        this.question = question;
    }
    public int Play()
    {
        System.out.println("The Prince just entered : " + name);
        encounter.TellMe();
        encounter.DisplayChoices(question);

        return encounter.getChoice();
    }
}
