import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppFormatStrings {

    enum FormatType {
        CPF,PHONE_NUMBER,CNPJ
    }

    public String formatValue(String value,FormatType formatType) throws InvalidInputValueException {

        String formattedValue = "";


        Pattern digitOnlyPattern = Pattern.compile("\\d+");
        Matcher digitOnlyMatcher = digitOnlyPattern.matcher(value);

        if(!digitOnlyMatcher.matches()) throw new InvalidInputValueException("Non-numeric characters are not allowed");

        if (formatType.equals(FormatType.CPF)){
            if(value.length()!=11) throw new InvalidInputValueException("CPF must be a 11-long numeric sequence");
            formattedValue = value.substring(0,3) + "." + value.substring(3,6) + "." + value.substring(6,9) + "-" + value.substring(9);
        } else if (formatType.equals(FormatType.CNPJ)){
            if(value.length()!=14) throw new InvalidInputValueException("CNPJ must be a 14-long numeric sequence");
            formattedValue = value.substring(0,2) + "." + value.substring(2,5) + "." + value.substring(5,8) + "/" + value.substring(8,12) + "-" + value.substring(12);
        } else if (formatType.equals(FormatType.PHONE_NUMBER)) {
            if(value.length()!=13) throw new InvalidInputValueException("Phone Number must be a 13-long numeric sequence");
            formattedValue = "+" + value.substring(0,2) + " (" + value.substring(2,4) + ") " + value.substring(4,9) + "-" + value.substring(9);
        }

        return formattedValue;
    }

}

class InvalidInputValueException extends Exception{
    public InvalidInputValueException(String message){
        super(message);
    }
}