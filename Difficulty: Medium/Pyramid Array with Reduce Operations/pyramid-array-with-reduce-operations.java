class Solution {
    public int formPyramid(int[] arr) {
        int n = arr.length;
        long total = 0;

        for (int x : arr)
            total += x;

        long[] left = new long[n];
        long[] right = new long[n];

        left[0] = Math.min(arr[0], 1);

        for (int i = 1; i < n; i++)
            left[i] = Math.min(arr[i], left[i - 1] + 1);

        right[n - 1] = Math.min(arr[n - 1], 1);

        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.min(arr[i], right[i + 1] + 1);

        long max = 0;

        for (int i = 0; i < n; i++) {
            long peak = Math.min(left[i], right[i]);
            max = Math.max(max, peak * peak);
        }

        return (int)(total - max);
    }
};