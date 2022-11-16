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
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual1 = App.take(numbers1, 2);
        List<Integer> result1 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(actual1).isEqualTo(result1);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> actual2 = App.take(numbers2, 8);
        List<Integer> result2 = numbers2;
        assertThat(actual2).isEqualTo(result2);
        
        // END
    }
}
