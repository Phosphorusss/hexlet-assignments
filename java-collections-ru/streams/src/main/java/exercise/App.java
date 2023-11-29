package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .map(email -> email.substring(email.lastIndexOf('@') + 1))
                .filter(email -> email.contains("gmail.com") || email.contains("yandex.ru")  || email.contains("hotmail.com"))
                .count();
    }
}

// END
