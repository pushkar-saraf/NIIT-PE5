import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("val1", "Earth");
        map.put("val2", "Mars");
        System.out.println(map.toString());
        if(map.containsKey("val1")){
            map.put("val2", map.get("val1"));
            map.put("val1", "");
        }
        System.out.println(map.toString());
    }
}
