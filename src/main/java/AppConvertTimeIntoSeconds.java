import java.util.Scanner;

public class AppConvertTimeIntoSeconds {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Coverts a Given Time into Seconds");
        System.out.println();

        System.out.println("Type the time you want to calculate:");
        System.out.print("Year: ");
        int years = userInput.nextInt();
        System.out.print("Months: ");
        int months = userInput.nextInt();
        System.out.print("Days: ");
        int days = userInput.nextInt();
        System.out.print("Hours: ");
        int hours = userInput.nextInt();
        System.out.print("Minutes: ");
        int minutes = userInput.nextInt();
        System.out.print("Seconds: ");
        int seconds = userInput.nextInt();

        int totalSeconds = new AppConvertTimeIntoSeconds().convert(years,months,days,hours,minutes,seconds);

        System.out.println();
        System.out.println("Total time in seconds is: " + totalSeconds);


    }

    public int convert(int years,int months, int days, int hours, int minutes, int seconds){

        int yearsToSeconds = minutesToSeconds(hoursToMinutes(daysToHours(monthsToDays(yearsToMonths(years)))));
        int monthsToSeconds = minutesToSeconds(hoursToMinutes(daysToHours(monthsToDays(months))));
        int daysToSeconds = minutesToSeconds(hoursToMinutes(daysToHours(days)));
        int hoursToSeconds = minutesToSeconds(hoursToMinutes(hours));
        int minutesToSeconds = minutesToSeconds(minutes);

        return yearsToSeconds + monthsToSeconds + daysToSeconds + hoursToSeconds + minutesToSeconds + seconds;
    }

    public int minutesToSeconds(int minutes){
        return 60 * minutes;
    }

    public int hoursToMinutes(int hours){
        return 60 * hours;
    }

    public int daysToHours(int days){
        return 24 * days;
    }

    public int monthsToDays(int months){
        return 30 * months;
    }

    public int yearsToMonths(int years){
        return 12 * years;
    }

}
