class Solution 
{
    public int maxSum(int[] arr, int x) 
    {
        int n=arr.length;
        int left=0;
        int sum=0;
        int res=0;
        for(int right=0;right<n;right++)
        {
            sum+=arr[right];
            while(sum>x)
            {
                sum-=arr[left++];
            }
            res=Math.max(res,sum);
        }
        return res;
    }
};