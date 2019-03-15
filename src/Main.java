import java.util.ArrayList;
import java.util.List;

public class Main {

    static void print (String S)
    {
        try
        {
            boolean newLine = false;
            int numberofChar = 1;
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
                        System.out.print("\n...");
                        numberofChar = 1;
                        System.in.read();
                        break;

                    default :
                        System.out.print(c);
                }
                numberofChar++;
                if (numberofChar % 100 == 0)
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
        Game game = new Game();
        game.Initialize();
        game.Launch();
    }
}
