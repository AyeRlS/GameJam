public class Main {
    static void print (String S)
    {
        try
        {
            boolean newLine = false;
            for (int i = 0; i < S.length(); i++)
            {
                char c = S.charAt(i);
                if (newLine && c == ' ')
                {
                    System.out.print('\n');
                    newLine = false;
                    Thread.sleep(200);
                }
                else
                    System.out.print(c);
                if ((i + 1) % 100 == 0)
                    newLine = true;
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("got interrupted!");
        }
    }

    public static void main(String[] args)
    {
        print("A young prince was coming of age. As part of the kingdoms traditions, he had to prove himself as worthy heir to the throne by performing a dangerous mission. His mission is to journey to the wastelands beyond the kingdom perimeter and find treasures worthy to present to the King, his farther.");
    }
}
