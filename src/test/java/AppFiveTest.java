import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppFiveTest {

    AppFiveGetFirslLettersFromFullName appFive = new AppFiveGetFirslLettersFromFullName();

    @Test
    void should_return_correct_first_letters() {
        try{
            String originalName = "Fabiele Avila Cidade";
            String expectedResult = "FAC";
            String actualResutl = appFive.returnsFirtsLetters(originalName);
            assertEquals(expectedResult,actualResutl);

            originalName = "Daniele Fraga";
            expectedResult = "DF";
            actualResutl = appFive.returnsFirtsLetters(originalName);
            assertEquals(expectedResult,actualResutl);
        }catch (WrongParameter e){
            System.out.println(e);
        }
    }

    @Test
    void should_thrown_wrong_parameter_exception(){
        assertThrowsExactly(WrongParameter.class,() -> appFive.returnsFirtsLetters("86876"),"Wrong parameters");
    }
}