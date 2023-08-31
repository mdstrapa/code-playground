import java.util.List;

public class AppFindGreatestOddNumber {

    public Integer findGreatestOddNumber(List<Integer> numberList){

        Integer greatestOddNumber = 0;

        for(Integer number:numberList){
            if(number % 2 != 0 && number > greatestOddNumber) greatestOddNumber = number;
        }

        return greatestOddNumber;
    }

}
