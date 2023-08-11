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
        int position;

        while (!unsortedList.isEmpty()){

            //get the element to sort
            Integer element = unsortedList.get(0);
            positionFound = false;
            position = 0;

            //find the correct position in the sorted list
            while (!positionFound){

                if(sortedList.size() == position) positionFound = true;
                else{
                    if(sortedList.get(position) > element) positionFound = true;
                    else position++;
                }
            }

            //if sorted list is empty all we have to do is to add the very first element to the sorted list
            if(sortedList.isEmpty()) sortedList.add(element);
            else {
                //we need to increase the position of all bigger elements in oder to have a 'free position' to place the new sorted element
                for(int i = sortedList.size() - 1;i >= position;i--){
                    if(i == sortedList.size() - 1) sortedList.add(sortedList.get(i));
                    else sortedList.set(i + 1,sortedList.get(i));
                }

                //insert the element in the position
                //if the elemte is the last we need to add insted set
                if(sortedList.size()==position) sortedList.add(element);
                else sortedList.set(position, element);
            }

            //remove the elemente from the original list
            unsortedList.remove(0);

        }

        return sortedList;
    }

}