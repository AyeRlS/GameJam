public class UI
{
    public void print (String s)
    {
        new Thread(() ->
        {
            for (char c: s.toCharArray())
                System.out.println(c);
            System.out.print("\nok");
        });
    }
}
