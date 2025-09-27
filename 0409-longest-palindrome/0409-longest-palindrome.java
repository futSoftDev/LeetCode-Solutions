class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>ch=new HashSet<>();
        int len=0;
        for(char c:s.toCharArray()){
            if(ch.contains(c)){
                ch.remove(c);
                len+=2;
            }else{
                ch.add(c);
            }
        }
        if(!ch.isEmpty()){
            len+=1;
        }
        return len;
    }
}