import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppFiveTest {

    AppFiveGetFirslLettersFromFullName appFive = new AppFiveGetFirslLettersFromFullName();

    @Test
    void should_return_correct_first_letters() {
        String originalName = "Fabiele Avila Cidade";
        String expectedResult = "FAC";
        String actualResutl = appFive.returnsFirtsLetters(originalName);
        assertEquals(expectedResult,actualResutl);


        originalName = "Daniele Fraga";
        expectedResult = "DF";
        actualResutl = appFive.returnsFirtsLetters(originalName);
        assertEquals(expectedResult,actualResutl);
    }
}