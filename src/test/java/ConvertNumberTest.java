import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberTest {


    ConvertNumber app = new ConvertNumber();

    @Test
    void shouldConvertCorrectlyOne() {
        int originalNumber = 2;
        String expectedResult = "10";
        String actualResult = app.decimalToBinary(originalNumber);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldConvertCorrectlyTwo() {
        int originalNumber = 7;
        String expectedResult = "111";
        String actualResult = app.decimalToBinary(originalNumber);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldConvertCorrectlyThree() {
        int originalNumber = 1598;
        String expectedResult = "11000111110";
        String actualResult = app.decimalToBinary(originalNumber);
        assertEquals(expectedResult,actualResult);
    }
}