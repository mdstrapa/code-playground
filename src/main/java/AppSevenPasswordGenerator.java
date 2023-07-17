import java.util.Random;

public class AppSevenPasswordGenerator {

    static char[] simbols = {'!','@','#','$','%','&','*'};
    static char[] upperLetters = {'A','B','C','D','E','F','G','H','I','J','L','M','N','O','P','Q','R','S','T','U','V','Y','Z'};
    static char[] lowerLetters = {'a','b','c','d','e','f','g','h','i','j','l','m','n','o','p','q','r','s','t','u','v','y','z'};

    public static void main(String[] args) {
        System.out.println("Password Generatos Begin --------------------------------------");

        System.out.println(passwordGenerator());

        System.out.println("Password Generatos End   --------------------------------------");
    }

    public static String passwordGenerator(){
        Random random = new Random();
        final int PASSOWORD_LENGHT = 8;
        int randomNumber;
        StringBuilder passwordBuild = new StringBuilder();

        for(int c = 0;c<PASSOWORD_LENGHT;c++){
            if(c==0 || c==4) {
                randomNumber = random.nextInt(7);
                passwordBuild.append(simbols[randomNumber]);
            }
            if(c==1 || c==5) {
                randomNumber = random.nextInt(23);
                passwordBuild.append(upperLetters[randomNumber]);
            }
            if(c==2 || c==6) {
                randomNumber = random.nextInt(23);
                passwordBuild.append(lowerLetters[randomNumber]);
            }
            if(c==3 || c==7) {
                randomNumber = random.nextInt(9);
                passwordBuild.append(randomNumber);
            }
        }

        return passwordBuild.toString();
    }

}