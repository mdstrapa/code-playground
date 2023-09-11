import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppExceptionTest {

    AppException appException = new AppException();

    @Test
    void shouldReturnCorrectPowerCalculation() {
        long expectedResult = 27L;
        try{
            long actualResult = appException.power(3,3);

            assertEquals(expectedResult,actualResult);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    void shouldThrowNotZeroException() {
        try{
            assertThrowsExactly(NotZero.class,() -> appException.power(0,0),"n and p should not be zero.");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test
    void shouldThrowNotNegativeException() {
        try{
            assertThrowsExactly(NotNegative.class,() -> appException.power(-7,0),"n or p should not be negative.");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}