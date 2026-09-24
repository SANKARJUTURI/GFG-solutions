
class Solution {
    public int maxStackHeight(int[] r, int[] h) {
        int n = r.length;

        int[][] d = new int[n][2];

        for (int i = 0; i < n; i++) {
            d[i][0] = r[i];
            d[i][1] = h[i];
        }

        // Radius ascending, height descending for equal radius
        Arrays.sort(d, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(b[1], a[1]);
        });

        int[] bit = new int[1002];
        int ans = 0;

        for (int[] disc : d) {
            int height = disc[1];

            // Maximum stack height with strictly smaller height
            int best = query(bit, height - 1);

            int current = best + height;

            update(bit, height, current);

            ans = Math.max(ans, current);
        }

        return ans;
    }

    private int query(int[] bit, int i) {
        int max = 0;

        while (i > 0) {
            max = Math.max(max, bit[i]);
            i -= i & -i;
        }

        return max;
    }

    private void update(int[] bit, int i, int value) {
        while (i < bit.length) {
            bit[i] = Math.max(bit[i], value);
            i += i & -i;
        }
    }
}