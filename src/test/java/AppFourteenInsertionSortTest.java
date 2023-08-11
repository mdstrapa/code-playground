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
        unsortedList.add(9);
        unsortedList.add(11);
        unsortedList.add(2);
        unsortedList.add(20);
        unsortedList.add(6);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(6);
        expectedResult.add(7);
        expectedResult.add(8);
        expectedResult.add(9);
        expectedResult.add(11);
        expectedResult.add(20);

        List<Integer> actualResult = AppFourteenInsertionSort.insertionSort(unsortedList);

        assertEquals(expectedResult.get(0),actualResult.get(0));
        assertEquals(expectedResult.get(2),actualResult.get(2));
        assertEquals(expectedResult.get(4),actualResult.get(4));
        assertEquals(expectedResult.get(6),actualResult.get(6));
        assertEquals(expectedResult.get(8),actualResult.get(8));
        assertEquals(expectedResult.get(9),actualResult.get(9));

    }
}