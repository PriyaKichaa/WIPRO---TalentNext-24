/*
Q13 Write a program to print prime numbers between 10 and 99.
*/

public class PrintPrimeFrom10To99 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i, n = 99;
        for (i = 10; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
