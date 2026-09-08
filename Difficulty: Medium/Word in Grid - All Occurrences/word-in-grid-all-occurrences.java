

class Solution 
{
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) 
    {
        ArrayList<ArrayList<Integer>> R = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (mat[i][j] != word.charAt(0))
                    continue;

                boolean found = false;

                // Try all 8 directions
                for (int di = -1; di <= 1 && !found; di++)
                {
                    for (int dj = -1; dj <= 1; dj++)
                    {
                        if (di == 0 && dj == 0)
                            continue;

                        if (search(mat, word, 0, i, j, di, dj))
                        {
                            R.add(new ArrayList<>(Arrays.asList(i, j)));
                            found = true;
                            break;
                        }
                    }
                }
            }
        }

        return R;
    }

    private boolean search(char[][] mat, String word, int index,
                           int i, int j, int di, int dj)
    {
        int n = mat.length;
        int m = mat[0].length;

        if (index == word.length())
            return true;

        if (i < 0 || j < 0 || i >= n || j >= m)
            return false;

        if (mat[i][j] != word.charAt(index))
            return false;

        return search(mat, word, index + 1,
                      i + di, j + dj, di, dj);
    }
}
