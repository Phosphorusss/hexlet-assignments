package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

// BEGIN
@AllArgsConstructor
@Getter
@ToString
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
