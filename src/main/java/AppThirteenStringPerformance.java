public class AppThirteenStringPerformance {

    public static void main(String[] args) {
        System.out.println("Program start ====================");

        stringOperation();
        stringBuilderOperation();

        System.out.println("Program end   ====================");
    }


    static private void stringOperation(){
        Long initTime = System.currentTimeMillis();

        String value = "";

        for(int c = 0; c < 1000000;c++){
            value = value + c;
        }

        Long finishTime = System.currentTimeMillis();

        System.out.println("Time consumed " + (finishTime - initTime));
    }

    static private void stringBuilderOperation(){
        Long initTime = System.currentTimeMillis();

        StringBuilder value = new StringBuilder();

        for(int c = 0; c < 1000000;c++){
            value = value.append(c);
        }

        Long finishTime = System.currentTimeMillis();

        System.out.println("Time consumed " + (finishTime - initTime));
    }


}
