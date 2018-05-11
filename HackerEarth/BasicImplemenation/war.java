import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0) {
            int N=in.nextInt();
            long[] bobArr=new long[N];
            long[] aliceArr=new long[N];
            for (int i=0;i<N;i++) {
                bobArr[i]=in.nextLong();
            }
            for (int i=0;i<N;i++) {
                aliceArr[i]=in.nextLong();
            }
            long maxBob=bobArr[0],maxAlice=aliceArr[0];
            for (int i=1;i<N;i++) {
                if (bobArr[i]>maxBob) maxBob=bobArr[i];
                if (aliceArr[i]>maxAlice) maxAlice=aliceArr[i];
            }
            if (maxAlice==maxBob) System.out.println("Tie");
            else if (maxAlice>maxBob) System.out.println("Alice");
            else if (maxBob>maxAlice) System.out.println("Bob");
        }
    }
}