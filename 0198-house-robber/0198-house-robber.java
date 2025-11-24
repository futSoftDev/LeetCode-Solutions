class Solution {
    // int  function( int idx,int [] nums, int [] dp ){

    //       if(idx==0) return nums[idx];
    //       if(idx<0) return 0;
    //     if(dp[idx]!=-1) return dp[idx];
    //         int pick=nums[idx]+function(idx-2, nums, dp);
    //          int notpick=0+ function(idx-1, nums,dp);
    //         return dp[idx]=Math.max(pick, notpick);
    // }
    // public int rob(int[] nums) {
    //     int n=nums.length;
    //     int dp[]=new int [n];
    //     Arrays.fill(dp,-1);
    //   return function(n-1,nums,dp);
        

    // }
        public int rob(int[] nums) {
            int n=nums.length;
            int prev=nums[0];
            int prev2=0;
            for(int i=1; i<n; i++){
                int take=nums[i];
                if(i>1) take+=prev2;
                int nontake=0+prev;
                 int curri=Math.max(take, nontake);
                prev2=prev;
                prev=curri;
            }
            return prev;
        }
}