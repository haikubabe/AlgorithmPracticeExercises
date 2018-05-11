import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0;i<T;i++) {
             int N = in.nextInt();
             int K = in.nextInt();
             boolean[] flag = new boolean[N];
             String[] words = new String[N];
             String[] phrases;
             for (int j=0;j<words.length;j++) {
                 words[j] = in.next();
             }
             for (int k=0;k<K;k++) {
                 int L = in.nextInt();
                 phrases = new String[L];
                 for (int p=0;p<L;p++) {
                     phrases[p] = in.next();
                 }
                 for (int q=0;q<N;q++) {
                     for (int r=0;r<L;r++) {
                         if (phrases[r].equals(words[q])) {
                            flag[q] = true;
                         }
                     }
                 }
             }
             for (int l=0;l<N;l++) {
                 if (flag[l] == true) {
                     System.out.print("YES ");
                 } else if (flag[l] == false){
                     System.out.print("NO ");
                 }
             }
             System.out.println();
        }
    }
}