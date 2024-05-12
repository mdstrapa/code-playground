public class AppPalindrome {

    public boolean isPalindrome(String value) {
        StringBuilder builder = new StringBuilder(value);
        return value.contentEquals(builder.reverse());
    }
}
