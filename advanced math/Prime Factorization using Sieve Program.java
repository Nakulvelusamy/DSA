public class PrimeFactorizationSieve {
    public static void main(String[] args) {
        int n = 60;
        int[] spf = smallestPrimeFactor(n);
        System.out.print("Prime Factorization using Sieve: ");
        while (n != 1) {
            System.out.print(spf[n] + " ");
            n /= spf[n];
        }
    }

    public static int[] smallestPrimeFactor(int n) {
        int[] spf = new int[n + 1];
        for (int i = 0; i <= n; i++) spf[i] = i;

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
        return spf;
    }
}
