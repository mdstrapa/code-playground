import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppFindGreatestOddNumberTest {

    AppFindGreatestOddNumber app = new AppFindGreatestOddNumber();

    @Test
    void shoouldFindGreatestOddNumber() {

        //given
        List<Integer> numberList = List.of(9,2,5,8,10,22,16,14);
        Integer expectedResult = 9;

        //when
        Integer actualResult = app.findGreatestOddNumber(numberList);

        //then
        assertEquals(expectedResult,actualResult);

    }
}