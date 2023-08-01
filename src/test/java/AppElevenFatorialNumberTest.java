import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppElevenFatorialNumberTest {

    @Test
    void shouldReturnCorrectValueForFatorialNumber() {
        Long expectedResult = 3628800L;
        Long actualResult = AppElevenFatorialNumber.fatorial(10L);
        assertEquals(expectedResult,actualResult);
    }
}