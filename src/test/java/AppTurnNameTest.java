import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTurnNameTest {

    AppTurnName appTurnName = new AppTurnName();

    @Test
    void should_Turn_Name_Into_NewName() {
        String originalName = "Fabiele";
        String expectedName = "phabyehlleh";
        String actualName = appTurnName.turnName(originalName);
        assertEquals(expectedName, actualName);

        originalName = "Edivaldo";
        expectedName = "ehdywalldoh";
        actualName = appTurnName.turnName(originalName);
        assertEquals(expectedName, actualName);

        originalName = "Carolina";
        expectedName = "karohllyna";
        actualName = appTurnName.turnName(originalName);
        assertEquals(expectedName, actualName);
    }
}