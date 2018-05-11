public class Anagram1 {
    private static boolean areAnagrams(String str1, String str2) {
        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (freq[str2.charAt(i)-'a'] == 0) return false;
            freq[str2.charAt(i)-'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "tablee";
        String str2 = "balte";
        if (areAnagrams(str1,str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
