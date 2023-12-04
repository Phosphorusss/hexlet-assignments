package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2){
        Map<String, String> diff = new LinkedHashMap<>();
        Set<String> data1Set = new TreeSet<>(data1.keySet());
        Set<String> data2Set = new TreeSet<>(data2.keySet());

        Set<String> keysAll = new TreeSet<>(data2.keySet());
        keysAll.addAll(data1Set);
        keysAll.addAll(data2Set);

        for (var key : keysAll) {
            if(!data1.containsKey(key) && data2.containsKey(key)) {
                diff.put(key, "added");
            }else if (data1.containsKey(key) && !data2.containsKey(key)) {
                diff.put(key, "deleted");
            } else if ( (data1.containsKey(key) && data2.containsKey(key) ) && ( !data1.get(key).equals(data2.get(key))) ) {
                diff.put(key, "changed");
            }else {
                diff.put(key, "unchanged");
            }
        }
        return diff;
    }
}
//END
