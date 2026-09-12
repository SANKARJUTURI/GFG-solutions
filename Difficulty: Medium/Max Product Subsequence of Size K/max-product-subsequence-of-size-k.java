
class Solution {
    public int maxProduct(int[] arr, int k) {
        long[][] max = new long[k + 1][2];
        long[][] min = new long[k + 1][2];

        boolean[][] possible = new boolean[k + 1][2];

        possible[0][0] = true;
        max[0][0] = min[0][0] = 1;

        for (int x : arr) {
            for (int j = k; j >= 1; j--) {
                if (possible[j - 1][0]) {
                    long p = max[j - 1][0] * x;
                    long q = min[j - 1][0] * x;

                    if (!possible[j][0]) {
                        max[j][0] = Math.max(p, q);
                        min[j][0] = Math.min(p, q);
                        possible[j][0] = true;
                    } else {
                        max[j][0] = Math.max(max[j][0], Math.max(p, q));
                        min[j][0] = Math.min(min[j][0], Math.min(p, q));
                    }
                }
            }
        }

        return (int)max[k][0];
    }
}