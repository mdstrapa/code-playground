import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppFourteenInsertionSortTest {

    @Test
    void shouldReturnSortedList() {

        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(8);
        unsortedList.add(5);
        unsortedList.add(1);
        unsortedList.add(7);
        unsortedList.add(3);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(8);

        List<Integer> actualResult = AppFourteenInsertionSort.insertionSort(unsortedList);

        assertEquals(expectedResult.get(0),actualResult.get(0));
        assertEquals(expectedResult.get(2),actualResult.get(2));
        assertEquals(expectedResult.get(4),actualResult.get(4));

    }
}