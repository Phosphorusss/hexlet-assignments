package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List result = new ArrayList();
        result.addAll(books);

        for (Map.Entry<String, String> condition : where.entrySet()) {
            var value = condition.getValue();
            for (Map<String, String> book : books) {
                if (!book.containsValue(value)) {
                    result.remove(book);
                }
            }
        }
        return result;
    }

}
//END
