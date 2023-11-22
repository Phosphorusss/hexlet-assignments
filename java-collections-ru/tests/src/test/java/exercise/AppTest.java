package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        var actual1 = App.take(list, 2);
        var correct = new ArrayList<Integer>();
        correct.add(1);
        correct.add(2);

        assertThat(actual1).isEqualTo(correct);
        // END
    }
}
