class Solution {
    public int findKthPositive(int[] arr, int k) {
        int r=arr.length;
        int l=0;
        while(l<r){
            int m=(l+r)/2;
            if(arr[m]-m-1<k) l=m+1;
            else r=m;
        } return l+k;
    }
}