//This example separates the vowels and consonants of a word.

public class AppTwoSepareteVowelsAndConsoants {
    public static void main(String[] args) {
        String word = "paralelepipedo";

        String vowels = getVowels(word);
        String consonants = getConsonants(word);

        System.out.println("Vogais: " + vowels);
        System.out.println("Consoantes: " + consonants);

    }


    public static String getVowels(String theString){
        return theString.replaceAll("(?i)[^aeiouí]", "");
    }

    public static String getConsonants(String theString){
        return theString.replaceAll("(?i)[\\saeiouí]", "");
    }

}
