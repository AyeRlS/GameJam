import java.io.Console;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

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
    public void DisplayChoices (String question)
    {
        if(question != ""){
            System.out.println("\n\n" + question);
        }
        int i = 1;
        for (String s : choices)
        {
            System.out.println(i + ". " + s);
            i++;
        }
    }

    public int getChoice() {
        Scanner in = new Scanner(System.in);
        System.out.print("Your choice: ");
        int i = in.nextInt();

        System.out.println("\n\n");
        return i;
    }
}
