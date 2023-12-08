import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppFloatNumberTest {


    AppFloatNumber app = new AppFloatNumber();

    @Test
    void should_Return_Correct_Float_Sum() {

        float expectedResult = 0.3F;
        float actualResult = app.returnFloatSum(0.1F,0.2F);
        assertEquals(expectedResult,actualResult);

    }
}