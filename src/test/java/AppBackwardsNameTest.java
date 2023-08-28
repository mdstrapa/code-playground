import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppBackwardsNameTest {

    AppBackwardsName appBackwardsName = new AppBackwardsName();

    @Test
    void shouldReturnCorrectBackwardName() {
        String originalName = "Marcos Daniel Strapazon";
        String expectedResult = "Nozaparts Leinad Socram";

        String actualResult = appBackwardsName.backwardName(originalName);

        assertEquals(expectedResult,actualResult);

    }
}