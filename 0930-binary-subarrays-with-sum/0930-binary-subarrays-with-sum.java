class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return compute(nums,goal)-compute(nums,goal-1);
    }
    public int compute(int []nums, int goal){
        if(goal<0) return 0;
        int l=0;
        int sum=0;
        int count=0;
        int n=nums.length;
        for(int r=0; r<n; r++){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
}