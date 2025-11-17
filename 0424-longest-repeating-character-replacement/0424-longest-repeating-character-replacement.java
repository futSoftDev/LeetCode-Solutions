class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int len=0;
        int mfre=0;
        int fre[]=new int[26];
        for(int r=0; r<n; r++){
            
            fre[s.charAt(r)-'A']++;
            mfre=Math.max(mfre,fre[s.charAt(r)-'A']);
            while(( r-l+1)-mfre >k){
                fre[s.charAt(l)-'A']--;
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}