import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        System.out.print("Type the formula: ");

        String userInput = input.nextLine();

        try{
            if(parseInput(userInput)){
                Long numberOfSeconds = calculateNumberOfSeconds(userInput);
                System.out.println("The number of seconds for the given input is " + numberOfSeconds);
            }
        }catch (InvalidInputException e){
            System.out.println("An error has occurred: " + e.getMessage());
        }

    }

    static boolean parseInput(String input) throws InvalidInputException {
        // split by space
        String[] inputElements = input.split(" ");

        List<String> validUnitList = Arrays.asList("y","m","d","h","s");

        for (String inputElement : inputElements) {
            // check if the last char of every part is y,m,d,h or s
            char elementUnit = getElementUnit(inputElement);
            if (!validUnitList.contains(String.valueOf(elementUnit))) throw new InvalidInputException();

            // check if first chars of every part are numbers
            String elementValue = getElementValue(inputElement);
            if (!elementValue.matches("^[0-9]*$")) throw new InvalidInputException();
        }

        // if no rule has failed then we return true
        return true;
    }

    static Long calculateNumberOfSeconds(String input){
        String[] inputElements = input.split(" ");
        long numberOfSeconds = 0L;

        for (String inputElement : inputElements) {
            // get the element's unit
            char unit = getElementUnit(inputElement);

            String elementValue = getElementValue(inputElement);
            Integer value = Integer.parseInt(elementValue);

            numberOfSeconds = numberOfSeconds + calculateElement(value,unit);

        }

        return numberOfSeconds;
    }

    static char getElementUnit(String element){
        return element.charAt(element.length() - 1);
    }

    static String getElementValue(String element){
        return element.substring(0, element.length() - 1);
    }

    static Long calculateElement(Integer value, char unit){

        Integer numberOfHours = 0;
        switch (unit){
            case 's' : return (long) value;
            case 'h' : numberOfHours = value;
            break;
            case 'd' : numberOfHours = value * 24;
            break;
            case 'm' : numberOfHours = value * 30 * 24;
            break;
            case 'y' : numberOfHours = value * 365 * 24;
        }

        // convert to minutes and then to seconds
        return (long) numberOfHours * 60 * 60;
    }

}

class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("Input provided is invalid");
    }
}
