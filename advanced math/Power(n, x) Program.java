public class PowerFunction {
    public static void main(String[] args) {
        long base = 3;
        long exp = 4;
        long result = power(base, exp);
        System.out.println("Power(" + base + ", " + exp + ") = " + result);
    }

    public static long power(long n, long x) {
        long result = 1;
        while (x > 0) {
            if ((x & 1) == 1) result *= n;
            n *= n;
            x >>= 1;
        }
        return result;
    }
}
