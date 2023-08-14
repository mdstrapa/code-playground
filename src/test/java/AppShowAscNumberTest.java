import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppShowAscNumberTest {

    @Test
    void shouldReturnCorrectAscNumber() {
        char theCharacter = 'a';

        int expectResult =  97;

        int actualResult = AppShowAscNumber.getAscNumber(theCharacter);

        assertEquals(expectResult,actualResult);

    }
}