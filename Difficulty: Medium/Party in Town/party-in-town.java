class Solution {
    public int partyHouse(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();

        int[] first = bfs(adj, 0);

        int farthest = 0;
        for (int i = 0; i < n; i++) {
            if (first[i] > first[farthest]) {
                farthest = i;
            }
        }

        int[] second = bfs(adj, farthest);

        int diameter = 0;
        for (int d : second) {
            diameter = Math.max(diameter, d);
        }

        return (diameter + 1) / 2;
    }

    private int[] bfs(ArrayList<ArrayList<Integer>> adj, int src) {
        int n = adj.size();
        int[] dist = new int[n];

        java.util.Arrays.fill(dist, -1);

        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : adj.get(u)) {
                int next = v - 1;

                if (dist[next] == -1) {
                    dist[next] = dist[u] + 1;
                    q.add(next);
                }
            }
        }

        return dist;
    }
}

