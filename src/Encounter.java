import java.util.List;

public class Encounter
{
    String story;
    List<String> choices;

    public Encounter(String story, List<String> choices)
    {
        this.story = story;
        this.choices = choices;
    }

    public void TellMe ()
    {
        Main.print(story);
    }
}
