import org.json.*;
import java.util.ArrayList;
import java.util.List;

public class AppJsonExplorer {

    public static void main(String[] args) {
        System.out.println("Program Start =====================");
        JSONObject person = createJson();
        String personName =  String.valueOf(getKeyValue(person,"name"));
        String personName2 =  (String)(getKeyValue(person,"name"));
        System.out.println("The person name is: " + personName);
        System.out.println("The person name is: " + personName2);
        System.out.println("Program End   =====================");
    }

    static JSONObject createJson(){

        JSONObject person = new JSONObject();

        person.put("id",156845);
        person.put("name","Marcos Daniel Strapazon");
        person.put("age",28);

        JSONObject city = new JSONObject();
        city.put("id",1);
        city.put("name","Porto Alegre");
        city.put("state","RS");

        person.put("city",city);

        person.append("motherName","Maria de Lurdes Bigolin");
        person.append("fatherName","Nilton Strapazon");

        List<Integer> subscriptionList = new ArrayList<>();
        subscriptionList.add(8835);
        subscriptionList.add(124423);
        subscriptionList.add(379);
        subscriptionList.add(975);

        person.put("subscriptionList",subscriptionList);

        return person;

    }

    static Object getKeyValue(JSONObject json, String key){
        return json.get(key);
    }

}
