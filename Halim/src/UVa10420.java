import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class UVa10420 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        Map<String, Integer> countryMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] str = bufferedReader.readLine().split("\\s+", 2);
            String countryName = str[0];
            if (countryMap.containsKey(countryName))
                countryMap.put(countryName, countryMap.get(countryName) + 1);
            else
                countryMap.put(countryName, 1);
        }
        for (Map.Entry entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
