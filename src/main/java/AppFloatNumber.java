import java.math.BigDecimal;

public class AppFloatNumber {

    public static void main(String[] args) {
        //showFloatSum();
        // Using float
        float floatNumber = 0.1f + 0.1f + 0.1f;

        String formattedValue = String.format("%.17f", floatNumber);

        System.out.println("Using float: " + formattedValue);

        // Using BigDecimal
        BigDecimal bdNumber = new BigDecimal("0.1").add(new BigDecimal("0.1")).add(new BigDecimal("0.1"));

        String formattedBigDecimalValue = String.format("%.17f", bdNumber);

        System.out.println("Using BigDecimal: " + formattedBigDecimalValue);
    }

    public float returnFloatSum(float a, float b){
        return a + b;
    }

    public static void showFloatSum(){
        System.out.println(0.1F + 0.2F);
    }

}
