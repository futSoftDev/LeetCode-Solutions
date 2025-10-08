class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                counter++;
            }else if(s.charAt(i)==')'){
                counter--;
            }
            maxCount=Math.max(counter, maxCount);
            
        }
        return maxCount;
    }
}