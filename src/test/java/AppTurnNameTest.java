import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTurnNameTest {

    AppTurnName appTurnName = new AppTurnName();

    @Test
    void should_Turn_Name_Into_NewName() {
        String originalName = "Fabiele";
        String expectedName = "Phabyelleh";
        String actualName = appTurnName.turnName(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "Edivaldo";
        expectedName = "Edywalldoh";
        actualName = appTurnName.turnName(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "Carolina";
        expectedName = "Karollynah";
        actualName = appTurnName.turnName(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);
    }
}