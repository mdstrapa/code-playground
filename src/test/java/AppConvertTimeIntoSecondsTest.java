import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppConvertTimeIntoSecondsTest {

    AppConvertTimeIntoSeconds app = new AppConvertTimeIntoSeconds();

    @Test
    void shouldReturnCorrectTotalSeconds() {
        int years = 0;
        int months = 0;
        int days = 0;
        int hours = 0;
        int minutes = 1;
        int seconds = 10;

        int expectedResult = 70;
        int actualResult = app.convert(years,months,days,hours, minutes, seconds);
        assertEquals(expectedResult,actualResult);

        hours = 1;
        expectedResult = 3670;
        actualResult = app.convert(years,months,days,hours, minutes, seconds);
        assertEquals(expectedResult,actualResult);

        days = 1;
        hours = 0;
        minutes = 0;
        seconds = 0;
        expectedResult = 86400;
        actualResult = app.convert(years,months,days,hours, minutes, seconds);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void shouldReturnCorrectSecondsFromMinutes(){
        int minutes = 3;
        int expectedResult = 180;
        int actualResult = app.minutesToSeconds(minutes);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectMinutesFromHours(){
        int hours = 4;
        int expectedResult = 240;
        int actualResult = app.hoursToMinutes(hours);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectHoursFromDays(){
        int days = 1;
        int expectedResult = 24;
        int actualResult = app.daysToHours(days);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectDaysFromMonths(){
        int months = 2;
        int expectedResult = 60;
        int actualResult = app.monthsToDays(months);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectMonthsFromYears(){
        int years = 3;
        int expectedResult = 36;
        int actualResult = app.yearsToMonths(years);
        assertEquals(expectedResult,actualResult);
    }

}