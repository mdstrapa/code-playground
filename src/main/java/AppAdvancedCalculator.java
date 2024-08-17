import java.util.List;

public class AppAdvancedCalculator {


    public float getAverage(List<Integer> numberList){
        Integer totalSum = 0;
        for(Integer number : numberList){
            totalSum += number;
        }
        return (float) totalSum / numberList.size();
    }

    public int getPower(int number,int power){
        int totalPower = number;
        for(int count = 0; count < power - 1; count++){
            totalPower = totalPower * number;
        }
        return totalPower;
    }

    public double getSquareRoot(double number){
        return Math.sqrt(number);
    }

}
