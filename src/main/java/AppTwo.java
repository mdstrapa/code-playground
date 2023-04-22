//This example separates the vowels and consonants of a word.

public class AppTwo {
    public static void main(String[] args) {
        String word = "paralelepipedo";

        String vowels = word.replaceAll("(?i)[^aeiou]", "");
        String consonants = word.replaceAll("(?i)[\\saeiou]", "");

        System.out.println("Vogais: " + vowels);
        System.out.println("Consoantes: " + consonants);

    }
}
