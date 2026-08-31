class Solution 
{
    public int minCost(int n, int i, int d, int c) 
    {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=i;
        for(int j=2;j<=n;j++)
        {
            int x=j%2==0?dp[j/2]+c:Math.min(dp[j/2]+c+i,dp[(j+1)/2]+c+d);
            dp[j]=Math.min(dp[j-1]+i,x);
        }
        return dp[n];
    }
}