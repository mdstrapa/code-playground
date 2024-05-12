import java.util.Arrays;

public class AppHighestNumber {

    public boolean isHighest(int[] collection, int num) {

        for (int n : collection) {
            if (n > num) return false;
        }

        return true;
    }

}
