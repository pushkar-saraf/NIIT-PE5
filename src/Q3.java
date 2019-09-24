import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Integer> occurrences = new HashMap<>();
        Map<String, Boolean> bools = new HashMap<>();
        for (String s : arr) {
            occurrences.put(s, occurrences.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String, Integer> occurence: occurrences.entrySet()){
            bools.put(occurence.getKey(), occurence.getValue()>1);
        }
        System.out.println(bools);
    }
}
