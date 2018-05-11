import java.util.Scanner;

class TestClass {
    static int solve(int grade) {
        int mod = grade % 5;
        int multiple = grade;
        int finalGrade = grade;
        while (mod != 0) {
            multiple++;
            mod = multiple % 5;
        }
        int diff = multiple - grade;
        if (diff < 3) {
            if (multiple >= 40) {
                finalGrade = multiple;
            }
        }
        return finalGrade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];

        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
            int result = solve(grades[grades_i]);
            System.out.println(result);
        }
    }
}
