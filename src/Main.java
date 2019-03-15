import java.util.ArrayList;
import java.util.List;

public class Main {
    static void print (String S)
    {
        try
        {
            boolean newLine = false;
            for (int i = 0; i < S.length(); i++)
            {
                char c = S.charAt(i);
                switch (c)
                {
                    case ' ' :
                        if (newLine)
                        {
                            System.out.print('\n');
                            newLine = false;
                            Thread.sleep(200);
                        }
                        else
                            System.out.print(c);
                        break;

                    case '\n':
                        System.in.read();
                        System.out.print('\n');
                        break;

                    default :
                        System.out.print(c);
                }

                if ((i + 1) % 100 == 0)
                    newLine = true;
            }
        }
        catch(Exception e)
        {
            System.out.println("Whatever");
        }
    }

    public static void main(String[] args)
    {
        String first = "A young prince was coming of age. As part of the kingdoms traditions, he had to prove himself as worthy heir to the throne by performing a dangerous mission. His mission is to journey to the wastelands beyond the kingdom perimeter and find treasures worthy to present to the King, his farther.";
        String sec = "Hamza the only prince of the Kingdom of Tanélia is a prince loved by everyone.\\n\\nA legend is told in his kingdom, the legendof the diamond heart who’s the biggest diamond of the kingdom.This diamond is supposed to be in a donjon guarded by horriblemonsters. To reach the donjon you must cross a malefic forest infested of monster. \\n\\nThis prince dream about this treasure and train with the best knights of the kingdom to get strong enough to face all the dangers. The only problem is that the kingand the queen don’t want to let him leave so he must escape from the castle with the help of his favorite maid.";

        Prince Hamza = new Prince();
        List<Character> party = new ArrayList<Character>();
        party.add(Hamza);

        List<String> choices = new ArrayList<String>();
        choices.add("say goodbye");
        choices.add("Turn around without a goodbye");

        Encounter castleE = new Encounter(first, choices);
        Room castle = new Room("Castle", "None", "None", castleE, party);
    }
}
