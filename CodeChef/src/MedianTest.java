import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MedianTest {
    private static int max(int a, int b) {
        return (a > b ? a : b);
    }

    private static int min(int a, int b) {
        return (a < b ? a : b);
    }

    private static double median(int[] arr, int n) {
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

    private static double getMedian(int[] M, int[] N, int l, int m, int k, int n) {
        //length of both array are same
        if (m - l == n - k) {
            System.out.println(l + " " + (m - 1) + " " + k + " " + (n - 1));
            if (m <= 0) return -1;
            else if (m - l == 1) return (M[l] + N[k]) / 2.0;
            else if (m - l == 2) return (max(M[l], N[k]) + min(M[m - 1], N[n - 1])) / 2.0;
            double mMedian = median(M, m);
            double nMedian = median(N, n);
            System.out.println(mMedian + " " + nMedian);
            if (mMedian > nMedian) {
                if (m % 2 == 0)
                    return getMedian(M, N, 0, m / 2, n / 2, n);
                else
                    return getMedian(M, N, 0, m / 2 + 1, n / 2, n);
            } else if (mMedian < nMedian) {
                if (m % 2 == 0)
                    return getMedian(M, N, m / 2, m, 0, n / 2);
                else
                    return getMedian(M, N, m / 2, m, 0, n / 2 + 1);
            } else
                return mMedian;
        } else {
            System.out.println("Length are not equal");
            if (m > n) {
                return getMedian(N, M, k, n, l, m);
            }
            int start = l;
            int end = m;
            while (start <= end) {
                System.out.println("Start: " + start + " End: " + end);
                int partitionM = (start + end) / 2;
                int partitionN = (m + n + 1) / 2 - partitionM;
                int maxLeftM = (partitionM == 0) ? Integer.MIN_VALUE : M[partitionM - 1];
                int minRightM = (partitionM == m) ? Integer.MAX_VALUE : M[partitionM];
                int maxLeftN = (partitionN == 0) ? Integer.MIN_VALUE : N[partitionN - 1];
                int minRightN = (partitionN == n) ? Integer.MAX_VALUE : N[partitionN];
                System.out.println("PartitionM: " + partitionM + " PartitionN: " + partitionN);
                System.out.println("MaxLeftM: " + maxLeftM);
                System.out.println("MinRightM: " + minRightM);
                System.out.println("MaxLeftN: " + maxLeftN);
                System.out.println("MinRightN: " + minRightN);
                if (maxLeftM <= minRightN && maxLeftN <= minRightM) {
                    if ((m + n) % 2 == 0)
                        return (max(maxLeftM, maxLeftN) + min(minRightM, minRightN)) / 2.0;
                    else
                        return max(maxLeftM, maxLeftN);
                } else if (maxLeftM > minRightN) {
                    end = partitionM - 1;
                } else if (maxLeftN > minRightM) {
                    start = partitionM + 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bufferedReader.readLine().split("\\s+");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int[] M = new int[m];
        int[] N = new int[n];
        String[] str1 = bufferedReader.readLine().split("\\s+");
        String[] str2 = bufferedReader.readLine().split("\\s+");
        for (int i = 0; i < m; i++) {
            M[i] = Integer.parseInt(str1[i]);
        }
        for (int j = 0; j < n; j++) {
            N[j] = Integer.parseInt(str2[j]);
        }
        System.out.println("The median is " + getMedian(M, N, 0, m, 0, n));
    }
}
