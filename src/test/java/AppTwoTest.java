import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTwoTest {

    @Test
    void getVowels() {
        String originalString = "Paraleleípedo";

        String expectedResult = "aaeeíeo";

        String actualResult = AppTwo.getVowels(originalString);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void getConsonants() {
        String originalString = "Paraleleípedo";

        String expectedResult = "Prllpd";

        String actualResult = AppTwo.getConsonants(originalString);

        assertEquals(expectedResult,actualResult);
    }
}