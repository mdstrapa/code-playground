import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppAdvancedCalculatorTest {

    AppAdvancedCalculator calculator = new AppAdvancedCalculator();

    @Test
    void should_Get_Correct_Average() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        double exepecteResult = 3.0;
        double actualResult = calculator.getAverage(numberList);
        assertEquals(exepecteResult, actualResult);
    }

    @Test
    void should_Get_Correct_Power() {

        // case 1
        int number = 3;
        int power = 3;
        int actualResult = calculator.getPower(number,power);
        int expectedResult = 27;
        assertEquals(expectedResult, actualResult);

        // case 2
        power = 1;
        actualResult = calculator.getPower(number,power);
        expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void should_Get_Correct_Square_Root() {
        double number = 49;
        double expectedResult = 7;
        double actualResult = calculator.getSquareRoot(number);
        assertEquals(expectedResult, actualResult);
    }
}