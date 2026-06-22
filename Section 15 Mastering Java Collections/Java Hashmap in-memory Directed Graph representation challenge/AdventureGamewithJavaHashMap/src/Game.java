import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Map<String, Location> board = new HashMap<>();

        Location road = new Location("at the end of the road");
        Location hill = new Location("on top of hill with a view in all directions");
        Location well = new Location("inside a well house for a small spring");
        Location valley = new Location("in a forest valley beside a tumbling stream");
        Location forest = new Location("at the edge of a thick dark forest");
        Location lake = new Location("by an alpine lake surrounded by wildflowers");
        Location stream = new Location("near a stream with a rocky bed");

        board.put("road", road);
        board.put("hill", hill);
        board.put("well", well);
        board.put("valley", valley);
        board.put("forest", forest);
        board.put("lake", lake);
        board.put("stream", stream);

        // Central starting point: Road
        road.addExit("W", "hill");
        road.addExit("E", "well");
        road.addExit("N", "forest");
        road.addExit("S", "valley");

        // Hill (West)
        hill.addExit("N", "forest");
        hill.addExit("S", "valley");
        hill.addExit("E", "road");

        // Well (East)
        well.addExit("N", "lake");
        well.addExit("W", "road");
        well.addExit("S", "stream");

        // Forest (North)
        forest.addExit("W", "hill");
        forest.addExit("E", "lake");
        forest.addExit("S", "road");

        // Valley (South)
        valley.addExit("N", "road");
        valley.addExit("E", "stream");
        valley.addExit("W", "hill");

        // Lake (North-East)
        lake.addExit("S", "well");
        lake.addExit("W", "forest");

        // Stream (South-East)
        stream.addExit("N", "well");
        stream.addExit("W", "valley");

        System.out.println("--- WELCOME TO THE ADVENTURE GAME ---");
        Location currentLoc = road;
        Scanner scanner = new Scanner(System.in);

        while (true){

            currentLoc.printExits();
            System.out.println("Select Your Compass Direction (Q to quit)");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("Q")){
                System.out.println("--- THANKS FOR PLAYING ---");
                break;
            }else if(currentLoc.exits.containsKey(input)){
                currentLoc = board.get(currentLoc.exits.get(input));
            }else{
                System.out.println("Invalid output, select a correct destination or exit!");
            }

        }
    }
}