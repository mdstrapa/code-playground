import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppConvertTimeToSecondsTest {

    @Test
    void shouldReturnTrueForValidInput() throws InvalidInputException {

        String validInput1 = "2y 1m 3d 4h 45s";
        String validInput2 = "6d 10h 43s";

        boolean parseResult1 = AppConvertTimeToSeconds.parseInput(validInput1);
        boolean parseResult2 = AppConvertTimeToSeconds.parseInput(validInput2);

        assertTrue(parseResult1);
        assertTrue(parseResult2);
    }


    @Test
    void shouldThrownExceptionForInvalidInput(){
        InvalidInputException thrown = assertThrows(InvalidInputException.class, () -> {
            String invalidInput = "AAy 1m 3d 4h 45s";
            AppConvertTimeToSeconds.parseInput(invalidInput);
        });

        assertEquals("Input provided is invalid",thrown.getMessage());
    }

    @Test
    void shouldReturnCorrectElementUnit(){
        String element = "45m";
        char expectedUnit = 'm';
        char actualUnit = AppConvertTimeToSeconds.getElementUnit(element);
        assertEquals(expectedUnit,actualUnit);
    }

    @Test
    void shouldReturnCorrectElementValue(){
        String element = "143h";
        String expectedResult = "143";
        String actualResult = AppConvertTimeToSeconds.getElementValue(element);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectNumberOfSeconds(){
        String userInput = "5h 10s";
        Long expectedResult = 18010L;
        Long actualResult = AppConvertTimeToSeconds.calculateNumberOfSeconds(userInput);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectNumberOfSecondsForGivenElement(){
        Integer value = 5;
        char unit = 'h';
        Long expectedResult = 18000L;
        Long actualResult = AppConvertTimeToSeconds.calculateElement(value,unit);
        assertEquals(expectedResult,actualResult);

        value = 3;
        unit = 'd';
        expectedResult = 259200L;
        actualResult = AppConvertTimeToSeconds.calculateElement(value,unit);
        assertEquals(expectedResult,actualResult);

        value = 45;
        unit = 's';
        expectedResult = 45L;
        actualResult = AppConvertTimeToSeconds.calculateElement(value,unit);
        assertEquals(expectedResult,actualResult);

        value = 1;
        unit = 'm';
        expectedResult = 2592000L;
        actualResult = AppConvertTimeToSeconds.calculateElement(value,unit);
        assertEquals(expectedResult,actualResult);

    }

}