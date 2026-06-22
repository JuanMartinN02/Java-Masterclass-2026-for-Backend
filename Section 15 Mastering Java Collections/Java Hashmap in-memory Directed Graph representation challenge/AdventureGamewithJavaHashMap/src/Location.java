import java.util.HashMap;
import java.util.Map;

public class Location {
    private String description;
    Map<String, String> exits;

    public Location(String description) {
        this.description = description;
        this.exits = new HashMap<>();
    }



    public void addExit(String direction, String destination){
        exits.put(direction, destination);
    }

    public void printExits(){
        System.out.println("You are standing " + this.description +  ". From here you can see: ");
        for (Map.Entry<String, String> entry : exits.entrySet()){
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getExits() {
        return exits;
    }

    public void setExits(Map<String, String> exits) {
        this.exits = exits;
    }
}