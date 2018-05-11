import java.util.Scanner;

public class UVa573 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double H = scanner.nextDouble();
            double U = scanner.nextDouble();
            double D = scanner.nextDouble();
            double F = scanner.nextDouble();
            if (H == 0) break;
            int day = 0;
            double distanceClimbed = U;
            double initialHeight;
            double height = 0;
            double distanceLostToFatigue = (F / 100) * U;
            boolean success = true;
            while (success) {
                day++;
                initialHeight = height;
                if (distanceClimbed > 0) {
                    height = initialHeight + distanceClimbed;
                    distanceClimbed = distanceClimbed - distanceLostToFatigue;
                }
                if (height > H) {
                    break;
                }
                height = height - D;
                if (height < 0) {
                    success = false;
                    break;
                }
            }
            if (success) {
                System.out.println("success on day " + day);
            } else {
                System.out.println("failure on day " + day);
            }
        }
    }
}
