package exercise.dto.users;

import exercise.model.User;
import java.util.List;
// BEGIN
public class UsersPage {
    private List<User> users;
    private String term;

    public UsersPage(List<User> users, String term) {
        this.users = users;
        this.term = term;
    }

    public UsersPage(List<User> users) {
        this.users = users;
    }

    public List<User> getUser() {
        return users;
    }

    public String getTerm() {
        return term;
    }
}
// END
