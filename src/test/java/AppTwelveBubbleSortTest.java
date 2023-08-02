import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTwelveBubbleSortTest {

    @Test
    void shouldSortList() {

        List<Integer> originalList = new ArrayList<>();
        originalList.add(3);
        originalList.add(6);
        originalList.add(2);
        originalList.add(4);
        originalList.add(1);
        originalList.add(9);
        originalList.add(5);
        originalList.add(8);

        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(4);
        sortedList.add(5);
        sortedList.add(6);
        sortedList.add(8);
        sortedList.add(9);

        AppTwelveBubbleSort.bubbleSort(originalList);

        assertEquals(sortedList.get(0),originalList.get(0));
        assertEquals(sortedList.get(1),originalList.get(1));
        assertEquals(sortedList.get(2),originalList.get(2));
        assertEquals(sortedList.get(3),originalList.get(3));
        assertEquals(sortedList.get(4),originalList.get(4));
        assertEquals(sortedList.get(5),originalList.get(5));
        assertEquals(sortedList.get(6),originalList.get(6));

    }
}