class Solution {
    public String findLongestWord(String s, List<String> d) {
        List<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++)
            pos[i] = new ArrayList<>();

        for (int i = 0; i < s.length(); i++)
            pos[s.charAt(i) - 'a'].add(i);

        String ans = "";

        for (String word : d) {
            int prev = -1;
            boolean possible = true;

            for (char c : word.toCharArray()) {
                List<Integer> list = pos[c - 'a'];

                int l = 0, r = list.size();

                while (l < r) {
                    int mid = (l + r) / 2;
                    if (list.get(mid) <= prev)
                        l = mid + 1;
                    else
                        r = mid;
                }

                if (l == list.size()) {
                    possible = false;
                    break;
                }

                prev = list.get(l);
            }

            if (possible &&
                (word.length() > ans.length() ||
                (word.length() == ans.length() && word.compareTo(ans) < 0))) {
                ans = word;
            }
        }

        return ans;
    }
}