package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        var str = content.split("\n");

        return Arrays.stream(str)
                .filter(s -> s.startsWith("environment"))
                .map(el ->el.replaceAll("environment=\"", ""))
                .map(el ->el.replaceAll("\"", ""))
                .map(el -> el.split(","))
                .flatMap(el -> Stream.of(el))
                .filter(el -> el.startsWith("X_FORWARDED_"))
                .map(el -> el.replaceAll("X_FORWARDED_", ""))//.toArray();
                .collect(Collectors.joining(","));
    }
}
//END
