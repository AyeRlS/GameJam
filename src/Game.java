import java.util.ArrayList;
import java.util.List;


public class Game {

    List<Encounter> encounterList;
    List<Room> roomList;

    public Game() {
        encounterList = new ArrayList<Encounter>();
        roomList = new ArrayList<Room>();
    }

    public void Initialize(){
        String first = "A young prince was coming of age. As part of the kingdoms traditions, he had to prove himself as worthy heir to the throne by performing a dangerous mission. His mission is to journey to the wastelands beyond the kingdom perimeter and find treasures worthy to present to the King, his farther.\n" +
                "Hamza the only prince of the Kingdom of Tanélia is a prince loved by everyone.\n" +
                "A legend is told in his kingdom, the legend of the diamond heart who’s the biggest diamond of the kingdom. This diamond is supposed to be in a donjon guarded by horrible monsters. To reach the donjon you must cross a malefic forest infested of monster. \n" +
                "This prince dream about this treasure and train with the best knights of the kingdom to get strong enough to face all the dangers. The only problem is that the king and the queen don’t want to let him leave so he must escape from the castle with the help of his favorite maid.\n" +
                "After he has packed all his equipment, Hamza right the letter he wrote on his bed and join his favorite maid Fatima in the kitchen and thanks to Fatima, you can escape from the castle.\n" +
                "";
        Prince Hamza = new Prince();
        List<Character> party = new ArrayList<Character>();
        party.add(Hamza);
        List<String> choices = new ArrayList<String>();
        choices.add("say goodbye");
        choices.add("Turn around without a goodbye");
        encounterList.add(new Encounter(first, choices));
        roomList.add(new Room("Castle", "None", "None", encounterList.get(0), party));



    }

    public void Launch(){
        roomList.get(0).Play();
    }

}