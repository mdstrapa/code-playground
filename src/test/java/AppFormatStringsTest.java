import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppFormatStringsTest {

    AppFormatStrings app = new AppFormatStrings();

    @Test
    void should_Return_Correct_CPF_Format() throws InvalidInputValueException {
        String originalValue = "12345678900";
        String expectedValue = "123.456.789-00";
        String actualValue = app.formatValue(originalValue, AppFormatStrings.FormatType.CPF);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void should_Return_Correct_Cnpj_Format() throws InvalidInputValueException {
        String originalValue = "02023903000113";
        String expectedValue = "02.023.903/0001-13";
        String actualValue = app.formatValue(originalValue, AppFormatStrings.FormatType.CNPJ);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void should_Return_Correct_Phone_Number_Format() throws InvalidInputValueException {
        String originalValue = "5551998673456";
        String expectedValue = "+55 (51) 99867-3456";
        String actualValue = app.formatValue(originalValue, AppFormatStrings.FormatType.PHONE_NUMBER);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void should_Thrown_Exception_On_Invalid_Input_With_Alpha_Character(){
        Exception ex = assertThrows(InvalidInputValueException.class, () -> app.formatValue("DFSF23", AppFormatStrings.FormatType.CPF));

        String expectedMessage = "Non-numeric characters are not allowed";
        String actualMessage = ex.getMessage();

        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void should_Thrown_Exception_On_Invalid_CPF_Input(){
        Exception ex = assertThrows(InvalidInputValueException.class, () -> app.formatValue("1234567", AppFormatStrings.FormatType.CPF));

        String expectedMessage = "CPF must be a 11-long numeric sequence";
        String actualMessage = ex.getMessage();

        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void should_Thrown_Exception_On_Invalid_CNPJ_Input(){
        Exception ex = assertThrows(InvalidInputValueException.class, () -> app.formatValue("0202390300011356436", AppFormatStrings.FormatType.CNPJ));

        String expectedMessage = "CNPJ must be a 14-long numeric sequence";
        String actualMessage = ex.getMessage();

        assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void should_Thrown_Exception_On_Invalid_Phone_Number_Input(){
        Exception ex = assertThrows(InvalidInputValueException.class, () -> app.formatValue("555199867345609090", AppFormatStrings.FormatType.PHONE_NUMBER));

        String expectedMessage = "Phone Number must be a 13-long numeric sequence";
        String actualMessage = ex.getMessage();

        assertEquals(expectedMessage,actualMessage);
    }
}