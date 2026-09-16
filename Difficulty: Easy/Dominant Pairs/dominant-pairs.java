import java.util.*;

class Solution {
    public int dominantPairs(int[] arr) {
        int n = arr.length;
        int half = n / 2;

        int[] second = Arrays.copyOfRange(arr, half, n);
        Arrays.sort(second);

        int count = 0;

        for (int i = 0; i < half; i++) {
            int lo = 0, hi = half;

            while (lo < hi) {
                int mid = (lo + hi) >>> 1;

                if (5L * second[mid] <= arr[i])
                    lo = mid + 1;
                else
                    hi = mid;
            }

            count += lo;
        }

        return count;
    }
}