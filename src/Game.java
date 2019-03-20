import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {

    List<Encounter> encounterList;
    List<Room> roomList;
    List<Character> party;

    Prince Hamza;

    public Game() {
        encounterList = new ArrayList<Encounter>();
        roomList = new ArrayList<Room>();
        party = new ArrayList<Character>();
        Hamza = new Prince();
    }

    public void Initialize(){
        party.add(Hamza);

        String first = "A young prince was coming of age. As part of the kingdoms traditions, he had to prove himself as worthy heir to the throne by performing a dangerous mission. His mission is to journey to the wastelands beyond the kingdom perimeter and find treasures worthy to present to the King, his farther.\n" +
                "Hamza the only prince of the Kingdom of Tanélia is a prince loved by everyone.\n" +
                "A legend is told in his kingdom, the legend of the diamond heart who’s the biggest diamond of the kingdom. This diamond is supposed to be in a donjon guarded by horrible monsters. To reach the donjon you must cross a malefic forest infested of monster. \n" +
                "This prince dream about this treasure and train with the best knights of the kingdom to get strong enough to face all the dangers. The only problem is that the king and the queen don’t want to let him leave so he must escape from the castle with the help of his favorite maid.\n" +
                "After he has packed all his equipment, Hamza right the letter he wrote on his bed and join his favorite maid Fatima in the kitchen and thanks to Fatima, you can escape from the castle.\n" +
                "";

        encounterList.add(new Encounter(first, new ArrayList<String>()));
        encounterList.get(0).choices.add("say goodbye");
        encounterList.get(0).choices.add("Turn around without a goodbye");
        roomList.add(new Room("Castle", "None", "None", encounterList.get(0),"",party));

        String second = "You are out of the castle, but you must get out from the town now, so you put your hood because you don’t want to be recognize.\n"
                +" You are very discreet and careful, and you finally reach the principal door, but she is guarded by a Knight the best friend of your father and your teacher.\n"
                + "You must get out, so you go in front of the door, but he doesn’t have to recognize you.\n";

        encounterList.add(new Encounter(second,new ArrayList<String>()));
        encounterList.get(1).choices.add("Talk and pray");
        encounterList.get(1).choices.add("Knock him out and run.");
        roomList.add(new Room("Castle", "None", "None", encounterList.get(1),"Hey tell me your name if you want to get out",party));


        String third = " \n" +
                "After a half day of walk, you are finally at the forest border. You know how dangerous the forest is. She is infested of monster and robber, so you decided to take your weapon but you lost your sword and shield. \n" +
                "You decided to get in anyway with a wood stick as a sword because you have done too much thing to cut back. \n" +
                "You can instantly feel a bad atmosphere when you enter in the forest. \n" +
                "You are very careful , he avoid every fight with the monster of the forest as arakne and abraknyde.\n"
                + "After a long time , you are exhausted and you have to rest but a robber attacks you .\n";

        encounterList.add(new Encounter(third,new ArrayList<String>()));
        encounterList.get(2).choices.add("Fight him with your basic equipment.");
        encounterList.get(2).choices.add("Run.");
        roomList.add(new Room("Forest", "None", "None", encounterList.get(2),"",party));


        String fourth = "Now you understand that danger is everywhere you have to be in movement. \n" +
                "You found a merchant in the middle of the wood. He sells weapon as sword or bow and arrow.";
        encounterList.add(new Encounter(fourth,new ArrayList<String>()));
        encounterList.get(3).choices.add("Fight him with your basic equipment.");
        encounterList.get(3).choices.add("Run.");
        roomList.add(new Room("Forest", "None", "None", encounterList.get(3),"Hello young boy what can I do for you?",party));

        String five = "“The sword ? It’s 300 gold.”\n" +
                "You look in your pocket and you only have 280 gold\n";

        encounterList.add(new Encounter(five,new ArrayList<String>()));
        encounterList.get(4).choices.add("Hum let me think about it… Ok because i will not let you die my prince ;)");
        encounterList.get(4).choices.add("Leave.");
        roomList.add(new Room("Forest", "None", "None", encounterList.get(4),"",party));


        String six = "You rest and continue your journey.\n" +
                "You leave the forest after defeated some robber thanks to your new weapon.\n"
                + "You are finally out of the forest , it means that you can go to the dungeon. The dungeon is the last step of your quest to find the diamond heart but who knows what is in it ....\n" +
                "Even if you are scared, you are so motivated so you run into the dungeon without thinking about your health and your equipment. \n" +
                "“.........................................”\n" +
                "It’s very quiet and calm, it looks like an abandoned castle. You walk and nothing is happening so you start thinking that your dream is only a legend and you start to release your attention. \n" +
                "“CLONG,CLONG,CLONG”\n" +
                "You don’t understand, you are suddenly scared. You turn around and see a giant ghost knight.\n" +
                "You tried to hurt him but nothing happened. The only thing you can do is to dodge and to defeated him by another way or fight him until he dies.\n";

        encounterList.add(new Encounter(six,new ArrayList<String>()));
        encounterList.get(5).choices.add("Fight him");
        encounterList.get(5).choices.add("Use your brain.");
        roomList.add(new Room("Dungeon", "None", "None", encounterList.get(5),"",party));


        String seven = "You can drop the shield or the sword of the knight but only one because they are really heavy.\n";
        encounterList.add(new Encounter(seven,new ArrayList<String>()));
        encounterList.get(6).choices.add("Sword");
        encounterList.get(6).choices.add("Shield");
        roomList.add(new Room("Dungeon", "None", "None", encounterList.get(6),"",party));



        String eight = "You keep exploring the dungeon and the temperature become warmer and warmer. \n" +
                "“Aaaaaaaaaaaaaaaaaaaaaaaaaah”\n" +
                "You understand that it was not a monster, but a human. \n" +
                "“Cling cling cling”\n" +
                "Some people are fighting against something, you start running and you finally find them. A wizard and a warrior are fighting against a dragon and thoughtlessly you jump in the fight to help them and you finally defeat the dragon.\n" +
                "You decide to stay with them, and you defeated the boss of the dungeon together a dragon knight with a fire sword. When he died , everybody disappear except 3 big diamonds.\n" +
                "It was your dream , you finally reach your goal except the fact that there is 3 diamond hearts. What do you want to do ? Steal the 3 diamonds our share the treasure.\n";


        encounterList.add(new Encounter(eight,new ArrayList<String>()));
        encounterList.get(7).choices.add("Steal the treasure");
        encounterList.get(7).choices.add("Share");
        roomList.add(new Room("Dungeon", "None", "None", encounterList.get(7),"",party));

    }

    public void Launch(){
        int res_0 = roomList.get(0).Play();
        if(res_0 == 1){
            System.out.println("Fatima give you something ....");
            Hamza.inventory.add("Food");
        }
        if(res_0 == 2){
            System.out.println("...");
        }

        int res_1 = roomList.get(1).Play();
        if(res_1 == 1){
            Random rand = new Random();
            int randInt = rand.nextInt(2);
            if(randInt == 0){
                System.out.println("He recognizes you and you have to run.\n You loose your weapon in your escape.");
            }
            else{
                System.out.println("He didn't recognizes you, but in haste you have lost your weapons ...");
            }
        }
        if(res_1 == 2){
            System.out.println("“Hey stop!!! , clang clang”");
            System.out.println("You loose your weapon in your escape.");
        }




    }

    private void GameOver(){
        System.out.println("You take a bad choice....");
    }
}
