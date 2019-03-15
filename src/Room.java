public class Room
{
    String name;
    String loot;
    String enemies;
    Encounter encounter;
    Character[] characters;

    public Room(String name, String loot, String enemies, Encounter encounter, Character[] characters)
    {
        this.name = name;
        this.loot = loot;
        this.enemies = enemies;
        this.encounter = encounter;
        this.characters = characters;
    }
    public void Enter()
    {
        
    }
}
