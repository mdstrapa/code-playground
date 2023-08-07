import java.util.ArrayList;
import java.util.List;

public class AppFourteenInsertionSort {

    public static void main(String[] args) {
        System.out.println("Program start =====================");
        System.out.println("Program end   =====================");
    }


    public static List<Integer> insertionSort(List<Integer> unsortedList){
        List<Integer> sortedList = new ArrayList<>();
        boolean positionFound;
        int indexSortedList;
        int indexUnsortedList = 0;

        while (!unsortedList.isEmpty()){

            //get the element to sort
            Integer element = unsortedList.get(indexUnsortedList);
            positionFound = false;
            indexSortedList = 0;

            //find the correct position in the sorted list
            while (!positionFound){

                if(sortedList.isEmpty()) positionFound = true;

                else if(sortedList.size() == 1){
                    if(sortedList.get(0) > element) positionFound = true;
                    else if(sortedList.size() == indexSortedList) positionFound = true;
                }

                else if(sortedList.get(indexSortedList) < element && sortedList.get(indexSortedList + 1) > element) positionFound = true;

                indexSortedList++;
            }

            //we need to increase the position of all bigger elements in oder to have a 'free position' to place the new sorted element
            for(int i = sortedList.size() - 1;i > indexSortedList;i--){
                if(i == sortedList.size() - 1) sortedList.add(sortedList.get(i));
                else sortedList.set(i + 1,sortedList.get(i));
            }

            //insert the element in the position
            //if the elemte is the last we need to add insted set
            sortedList.set(indexSortedList, element);

            //remove the elemente from the original list
            unsortedList.remove(indexUnsortedList);

            //goes to the next unsortedElement
            indexUnsortedList++;

        }


        return sortedList;
    }

}