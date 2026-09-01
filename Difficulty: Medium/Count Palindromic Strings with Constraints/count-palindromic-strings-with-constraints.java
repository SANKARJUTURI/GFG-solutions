class Solution 
{
    public int palindromicStrings(int n, int k) 
    {
        long res=0;
        for(int i=1;i<=n;i++)
        {
            res=(res+permutation(k,(i+1)/2))%1000000007;
        }
        return (int)res;
    }
    private long permutation(int n,int r)
    {
        long res=1;
        for(long i=n;i>n-r;i--)
        {
            res=(res*i)%1000000007;;
        }
        return res;
    }
}