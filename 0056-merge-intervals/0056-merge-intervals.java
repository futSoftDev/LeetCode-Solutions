class Solution {
    public int[][] merge(int[][] nums) {
        int n=nums.length;
        int j=0;
        int res[][]=new int [n][2];
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0; i<n; i++){
            if(j==0 || res[j-1][1]<nums[i][0]){
                res[j][0]=nums[i][0];
                res[j][1]=nums[i][1];
                j++;
            }else{
                res[j-1][1]=Math.max(res[j-1][1],nums[i][1]);
            }
        }
        return Arrays.copyOf(res,j);
    }
}