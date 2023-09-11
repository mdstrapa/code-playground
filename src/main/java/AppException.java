public class AppException {

    public long power(int n, int p) throws Exception{

        if(n < 0 || p < 0) throw new NotNegative();
        if(n == 0 && p == 0) throw new NotZero();
        if(p==0) return 1L;

        long result = n;

        for(int c = 1;c<p;c++){
            result = result * n;
        }

        return result;
    }

}

class NotZero extends Exception{
    public NotZero() {
        super("n and p should not be zero.");
    }
}

class NotNegative extends Exception{
    public NotNegative() {
        super("n or p should not be negative.");
    }
}
