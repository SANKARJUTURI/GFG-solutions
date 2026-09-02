class Solution 
{
    public int solve(int n, String s) 
    {
        boolean[] B=new boolean[26];
        boolean[] R=new boolean[26];
        int t=0;
        int res=0;
        for(char ch:s.toCharArray())
        {
            int x=ch-'A';
            if(R[x])continue;
            if(t==n)
            {
                if(B[x])
                {
                    t--;
                    B[x]=false;
                }
                else
                {
                    R[x]=true;
                    res+=1;
                }
            }
            else
            {
                if(B[x])
                {
                    t--;
                    B[x]=false;
                }
                else
                {
                    t++;
                    B[x]=true;
                }
            }
        }
        return res;
    }
}
