import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ThreeLetterCode {
    private static void loadData(HashMap<String, String> hashMap) {
        hashMap.put("AFG", "Afghanistan");
        hashMap.put("ALA", "Åland Islands");
        hashMap.put("ALB", "Albania");
        hashMap.put("DZA", "Algeria");
        hashMap.put("ASM", "American Samoa");
        hashMap.put("AND", "Andorra");
        hashMap.put("AGO", "Angola");
        hashMap.put("AIA", "Anguilla");
        hashMap.put("ATA", "Antarctica");
        hashMap.put("ATG", "Antigua and Barbuda");
        hashMap.put("ARG", "Argentina");
        hashMap.put("ARM", "Armenia");
        hashMap.put("ABW", "Aruba");
        hashMap.put("AUS", "Australia");
        hashMap.put("AUT", "Austria");
        hashMap.put("AZE", "Azerbaijan");
        hashMap.put("BHS", "Bahamas");
        hashMap.put("BHR", "Bahrain");
        hashMap.put("BGD", "Bangladesh");
        hashMap.put("BRB", "Barbados");
        hashMap.put("BLR", "Belarus");
    }

    private static String returnCountryNameFromCode(HashMap<String, String> hashMap, String code) {
        String output = "Invalid country code. Please enter valid code.";
        for (Map.Entry<String, String> mapEntry : hashMap.entrySet()) {
            if (code.equalsIgnoreCase(mapEntry.getKey())) {
                output = mapEntry.getValue();
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        HashMap<String, String> countryCodeHashMap = new HashMap<>();
        loadData(countryCodeHashMap);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        String str = line.split("\\s+")[0];
        System.out.println(returnCountryNameFromCode(countryCodeHashMap, str));
    }
}
