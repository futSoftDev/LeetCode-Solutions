class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int total=0;
        for(int num:nums) total+=num;
        if((total+target)%2!=0  || Math.abs(target)>total) return 0;
        int k=(total+target)/2;
        int dp[][]=new int [n+1][k+1];
        for(int i=0; i<=n; i++){
            dp[i][0]=1;
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<=k; j++){
                 dp[i][j]=dp[i-1][j];
                if(nums[i-1]<=j)
                dp[i][j]+=dp[i-1][j-nums[i-1]];
            }
        }
        return dp[n][k];
    }
}