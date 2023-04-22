//receiveis a sentence and make every first letter Capital

import java.util.ArrayList;
import java.util.List;

public class AppThree {

    public static void main(String[] args) {
        String originalSentence = "i will travel to the beach next summer.";

        System.out.println(makeCapitalFirstLetters(originalSentence));
    }


    public static String makeCapitalFirstLetters(String originalSentence){

        List<String> newWords = new ArrayList<>();

        String[] originalWords = originalSentence.split(" ");

        for (String word:originalWords){
            String captalWord = word.substring(0,1).toUpperCase() + word.substring(1);
            newWords.add(captalWord);
        }

        StringBuilder convertedSentence = new StringBuilder();

        for(String word:newWords){
            convertedSentence.append(" ").append(word);
        }

        return convertedSentence.toString().trim();
    }
}