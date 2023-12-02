import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppReturnMaxCountTest {

    AppReturnMaxCount app = new AppReturnMaxCount();

    int[] numArray = {-3,-9,0,0,9,18,35,-87,4,5,2,0,8,0,6,0,-21,-32,-1};
    int expectedResult = 8;

    @Test
    void findMaxCountMethod1() {
        int actualResult = app.findMaxCountMethod1(numArray);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void findMaxCountMethod2() {
        int actualResult = app.findMaxCountMethod2(numArray);
        assertEquals(expectedResult,actualResult);
    }
}