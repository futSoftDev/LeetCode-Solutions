class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=t.length();
        int i=0;
        int j=0;
        String ans="";
        while(j<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)>=0)count--;
            }
            while(count ==0){
                String sb=s.substring(i,j+1);
                if(ans.equals("")|| sb.length()<ans.length()){
                    ans=sb;
                }
                char left=s.charAt(i);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0) count++;
                }
                i++;
            }
            j++;
        }
        return ans ;
    }
}