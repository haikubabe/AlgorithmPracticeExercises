import java.util.Scanner;

class TestClass {
    static int findPos(int[] arr, int l, int r, int x) {
        while (l<=r) {
            int mid=(l+r)/2;
            if (arr[mid]==x) return mid;
            else if (x<arr[mid]) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        int n=arr.length;
        int x=4;
        int pos=findPos(arr,0,arr.length-1,4);
        for (int i=pos;i<n-1;i++) {
            arr[i]=arr[i+1];
        }
        n=n-1;
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}