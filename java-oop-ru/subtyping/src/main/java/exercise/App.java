package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage obj) {
        Map<String, String> map = obj.toMap();

        for (Entry<String, String> entry : map.entrySet()) {
            obj.set(entry.getValue(), entry.getKey());
            obj.unset(entry.getKey());
        }
    }
}
// END
