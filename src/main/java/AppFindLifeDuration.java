import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AppFindLifeDuration {

    public static void main(String[] args) throws InvalidFormatException {
        System.out.println("Marcosoft Life Duration Calculator");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String userName = input.nextLine();
        System.out.print("Type your birth date (dd/mm/yyyy): ");
        String userBirthDate = input.nextLine();
        System.out.print("Type your birth time (hh:mm): ");
        String userBirthTime = input.nextLine();

        LocalDate birthDate = DateConverterHelper.getDateFromString(userBirthDate);
        LocalTime birthTime = DateConverterHelper.getTimeFromString(userBirthTime);

        LocalDateTime birth = LocalDateTime.of(birthDate,birthTime);

        TimeCalculator timeCalculator = new TimeCalculator();
        // get years count
        long userLivedYears = timeCalculator.getDuration(birth,ChronoUnit.YEARS);
        // get months count
        long userLivedMonths = timeCalculator.getDuration(birth,ChronoUnit.MONTHS);
        // get days count
        long userLivedDays = timeCalculator.getDuration(birth,ChronoUnit.DAYS);
        // get hours count
        long userLivedHours = timeCalculator.getDuration(birth,ChronoUnit.HOURS);
        // get seconds count
        long userLivedSeconds = timeCalculator.getDuration(birth,ChronoUnit.SECONDS);

        System.out.println();
        System.out.println("Hello " + userName + "! This is how much time you have lived so far:");
        System.out.println("Years count: " + FormatNumberHelper.format(userLivedYears));
        System.out.println("Month count: " + FormatNumberHelper.format(userLivedMonths));
        System.out.println("Days count: " + FormatNumberHelper.format(userLivedDays));
        System.out.println("Hours count: " + FormatNumberHelper.format(userLivedHours));
        System.out.println("Seconds count: " + FormatNumberHelper.format(userLivedSeconds));

    }

}

class TimeCalculator{
    long getDuration(LocalDateTime beginning, ChronoUnit unit){
        return unit.between(beginning,LocalDateTime.now());
    }
}

class FormatNumberHelper{
    static String format(long number){

        StringBuilder convertedNumber = new StringBuilder(String.valueOf(number));

        for(int c = convertedNumber.length() - 3;c > 0;c = c - 3){
            convertedNumber.insert(c, '.');
        }

        return  convertedNumber.toString();
    }
}

class DateConverterHelper{
    static LocalDate getDateFromString(String originalDate) throws InvalidFormatException{
        String[] dateElements = originalDate.split("/");
        if(dateElements.length!=3) throw new InvalidFormatException("The correct format for birth date is dd/mm/yyyy");
        return LocalDate.of(
                Integer.parseInt(dateElements[2]),
                Integer.parseInt(dateElements[1]),
                Integer.parseInt(dateElements[0])
        );
    }

    static LocalTime getTimeFromString(String originalTime) throws InvalidFormatException{
        String[] timeElements = originalTime.split(":");
        if(timeElements.length!=2) throw new InvalidFormatException("The correct format for birth time is hh:mm");
        return LocalTime.of(
                Integer.parseInt(timeElements[0]),
                Integer.parseInt(timeElements[1])
        );
    }
}

class InvalidFormatException extends Exception{
    public InvalidFormatException(String additionalMessage){
        super("The value you provided is invalid. " + additionalMessage);
    }
}