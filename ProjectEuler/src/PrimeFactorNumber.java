public class PrimeFactorNumber {
    private static void findPrimeFactor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        int num = 13195;
        findPrimeFactor(num);
    }
}
