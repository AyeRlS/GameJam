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
        Prince Hamza = new Prince();
    }
}
