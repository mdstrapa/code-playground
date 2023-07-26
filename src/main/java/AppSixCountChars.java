//this example counts the amount of every char present in a given string

import java.util.Scanner;

public class AppSixCountChars {

    public static void main(String[] args) {
        System.out.println("Program begins ==================");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Type the word to analyse: ");
        String userInputConverted = userInput.nextLine();
        char[] charList = new char[userInputConverted.length()];

        for(int c=0;c < userInputConverted.length();c++){
            if(!isCharPresent(charList,userInputConverted.charAt(c)))  charList[c] = userInputConverted.charAt(c);
        }

        System.out.println("The char count is:");
        for (char value : charList) {
            int charCount = countChar(userInputConverted,value);
            if(charCount > 0)  System.out.println(" " + value + ": " + charCount);
        }
        System.out.println();
        System.out.println("Program ends   ==================");
    }


    public static int countChar(String originalString, char charToCount){
        int totalCharCount = 0;

        for(int c=0;c<originalString.length();c++){
            if(originalString.charAt(c)==charToCount) totalCharCount++;
        }
        return totalCharCount;
    }


    public static boolean isCharPresent(char[] charArray, char charToFind){
        for (char value : charArray) {
            if (value == charToFind) return true;
        }
        return false;
    }
}
