import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa10141 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = 0;
        String line;
        boolean blank = false;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int p = Integer.parseInt(arr[1]);
            if (n == 0 && p == 0) break;
            testCases++;
            for (int i = 0; i < n; i++) {
                bufferedReader.readLine();
            }
            double maxCompliance = Integer.MIN_VALUE;
            double lowestPrice = Integer.MAX_VALUE;
            String name = "";
            for (int i = 0; i < p; i++) {
                String proposalName = bufferedReader.readLine();
                String[] str = bufferedReader.readLine().split("\\s+");
                double price = Double.parseDouble(str[0]);
                int noOfRequirementsMet = Integer.parseInt(str[1]);
                double partialComp = noOfRequirementsMet / (double) n;
                if (partialComp > maxCompliance) {
                    name = proposalName;
                    maxCompliance = partialComp;
                    lowestPrice = price;
                } else if (partialComp == maxCompliance && price < lowestPrice) {
                    name = proposalName;
                    lowestPrice = price;
                }
                for (int j = 0; j < noOfRequirementsMet; j++) {
                    bufferedReader.readLine();
                }
            }

            if (blank) System.out.println();
            blank = true;
            System.out.println("RFP #" + testCases);
            System.out.println(name);
        }
    }
}
