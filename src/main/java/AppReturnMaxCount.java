import java.util.Arrays;

public class AppReturnMaxCount {

    public int findMaxCountMethod1(int[] numArray){
        int posCount = 0;
        int negCount = 0;
        for(int num:numArray){
            if(num>0) posCount++;
            else if(num<0) negCount++;
        }
        return Math.max(posCount, negCount);
    }

    public int findMaxCountMethod2(int[] numArray){
        return Math.max((int) Arrays.stream(numArray).filter(n -> n > 0).count(),(int) Arrays.stream(numArray).filter(n -> n < 0).count());
    }

}