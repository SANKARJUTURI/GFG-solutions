class Solution 
{
    public int longestSubseq(int[] arr) 
    {
        Map<Integer,Integer>M=new HashMap<>();
        int ans=1;
        for(int x:arr)
        {
            int len=Math.max(M.getOrDefault(x-1,0),M.getOrDefault(x+1,0))+1;
            M.put(x,Math.max(M.getOrDefault(x,0),len));
            ans=Math.max(ans,M.get(x));
        }
        return ans;
    }
}
