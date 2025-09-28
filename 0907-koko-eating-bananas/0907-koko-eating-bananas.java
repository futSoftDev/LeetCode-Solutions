class Solution {
    private int findmax(int [] nums){
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maxi=Math.max(nums[i],maxi);
        }
        return maxi;
    }
    private int calculate(int [] nums, int hourly){
        int hours=0;
        for(int i=0; i<nums.length; i++){
            hours+=Math.ceil( (double)nums[i]/(double) hourly);
        }
        return hours;
    }
    public int minEatingSpeed(int[] nums, int h) {
        int n=nums.length;
        int low=1;
        int high=findmax(nums);
        
        while(low<=high){
            int mid=(low+high)/2;
            int totalh=calculate(nums,mid);
            if(totalh<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}