package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        var mapSentense = new HashMap<String, Integer>();

        if (sentence.isEmpty()) {
            return mapSentense;
        }

        var words = sentence.split(" ");
        for (var word : words) {
            if (mapSentense.containsKey(word)) {
                var count = mapSentense.get(word);
                mapSentense.put(word, count + 1);
            } else {
                mapSentense.put(word, 1);
            }
        }
        return mapSentense;
    }

    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }

        var keys = dictionary.keySet();
        StringBuilder result = new StringBuilder("{\n");
        for (var key : keys) {
            result.append("  ");
            result.append(key);
            result.append(": ");
            result.append(dictionary.get(key));
            result.append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
