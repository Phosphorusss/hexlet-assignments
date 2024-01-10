package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
public static List<String> buildApartmentsList(List<Home> homeList, int countReturn) {

    return homeList.stream()
            .sorted(Home::compareTo)
            .limit(countReturn)
            .map(Home::toString)
            .collect(Collectors.toList());
}
}
// END
