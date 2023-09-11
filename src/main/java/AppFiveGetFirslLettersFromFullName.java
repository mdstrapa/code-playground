// gets a full name and returns the first letters of each word


public class AppFiveGetFirslLettersFromFullName {

    public static void main(String[] args) {

    }

    public String returnsFirtsLetters(String originalName) throws WrongParameter {
        if(originalName.matches("^[0-9]+$")) throw new WrongParameter();
        String[] words = originalName.split(" ");
        String finalResult = "";
        for(String word:words){
            finalResult = finalResult + word.substring(0,1);
        }
        return finalResult;
    }

}


class WrongParameter extends Exception{
    public WrongParameter(){
        super("Wrong parameters");
    }
}
