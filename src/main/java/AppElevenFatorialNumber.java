import java.util.Scanner;

public class AppElevenFatorialNumber {

    public static void main(String[] args) {
        System.out.println("Program start ===========================");

        Scanner userInput = new Scanner(System.in);

        System.out.print("Type the fatorial number: ");

        Long fatorialNumber = userInput.nextLong();

        Long result = fatorial(fatorialNumber);

        System.out.println();
        System.out.println("The result is: " + result);
        System.out.println();
        System.out.println("Program end   ===========================");

    }

    public static Long fatorial(Long number){
        if(number == 1L) return 1L;
        return number * fatorial(number - 1);
    }

}
