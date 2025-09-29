class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int len=1;
        String str=s.substring(0,1);
        for(int i=0; i<n; i++){
            for(int j=1+len; j<=n; j++){
                if(j-i>len && isPalindrome(s.substring(i,j))){
                    len=j-i;
                    str=s.substring(i,j);
                }
            }
        }
        return str;
    }
    private boolean isPalindrome(String str){
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}