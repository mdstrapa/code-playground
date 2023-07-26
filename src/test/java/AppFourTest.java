import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppFourTest {

    @Test
    void should_convert_consoants_to_capial() {
        String originalString = "shooting";
        String expectedResult = "SHooTiNG";
        String actualResult = AppFourTurnConsoantsIntoCapital.turnConsoantsIntoCapital(originalString);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void should_return_true_consoant() {
        char originalConsoant = 'c';
        Boolean isConsoant = AppFourTurnConsoantsIntoCapital.isConsoant(originalConsoant);
        assertTrue(isConsoant);
    }

    @Test
    void should_return_false_consoant() {
        char originalConsoant = 'e';
        Boolean isConsoant = AppFourTurnConsoantsIntoCapital.isConsoant(originalConsoant);
        assertFalse(isConsoant);
    }
}