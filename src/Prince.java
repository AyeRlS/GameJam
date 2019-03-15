import java.util.ArrayList;
import java.util.List;

public class Prince extends Character
{
    int gold;
    List<String> inventory;
    public Prince ()
    {
        alive = true;
        name = "Hamza";
        gold = 300;
        inventory = new ArrayList<String>();
    }

    public void Dead(){
        alive = false;
    }
}

    public void DisplayInventory ()
    {

    }
}