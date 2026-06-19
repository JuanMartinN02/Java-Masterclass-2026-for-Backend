import java.util.HashMap;
import java.util.Map;

public class Location {
    private String description;
    Map<String, String> exits;

    public Location(String description) {
        this.description = description;
        this.exits = new HashMap<>();
    }

    public boolean addExit(String direction, String destination){
        return false;
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
