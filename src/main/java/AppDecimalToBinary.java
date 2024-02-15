import java.util.Scanner;

public class AppDecimalToBinary {

    public static void main(String[] args) {
        System.out.println("Convert your Decimal into a Binary");
        System.out.println();
        System.out.print("Type a decimal number: ");

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        ConvertNumber convertNumber = new ConvertNumber();
        String binary = convertNumber.decimalToBinary(userInput);

        System.out.println("Original number: " + userInput);
        System.out.println("Binary version: " + binary);
    }
}


class ConvertNumber{

    public String decimalToBinary(Integer originalNumber){
        // i wasn't able to write my own version of Integer.toBinaryString :(
        return Integer.toBinaryString(originalNumber);
    }

}