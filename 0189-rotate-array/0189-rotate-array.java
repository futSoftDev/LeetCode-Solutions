class Solution {
    public void rotate(int[] nums, int K) {
        int n=nums.length;
        int k=K%n;
        rotateArr(0,n-1,nums);
        rotateArr(0,k-1, nums);
        rotateArr(k,n-1,nums);
        
    }
    public  void rotateArr(int left, int right, int []nums){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}