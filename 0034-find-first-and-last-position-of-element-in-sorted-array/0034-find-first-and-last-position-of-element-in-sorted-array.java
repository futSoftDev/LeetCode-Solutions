class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int []res={-1,-1};
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res[0]=mid;
                right=mid-1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        left=0; right=n-1;
         while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                res[1]=mid;
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
}