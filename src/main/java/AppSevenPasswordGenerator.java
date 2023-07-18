import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppSevenPasswordGenerator {

    static char[] simbols = {'!','@','#','$','%','&','*'};
    static char[] upperLetters = {'A','B','C','D','E','F','G','H','I','J','L','M','N','O','P','Q','R','S','T','U','V','Y','Z'};
    static char[] lowerLetters = {'a','b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','y','z'};
    static char[] digits = {'0','1','2','3','4','5','6','7','8','9'};

    public static void main(String[] args) {
        System.out.println("Password Generator Begin --------------------------------------");

        System.out.println(passwordGenerator());

        System.out.println("Password Generator End   --------------------------------------");
    }

    public static String passwordGenerator(){
        List<PasswordRule> pendingRuleList = new ArrayList<>();
        pendingRuleList.add(PasswordRule.SPECIAL_CHAR);
        pendingRuleList.add(PasswordRule.UPPER_LETTER);
        pendingRuleList.add(PasswordRule.LOWER_LETTER);
        pendingRuleList.add(PasswordRule.DIGIT);

        List<PasswordRule> doneRuleList = new ArrayList<>();

        Random random = new Random();
        final int PASSOWORD_LENGHT = 12;
        int randomNumber;
        int randomRule;
        StringBuilder passwordBuild = new StringBuilder();

        for(int c = 0;c<PASSOWORD_LENGHT;c++){

            if(pendingRuleList.size()>0) {
                randomRule = random.nextInt(pendingRuleList.size());
                if(pendingRuleList.get(randomRule)==PasswordRule.SPECIAL_CHAR){
                    randomNumber = random.nextInt(simbols.length);
                    passwordBuild.append(simbols[randomNumber]);
                } else if(pendingRuleList.get(randomRule)==PasswordRule.UPPER_LETTER) {
                    randomNumber = random.nextInt(upperLetters.length);
                    passwordBuild.append(upperLetters[randomNumber]);
                }else if(pendingRuleList.get(randomRule)==PasswordRule.LOWER_LETTER) {
                    randomNumber = random.nextInt(lowerLetters.length);
                    passwordBuild.append(lowerLetters[randomNumber]);
                } else {
                    randomNumber = random.nextInt(digits.length);
                    passwordBuild.append(digits[randomNumber]);
                }

                doneRuleList.add(pendingRuleList.get(randomRule));
                pendingRuleList.remove(randomRule);
            }
            else {
                randomRule = random.nextInt(doneRuleList.size());
                if(doneRuleList.get(randomRule)==PasswordRule.SPECIAL_CHAR){
                    randomNumber = random.nextInt(simbols.length);
                    passwordBuild.append(simbols[randomNumber]);
                } else if(doneRuleList.get(randomRule)==PasswordRule.UPPER_LETTER) {
                    randomNumber = random.nextInt(upperLetters.length);
                    passwordBuild.append(upperLetters[randomNumber]);
                }else if(doneRuleList.get(randomRule)==PasswordRule.LOWER_LETTER) {
                    randomNumber = random.nextInt(lowerLetters.length);
                    passwordBuild.append(lowerLetters[randomNumber]);
                } else {
                    randomNumber = random.nextInt(digits.length);
                    passwordBuild.append(digits[randomNumber]);
                }
            }

        }

        return passwordBuild.toString();
    }

}

enum PasswordRule{
    SPECIAL_CHAR,UPPER_LETTER,LOWER_LETTER,DIGIT
}