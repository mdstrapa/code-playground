// gets a full name and returns the first letters of each word


public class AppFive {

    public static void main(String[] args) {

    }

    public String returnsFirtsLetters(String originalName){
        String[] words = originalName.split(" ");
        String finalResult = "";
        for(String word:words){
            finalResult = finalResult + word.substring(0,1);
        }
        return finalResult;
    }

}
