import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AppThreeTest {

    @Test
    void should_make_first_letters_captal_case_1() {
        String originalSSentence = "the airplane in flying over europe.";

        String expectedSentence = "The Airplane In Flying Over Europe.";

        String actualSentence = AppThreeMakeFirstLetterCapital.makeCapitalFirstLetters(originalSSentence);

        assertEquals(expectedSentence,actualSentence);
    }

    @Test
    void should_make_first_letters_captal_case_2() {
        String originalSSentence = "another city will be built in the desert.";

        String expectedSentence = "Another City Will Be Built In The Desert.";

        String actualSentence = AppThreeMakeFirstLetterCapital.makeCapitalFirstLetters(originalSSentence);

        assertEquals(expectedSentence,actualSentence);
    }
}