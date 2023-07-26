import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTwoTest {

    @Test
    void getVowels() {
        String originalString = "Paraleleípedo";

        String expectedResult = "aaeeíeo";

        String actualResult = AppTwoSepareteVowelsAndConsoants.getVowels(originalString);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void getConsonants() {
        String originalString = "Paraleleípedo";

        String expectedResult = "Prllpd";

        String actualResult = AppTwoSepareteVowelsAndConsoants.getConsonants(originalString);

        assertEquals(expectedResult,actualResult);
    }
}