import java.util.Scanner;

public class AppShowAscNumber {

    public static void main(String[] args) {
        System.out.println("Program Start =====================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type some text: ");

        String userInput = scanner.nextLine();

        for(char character:userInput.toCharArray()){
            int ascNumber = getAscNumber(character);
            System.out.println("The ASC II code for '" + character + "' is " + ascNumber);

        }

        System.out.println("Program End   =====================");
    }

    public static int getAscNumber(char character){
        return (int) character;
    }

}
