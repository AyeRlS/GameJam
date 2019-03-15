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
    public void DisplayChoices ()
    {
        int i = 1;
        for (String s : choices)
        {

        }
    }
}
