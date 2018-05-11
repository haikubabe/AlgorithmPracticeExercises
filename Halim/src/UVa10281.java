import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa10281 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int previousTime = 0, currentTime, initialSpeed = 0;
        double distance = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split("\\s+");
            String[] timeStr = str[0].split(":");
            int hour = Integer.parseInt(timeStr[0]);
            int min = Integer.parseInt(timeStr[1]);
            int seconds = Integer.parseInt(timeStr[2]);
            currentTime = hour * 3600 + min * 60 + seconds;
            double time = (double) (currentTime - previousTime)/3600;
            distance += time * initialSpeed;
            previousTime = currentTime;
            if (str.length == 2) {
                int currentSpeed = Integer.parseInt(str[1]);
                initialSpeed = currentSpeed;
            } else {
                System.out.printf("%02d:%02d:%02d %.2f km\n", hour, min, seconds, distance);
            }
        }
    }
}
