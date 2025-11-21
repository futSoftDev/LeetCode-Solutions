class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer>map=new HashMap<>();
        map.put(0,1);
        int res=0;
        int oddCount=0;
        for(int num:nums){
            if(num%2 ==1) oddCount++;
            if(map.containsKey(oddCount-k)){
                res+=map.get(oddCount-k);
            }
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return res;
    }
}