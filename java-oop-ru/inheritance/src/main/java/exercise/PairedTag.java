package exercise;

import javax.swing.event.ListDataEvent;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    PairedTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    public String stringifyAttributesList() {
        StringBuilder result = new StringBuilder();
        for (var elements : children) {
            result.append(elements.toString());
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "<" + getName() + stringifyAttributes() + ">" + body + stringifyAttributesList() + "</" + getName() + ">";
    }
}
// END
