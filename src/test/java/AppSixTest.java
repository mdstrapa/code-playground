import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppSixTest {


    AppSixCountChars appSix = new AppSixCountChars();

    @Test
    void shouldReturnCorrectCharCount() {
        String originalValue = "This is some example";
        char charToCount = 'e';
        int expectedResult = 3;
        int actualResult = appSix.countChar(originalValue,charToCount);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnZeroForNoChar() {
        String originalValue = "This is some example";
        char charToCount = '0';
        int expectedResult = 0;
        int actualResult = appSix.countChar(originalValue,charToCount);

        assertEquals(expectedResult,actualResult);
    }


    @Test
    void shouldReturnTrueWhenFindChar(){
        char[] charArray = new char[5];
        charArray[0] = 'b';
        charArray[1] = 'y';
        charArray[2] = 'n';
        charArray[3] = 'o';
        charArray[4] = 'p';

        boolean result = appSix.isCharPresent(charArray,'o');
        assertTrue(result);
    }


    @Test
    void shouldReturnFalseWhenDontFindChar(){
        char[] charArray = new char[5];
        charArray[0] = 'b';
        charArray[1] = 'y';
        charArray[2] = 'n';
        charArray[3] = 'o';
        charArray[4] = 'p';

        boolean result = appSix.isCharPresent(charArray,'r');
        assertFalse(result);
    }
}