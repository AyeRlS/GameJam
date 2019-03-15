public class Prince extends Character
{
    int gold;

    public Prince ()
    {
        alive = true;
        name = "Hamza";
        gold = 2147483647;
    }

    public void Dead(){
        alive = false;
    }
}
