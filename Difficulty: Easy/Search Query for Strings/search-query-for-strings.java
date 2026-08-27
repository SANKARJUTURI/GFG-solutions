/* structure of trie node
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

Note: The following functions are already implemented in the driver code.
You need to only call them, implementation is not required.

1. void Main.insert(TrieNode root, String word);
2. boolean Main.search(TrieNode root, String word);
*/

class Solution 
{
    public int[] checkQueries(TrieNode root, String[] arr, String[] queries) 
    {
        for(String str:arr)
        {
            Main.insert(root,str);
        }
        int n=queries.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=Main.search(root,queries[i])?1:0;
        }
        return res;
    }
}