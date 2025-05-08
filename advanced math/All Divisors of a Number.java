public class AllDivisors {
    public static void main(String[] args) {
        int n = 60;
        System.out.print("All Divisors of " + n + ": ");
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}
