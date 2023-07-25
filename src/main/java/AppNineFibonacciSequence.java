import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppNineFibonacciSequence {

    public static void main(String[] args) {
        System.out.println("Program start --------------------------");
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Type the size of the list you want: ");
        int listSize = userInput.nextInt();

        System.out.println();

        System.out.println("The Fibonacci Sequence until position " + listSize + " is:");
        createFibonacciSequence(listSize).forEach(number -> System.out.print(number + " | "));

        System.out.println();
        System.out.println();
        System.out.println("Program end   --------------------------");
    }

    public static List<Long> createFibonacciSequence(int untilPosition){
        List<Long> fibonacciSequence = new ArrayList<>();

        //fibonacci sequence calculation will start on the third possition
        //since each number is the sum of the two previous number in the list
        fibonacciSequence.add(0L);
        fibonacciSequence.add(1L);

        for(int pos = 2;pos<=untilPosition;pos++){
            fibonacciSequence.add(fibonacciSequence.get(pos - 1) + fibonacciSequence.get(pos - 2));
        }

        return fibonacciSequence;
    }


}
