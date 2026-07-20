import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {

    public static void main(String[] args) {
        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("Key", "Value");
        concurrentMap.put("Key2", "Value2");


        concurrentMap.remove("Key2", "Value2");

        // Slipped Condition
//        if (!concurrentMap.containsKey("Key2")){
//            concurrentMap.put("Key2", "Value2");
//        }

        // Fix for slipped condition
        concurrentMap.putIfAbsent("Key2", "Value2");
        System.out.println(concurrentMap.get("Key2"));

        concurrentMap.computeIfAbsent("Key3", (key) -> {
           System.out.println("Absent Key: " + key);
           return "Val2";
        });

        concurrentMap.computeIfPresent("Key", (key, val) -> {
            System.out.println("Present value: " + val);
            return "";
        });

    }
}
