import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppNineFibonacciSequenceTest {

    @Test
    void shouldReturnCorrectNumberForPosition() {
        Long nineteenthNumber =  4181L;

        int position = 19;

        List<Long> fibonacciSequence = AppNineFibonacciSequence.createFibonacciSequence(position);

        assertEquals(nineteenthNumber,fibonacciSequence.get(position));
    }
}