import java.util.Scanner;

public class AppSwitchesVariableValues {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Switches the values of two variables");
        System.out.println();

        System.out.print("Type the value of variable A:");
        int a = userInput.nextInt();

        System.out.print("Type the value of variable B:");
        int b = userInput.nextInt();

        System.out.println("The value of A is " + a + " | The value of B is " + b);

        int aux = b;
        b = a;
        a = aux;

        System.out.println("Switching values...");
        System.out.println("The value of A is " + a + " | The value of B is " + b);
    }
}
