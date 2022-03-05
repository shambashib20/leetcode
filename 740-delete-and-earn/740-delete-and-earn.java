class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            max=Math.max(max,nums[i]);                    //finding maximum element of array for dp[] and freq[]
        int f[]=new int[++max];
        for(int i=0;i<n;i++)
            f[nums[i]]++;                                 //calculating frequency of every number
        int dp[]=new int[max];
        dp[1]=f[1];                                       //number of times 1 appear in actual array
        dp[2]=f[2]*2;                                     //number of times 2 appear in actual array
        for(int i=3;i<max;i++)                            //starting from 3 to max value of the actual array
            dp[i]=(f[i]*i)+Math.max(dp[i-2],dp[i-3]);
        Arrays.sort(dp);                                  //to find max value
        return dp[max-1];
    }
}