import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppArrayOperationsTest {

    AppArrayOperations app = new AppArrayOperations();

    @Test
    void shouldReturnCorrectSumValue() {
        int[] elements = {1,6,3,8,4,9};
        int expectedResult = 31;
        int actualResult = app.sumElements(elements);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldFindTheCorrectSmallValue() {
        int[] elements = {1,6,3,8,4,9};
        int expectedResult = 1;
        int actualResult = app.findSmallValue(elements);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnTrueForEqualsArrays() {
        int[] arrayOne = {7,4,8,7,8,9};
        int[] arrayTwo = {7,4,8,7,8,9};
        assertTrue(app.compareArrays(arrayOne,arrayTwo));
    }

    @Test
    void shouldReturnFalseForDifferentArrays(){
        int[] arrayOne = {7,4,8,7,8,9};
        int[] arrayTwo = {7,4,8,6,9,33,4};
        assertFalse(app.compareArrays(arrayOne,arrayTwo));
    }

    @Test
    void shouldReturnTrueForExistentElement() {
        int[] elements = {7,4,8,6,9,33,4};
        int elementToFind = 33;
        assertTrue(app.checkElement(elements,elementToFind));
    }

    @Test
    void shouldReturnFalseForNonExistentElement(){
        int[] elements = {7,4,8,6,9,33,4};
        int elementToFind = 45;
        assertFalse(app.checkElement(elements,elementToFind));
    }
}