import java.awt.Toolkit;
import java.util.Scanner;

public class AppBeep {

    public static void main(String[] args) {
        System.out.println("Program Start ====================");
        Scanner userIput = new Scanner(System.in);
        System.out.print("Type how many beeps you want: ");
        int beepCount = userIput.nextInt();
        beep(beepCount);
        System.out.println("Program End   ====================");
    }

    static void beep(int beepCount){
        for(int c = 0;c<beepCount;c++){
            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}