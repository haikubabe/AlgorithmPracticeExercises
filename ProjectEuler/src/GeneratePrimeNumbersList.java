public class GeneratePrimeNumbersList {
    private static void findListPrime(int num) {
        for (int i = 1; i <= num; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
//        System.out.println(n + ": " + count);
        if (count == 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        int num = 10;
        findListPrime(num);
    }
}
