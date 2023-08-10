import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppFifteenJavaSortTest {

    AppFifteenJavaSort javaSort = new AppFifteenJavaSort();

    @Test
    void shouldSortNameCorrectly() {

        List<String> originalNames = new ArrayList<>();
        originalNames.add("Felipe");
        originalNames.add("Adriano");
        originalNames.add("Zulmiro");
        originalNames.add("Daniel");
        originalNames.add("Heitor");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Adriano");
        expectedResult.add("Daniel");
        expectedResult.add("Felipe");
        expectedResult.add("Heitor");
        expectedResult.add("Zulmiro");

        List<String> actualResult = javaSort.sortNames(originalNames);

        assertEquals(expectedResult.get(0),actualResult.get(0));
        assertEquals(expectedResult.get(2),actualResult.get(2));
        assertEquals(expectedResult.get(4),actualResult.get(4));
    }

    @Test
    void shouldSortNumbersCorrectly(){
        List<Integer> originalList = new ArrayList<>();
        originalList.add(8);
        originalList.add(3);
        originalList.add(1);
        originalList.add(19);
        originalList.add(0);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(8);
        expectedResult.add(19);

        List<Integer> actualResult = javaSort.sortNumbers(originalList);

        assertEquals(expectedResult.get(0),actualResult.get(0));
        assertEquals(expectedResult.get(2),actualResult.get(2));
        assertEquals(expectedResult.get(4),actualResult.get(4));
    }

    @Test
    void shouldSortPersonCorrectly(){
        List<Person> originalList = new ArrayList<>();
        originalList.add(new Person(7,"Rodrigo"));
        originalList.add(new Person(2,"Álvaro"));
        originalList.add(new Person(8,"Marcelo"));
        originalList.add(new Person(10,"Paulo"));
        originalList.add(new Person(1,"Luciano"));

        List<Person> expectedResult = new ArrayList<>();
        expectedResult.add(new Person(1,"Luciano"));
        expectedResult.add(new Person(2,"Álvaro"));
        expectedResult.add(new Person(7,"Rodrigo"));
        expectedResult.add(new Person(8,"Marcelo"));
        expectedResult.add(new Person(10,"Paulo"));

        List<Person> actualResult = javaSort.sortPerson(originalList);

        assertEquals(expectedResult.get(0).getName(),actualResult.get(0).getName());
        assertEquals(expectedResult.get(2).getName(),actualResult.get(2).getName());
        assertEquals(expectedResult.get(4).getName(),actualResult.get(4).getName());

    }

}