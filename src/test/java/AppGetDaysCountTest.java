import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppGetDaysCountTest {

    AppGetDaysCount app = new AppGetDaysCount();

    @Test
    void shouldReturnCorrectDaysCountOne() {
        LocalDate initDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024,1,30);

        Long expectedResult = 29L;
        Long actualResult = app.getDaysCountFromGivenDate(initDate,endDate);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void shouldReturnCorrectDaysCountTwo() {
        LocalDate initDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024,1,1);

        Long expectedResult = 365L;
        Long actualResult = app.getDaysCountFromGivenDate(initDate,endDate);

        assertEquals(expectedResult,actualResult);
    }


}