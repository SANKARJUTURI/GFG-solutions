class Solution 
{
    public int sameMod(int[] arr) 
    {
        int g = 0;

        // GCD of all differences
        for (int i = 1; i < arr.length; i++) 
        {
            g = gcd(g, Math.abs(arr[i] - arr[0]));
        }

        // All elements are equal
        if (g == 0)
            return -1;

        // Count divisors of g
        int count = 0;

        for (int k = 1; k * k <= g; k++) 
        {
            if (g % k == 0) 
            {
                count++;

                // k and g/k are different divisors
                if (k != g / k)
                    count++;
            }
        }

        return count;
    }

    private int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}