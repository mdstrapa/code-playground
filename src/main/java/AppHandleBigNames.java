import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppHandleBigNames {

    private final int BIG_NAME_SIZE = 6;

    public int countBigNames(List<String> nameList){
        return (int) nameList.stream().filter(n -> n.length() > BIG_NAME_SIZE).count();
    }

    public List<String> getBigNamesSorted(List<String> originalNameList){
        return originalNameList.stream().filter(n -> n.length() > BIG_NAME_SIZE).sorted().collect(Collectors.toList());
    }

}
