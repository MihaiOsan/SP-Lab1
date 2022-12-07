import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        int i = 42;
        String s = (i<40) ? "l" : (i>50)? "u" : "e";
        System.out.print(s);
    }

    public static void charCounts(String userSort) {
        SortedMap<Character, Integer> counts = new TreeMap<>();
        for (int i=0; i < userSort.length(); ++i) {
            char c = userSort.charAt(i);
            if(counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        for(Character c : counts.keySet()){
            System.out.print(c);
        }
    }
}
