import java.util.*;

class WordCount {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}