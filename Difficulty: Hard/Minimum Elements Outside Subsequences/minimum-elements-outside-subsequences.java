class Solution
{
    public int minCount(int[] arr)
    {
        int n=arr.length;
        int[][] dp=new int[n+1][n+1];
        for(int[] row:dp)
            java.util.Arrays.fill(row,-1);
        dp[0][0]=0;
        for(int k=1;k<=n;k++)
        {
            int[][] next=new int[n+1][n+1];
            for(int[] row:next)
                java.util.Arrays.fill(row,-1);
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<k;j++)
                {
                    if(dp[i][j]==-1)
                        continue;
                    int selected=dp[i][j];
                    next[i][j]=Math.max(next[i][j],selected);
                    int incLast=i==0?-1:arr[i-1];
                    int decLast=j==0?101:arr[j-1];
                    if(arr[k-1]>incLast)
                        next[k][j]=Math.max(next[k][j],selected+1);
                    if(arr[k-1]<decLast)
                        next[i][k]=Math.max(next[i][k],selected+1);
                }
            }
            dp=next;
        }
        int maxSelected=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
                maxSelected=Math.max(maxSelected,dp[i][j]);
        }
        return n-maxSelected;
    }
}
