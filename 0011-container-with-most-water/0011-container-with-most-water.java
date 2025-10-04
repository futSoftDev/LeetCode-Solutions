class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int i=0; 
        int j=n-1;
        int max_area=0;
        while(i<j){
            int h=j-i;
            int v=Math.min(arr[j],arr[i]);
            max_area=Math.max(max_area, h*v);
            if(arr[j]>arr[i]) i++;
            else j--;
        }
        return max_area;
    }
}