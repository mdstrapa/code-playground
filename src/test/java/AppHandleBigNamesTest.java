import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppHandleBigNamesTest {

    AppHandleBigNames app = new AppHandleBigNames();

    List<String> nameList = List.of("Janaína","Paulo","Jucelino","Ana","Patrícia","Henriqueta","José","Bafuncia","Esmeralda","Rosimeri");

    @Test
    void should_Return_Correct_Big_Names_Count() {
        int expectedResult = 7;
        int actualResult = app.countBigNames(nameList);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void should_Return_Correct_Big_Name_List() {
        List<String> bigNamesList = app.getBigNamesSorted(nameList);
        assertEquals("Bafuncia",bigNamesList.get(0));
        assertEquals("Rosimeri",bigNamesList.get(bigNamesList.size()-1));
    }
}