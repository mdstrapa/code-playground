import java.io.InputStream;
import java.util.Scanner;

public class AppConvertTimeToSeconds {

    // based on a given input we have to calculate the number of seconds
    // input format: Ay Bm Cd Dh Es
    // y - year
    // m - month
    // d - day
    // h - hours
    // s - seconds

    // definitions:
    // - the input may not have all the time units
    // - for simplicity, months will have 30 days and years will have 365 day always

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        System.out.println(userInput);

    }

    boolean parseInput(String input){
        // split by space

        // check if the last char of every part is y,m,d,h or s

        // check if first chars of every part are numbers

        // if any rule fails throw the exception
        return true;
    }

}

class InvalidInputException extends Exception {
    public InvalidInputException(String message, Throwable cause) {
        super(message,cause);
    }
}
