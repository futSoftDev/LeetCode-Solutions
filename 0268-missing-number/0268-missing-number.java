class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        
        int totalSum=((length)*(length+1))/2;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            
            sum+=nums[i];
        
        }
        int ans=totalSum-sum;
        // return (totalSum-sum);
        return ans;

    }
}