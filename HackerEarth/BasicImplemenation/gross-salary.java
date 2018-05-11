import java.util.Scanner;
import java.text.DecimalFormat;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
            int salary = in.nextInt();
            double hra=0,da=0;
            double grossSalary=0;
            if (salary<1500) {
                hra = 0.1*salary;
                da = 0.9*salary;
                grossSalary=salary+hra+da;
            } else if (salary>=1500) {
                hra=500;
                da=0.98*salary;
                grossSalary=salary+hra+da;
            }
            System.out.printf("%1\n", grossSalary);
        }
    }
}