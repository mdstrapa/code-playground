import java.util.Scanner;

public class AppExceptionPartTwo {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter two number to make a division:");
        System.out.print("Number A: ");
        int numberA = userInput.nextInt();
        System.out.print("Number B: ");
        int numberB = userInput.nextInt();

        try{
            int result = division(numberA,numberB);

            System.out.println("The result is " + result);
        }catch (WrongParameterException e){
            System.out.println(e.getMessage() + " - Cause: " + e.getCause().getMessage());
        }catch (Exception e){
            System.out.println("A generic error has occurred: " + e.getMessage());
        }

    }

    public static int division(int a, int b) throws WrongParameterException{
        if (b==0) throw new WrongParameterException("Wrong Parameter Exception", new ArithmeticException("division by zero"));
        return a / b;
    }

}

class WrongParameterException extends Exception{
    public WrongParameterException(String message, Throwable cause) {
        super(message,cause);
    }
}
