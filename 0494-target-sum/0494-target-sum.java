class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int total=0;
        for(int num:nums) total+=num;
        if((total+target)%2!=0  || Math.abs(target)>total) return 0;
        int k=(total+target)/2;
        int dp[][]=new int [n+1][k+1];
        dp[0][0]=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=k; j++){
                 int skip=dp[i-1][j];
                 int take=0;
                if(nums[i-1]<=j)
                 take+=dp[i-1][j-nums[i-1]];
                dp[i][j]=take+skip;
            }
        }
        return dp[n][k];
    }
}