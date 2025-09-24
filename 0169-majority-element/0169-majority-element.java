class Solution {
    public int majorityElement(int[] nums) {
      
       HashMap<Integer, Integer>map=new HashMap<>();
        int res=0;
       int freq=0;
       for(int it:nums){
        map.put(it,1+map.getOrDefault(it,0));
        if(map.get(it)>freq){
            res=it;
            freq=map.get(it);
        }
       }
       return res;
    }
}