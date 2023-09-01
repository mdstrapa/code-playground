import java.util.ArrayList;
import java.util.List;

public class AppTwelveBubbleSort {
    public static void main(String[] args) {
        System.out.println("Program start ==============================");

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(2);
        myList.add(1);
        myList.add(6);
        myList.add(7);
        myList.add(15);
        myList.add(11);
        myList.add(3);
        myList.add(8);

        bubbleSort(myList);

        System.out.println();
        System.out.println("The final list is:");
        showList(myList);
        System.out.println();
        System.out.println();

        System.out.println("Program end   ==============================");
    }

    public static void bubbleSort(List<Integer> integerList){
        boolean didSort = true;
        Integer tempValue;
        while (didSort){
            didSort = false;
            for(int index = 0;index < integerList.size() - 1;index++){
                if(integerList.get(index) > integerList.get(index + 1)) {
                    tempValue = integerList.get(index + 1);
                    integerList.set(index + 1,integerList.get(index));
                    integerList.set(index,tempValue);
                    showList(integerList);
                    didSort = true;
                }
            }
        }
    }

    private static void showList(List<Integer> integerList){
        integerList.forEach(AppTwelveBubbleSort::writeListNumber);
        System.out.println();
    }

    private static void writeListNumber(Integer number){
        System.out.println();
        System.out.print(number + " - ");
        for(int c = 0;c<number;c++){
            System.out.print("*");
        }
    }

}