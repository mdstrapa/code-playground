import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AppGetDaysCount {

    public Long getDaysCountFromGivenDate(LocalDate initDate, LocalDate endDate){
        return ChronoUnit.DAYS.between(initDate,endDate);
    }

}


class AppGetDaysCountTerminal {

    public static void main(String[] args) {
        System.out.print("Type your born date (format DD/MM/YYY): ");

        AppGetDaysCount daysCount = new AppGetDaysCount();

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        String[] inputDateElements = userInput.split("/");

        int year = Integer.parseInt(inputDateElements[2]);
        int month = Integer.parseInt(inputDateElements[1]);
        int day = Integer.parseInt(inputDateElements[0]);

        LocalDate bornDate = LocalDate.of(year,month,day);

        Long daysCountFromBornDate = daysCount.getDaysCountFromGivenDate(bornDate,LocalDate.now());

        System.out.println();
        System.out.println("Number of days since you were born: " + daysCountFromBornDate);

    }

}