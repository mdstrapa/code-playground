import java.util.HashMap;

public class AppHashMapLab {

    public void addItem(HashMap<Integer,String> myHash, Integer newKey, String newValue){
        myHash.put(newKey,newValue);
    }

    public void removeItem(HashMap<Integer,String> myHash, Integer keyToRemove){
        myHash.remove(keyToRemove);
    }

    public String getValueFromHash(HashMap<Integer,String> myHash,Integer keyToFind){
        return myHash.get(keyToFind);
    }

    public Integer getBiggestKey(HashMap<Integer,String> myHash){
        Integer biggestKey = 0;
        for(Integer key:myHash.keySet()){
            if(key > biggestKey)biggestKey =key;
        }
        return biggestKey;
    }

}
