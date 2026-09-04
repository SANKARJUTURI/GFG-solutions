class Solution 
{
    public int maxFruits(ArrayList<Integer> arr, int m) 
    {
        int n=arr.size();
        int curr=0;
        for(int i=0;i<m;i++)
        {
            curr+=arr.get(i);
        }
        int res=curr;
        for(int i=0;i<n;i++)
        {
            curr+=(arr.get((m+i)%n)-arr.get(i));
            res=Math.max(res,curr);
        }
        return res;
    }
}