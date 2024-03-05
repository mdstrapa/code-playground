import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// this class was built using JetBrain's AI Assistant inside intelliJ
public class AppJetbrainsAiLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter some text: ");
        String userInput = scanner.nextLine();

        System.out.println("Vowel uppercase: " + convertVowelsToUpper(userInput));
        System.out.println("Reverse string: " + reverseString(userInput));
        System.out.println("Password generated: " + generatePassword());

        scanner.close();
    }


    public static String convertVowelsToUpper(String input) {
        if(input == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(input);
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }


    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }

        return new StringBuilder(input).reverse().toString();
    }

    private static final SecureRandom random = new SecureRandom();

    public static char randomChar(String characters) {
        return characters.charAt(random.nextInt(characters.length()));
    }

    public static String generatePassword() {
        String uppercaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()?~<>";

        List<Character> password = new LinkedList<>();

        password.add(randomChar(uppercaseAlphabet));
        password.add(randomChar(digits));

        for (int i = 2; i < 8; i++) {
            String options = uppercaseAlphabet + lowercaseAlphabet + digits + specialChars;
            password.add(randomChar(options));
        }

        Collections.shuffle(password);
        return password.stream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }




}