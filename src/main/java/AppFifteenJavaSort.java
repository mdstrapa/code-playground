import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppFifteenJavaSort {

    public List<String> sortNames(List<String> originalNames){
        Collections.sort(originalNames);
        return originalNames;
    }

    public List<Integer> sortNumbers(List<Integer> originalNumbers){
        Collections.sort(originalNumbers);
        return originalNumbers;
    }

    public List<Person> sortPerson(List<Person> originalList){
        originalList.sort(new SortPerson());
        return originalList;
    }

}

class SortPerson implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId() - o2.getId();
    }
}


class Person {
    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}