import java.util.Scanner;

class TestClass {
    public static void main(String[] args) throws Exception {
        int[] arr = {5,8,7,4,1,3,2};
        int n=arr.length;
        int x=7,count=0;
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[i]+arr[j]==x) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}