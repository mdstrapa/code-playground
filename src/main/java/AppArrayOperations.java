import java.util.Arrays;

public class AppArrayOperations {

    // sum all the elements of an array

    public int sumElements(int[] elements){
        return Arrays.stream(elements).sum();
    }

    // find the smallest integer in an array
    public int findSmallValue(int[] elements){
        int smallValue = elements[0];
        for(int element:elements){
            if(element < smallValue) smallValue = element;
        }
        return smallValue;
    }

    // compare two arrays
    public boolean compareArrays(int[] firstArray, int[] secondArray){
        return Arrays.equals(firstArray,secondArray);
    }

    // check if element is present in a given array
    public boolean checkElement(int[] elements, int element){
        return Arrays.stream(elements).anyMatch( e -> e == element);
    }
}
