import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppHighestNumberTest {

    AppHighestNumber appHighestNumber = new AppHighestNumber();
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    @Test
    void shouldReturnFalse() {
        int number = 6;
        assertFalse(appHighestNumber.isHighest(numbers,number));
    }

    @Test
    void shouldReturnTrue() {
        int number = 12;
        assertTrue(appHighestNumber.isHighest(numbers,number));
    }
}