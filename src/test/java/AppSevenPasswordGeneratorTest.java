import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class AppSevenPasswordGeneratorTest {

    @Test
    void shouldReturnCorrectPasswordSize() {
        int expectedPasswordSize = 12;
        String password = AppSevenPasswordGenerator.passwordGenerator();
        assertEquals(expectedPasswordSize,password.length());
    }

    @Test
    void shouldReturnTrueIfHasSpecialChar() {
        Pattern specialChar = Pattern.compile ("[!@#$%&*]");
        String password = AppSevenPasswordGenerator.passwordGenerator();
        Matcher hasSpecialChar = specialChar.matcher(password);
        assertTrue(hasSpecialChar.find());
    }

    @Test
    void shouldReturnTrueIfHasUpperLetter() {
        Pattern specialChar = Pattern.compile ("[A-Z]");
        String password = AppSevenPasswordGenerator.passwordGenerator();
        Matcher hasSpecialChar = specialChar.matcher(password);
        assertTrue(hasSpecialChar.find());
    }

    @Test
    void shouldReturnTrueIfHasLowerLetter() {
        Pattern specialChar = Pattern.compile ("[a-z]");
        String password = AppSevenPasswordGenerator.passwordGenerator();
        Matcher hasSpecialChar = specialChar.matcher(password);
        assertTrue(hasSpecialChar.find());
    }

    @Test
    void shouldReturnTrueIfHasDigit() {
        Pattern specialChar = Pattern.compile ("[0-9]");
        String password = AppSevenPasswordGenerator.passwordGenerator();
        Matcher hasSpecialChar = specialChar.matcher(password);
        assertTrue(hasSpecialChar.find());
    }

}