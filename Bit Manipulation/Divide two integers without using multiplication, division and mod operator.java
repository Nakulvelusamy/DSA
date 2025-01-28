public class Main {
    public static void main(String[] args) {
        int dividend = 20; 
        int divisor = 4;    
        if (divisor == 0) {
            System.out.println("Error: Division by zero.");
            return;
        }
        int quotient = 0;
        while (dividend >= divisor) {
            int tempDivisor = divisor;
            int multiple = 1;
            while (dividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            dividend -= tempDivisor;
            quotient += multiple;  
        }
        System.out.println("Quotient: " + quotient);
    }
}
