import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppPalindromeTest {

    AppPalindrome appPalindrome = new AppPalindrome();

    @Test
    void shouldReturnTrueWhenPalindrome() {
        String expected = "AVOVA";
        boolean result = appPalindrome.isPalindrome(expected);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenNotPalindrome() {
        String expected = "AVOVE";
        boolean result = appPalindrome.isPalindrome(expected);
        assertFalse(result);
    }
}