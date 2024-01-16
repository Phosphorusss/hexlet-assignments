package exercise;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;

// BEGIN
class Tag {
    private String name;
    private Map<String, String> attributes;

    Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String stringifyAttributes() {
        Set<Map.Entry<String, String>> setAttributes = attributes.entrySet();

        StringBuilder stringAttributes = new StringBuilder();
        setAttributes.forEach(item -> {
            stringAttributes.append(" ");
            stringAttributes.append(item.getKey());
            stringAttributes.append("=\"");
            stringAttributes.append(item.getValue());
            stringAttributes.append("\"");
        });
        return stringAttributes.toString();
    }

    public String getName() {
        return name;
    }
}
// END
