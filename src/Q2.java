import java.util.HashMap;
import java.util.Map;

public class Q2 {

    public static void main(String[] args) {
        Map<String, Integer> occurrences = new HashMap<>();
        String str = "one one -one___two,,three,one @three*one?two";
        occurrences.put("one",getNoOfOccurrences(str, "one"));
        occurrences.put("two",getNoOfOccurrences(str, "two"));
        occurrences.put("three",getNoOfOccurrences(str, "three"));
        System.out.println(occurrences.toString());
    }

    private static int getNoOfOccurrences(String str, String word) {
        int occurrences = 0;
        for (int i = 0; i < str.length(); i++) {
            int occurrence = str.indexOf(word,i);
            if(occurrence!=-1){
                occurrences += 1;
                i = occurrence;
            } else {
                break;
            }
        }
        return occurrences;
    }
}
