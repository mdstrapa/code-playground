import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppSevenPasswordGeneratorTest {

    @Test
    void shouldReturnCorrectPasswordSize() {
        int expectedPasswordSize = 8;

        String password = AppSevenPasswordGenerator.passwordGenerator();

        assertEquals(expectedPasswordSize,password.length());
    }


    @Test
    void shouldHasSymbol() {
        int expectedPasswordSize = 8;

        String password = AppSevenPasswordGenerator.passwordGenerator();

        assertEquals(expectedPasswordSize,password.length());

        assertEquals(expectedPasswordSize,password.length());
    }
}