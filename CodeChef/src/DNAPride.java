import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNAPride {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (t!=0) {
            int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
            String str = bufferedReader.readLine().split("\\s+")[0];
            char[] inp = str.toCharArray();
            char[] out = new char[n];
            boolean res=true;
            for (int i=0;i<n;i++) {
                if (inp[i]=='A')
                    out[i]='T';
                else if (inp[i]=='G')
                    out[i]='C';
                else if (inp[i]=='T')
                    out[i]='A';
                else if (inp[i]=='C')
                    out[i]='G';
                else {
                   res=false;
                   break;
                }
            }
            if (res) System.out.println(String.valueOf(out));
            else System.out.println("Error RNA nucleobases found!");
            t--;
        }
    }
}
