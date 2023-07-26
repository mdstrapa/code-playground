//turn only the consoants into Capitals

public class AppFourTurnConsoantsIntoCapital {
    public static void main(String[] args) {

    }

    public static String turnConsoantsIntoCapital(String originalString){
        StringBuilder convertedString = new StringBuilder();
        for(char letter:originalString.toCharArray()){
            if(isConsoant(letter)) convertedString.append(String.valueOf(letter).toUpperCase());
            else convertedString.append(letter);
        }
        return convertedString.toString();
    }

    public static Boolean isConsoant(char theChar){
        if(theChar == 'a') return Boolean.FALSE;
        if(theChar == 'e') return Boolean.FALSE;
        if(theChar == 'i') return Boolean.FALSE;
        if(theChar == 'o') return Boolean.FALSE;
        if(theChar == 'u') return Boolean.FALSE;
        return Boolean.TRUE;
    }
}