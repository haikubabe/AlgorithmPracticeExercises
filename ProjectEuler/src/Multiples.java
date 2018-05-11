public class Multiples {
    private static int sumDivisiblity(int n) {
        int target = 999;
        int p = target / n;
        return n * (p * (p + 1)) / 2;
    }

    //    Brute Force Approach
    private static int sum(int n) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumDivisiblity(3) + sumDivisiblity(5) - sumDivisiblity(15);
        System.out.println(sum);
    }
}

