import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppHashMapLabTest {

    AppHashMapLab appHash = new AppHashMapLab();

    HashMap<Integer,String> countryList = new HashMap<>();

    @BeforeEach
    void setUp() {
        countryList.clear();
        countryList.put(1,"Brazil");
        countryList.put(2,"Italy");
        countryList.put(3,"Japan");
        countryList.put(4,"South Africa");
    }

    @Test
    void shouldAddNewItemToHash() {
        int originalHashSize = countryList.size();
        appHash.addItem(countryList,5,"Senegal");
        int newHashSize = countryList.size();
        assertEquals(originalHashSize + 1,newHashSize);
    }

    @Test
    void shouldRemoveItemFromHash() {
        int originalHashSize = countryList.size();
        appHash.removeItem(countryList,2);
        int newHashSize = countryList.size();
        assertEquals(originalHashSize - 1,newHashSize);
    }

    @Test
    void shouldFindCorrectValue(){
        String expectedValue = "South Africa";
        String actualValue = appHash.getValueFromHash(countryList,4);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void shouldReturnBiggestKey(){
        Integer expectedValue = 4;
        Integer actualValue = appHash.getBiggestKey(countryList);
        assertEquals(expectedValue,actualValue);
    }

}