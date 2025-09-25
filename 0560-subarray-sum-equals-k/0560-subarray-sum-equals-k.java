class Solution {
    public int subarraySum(int[] nums, int k) {
        int total=0;
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int n:nums){
            total+=n;
            if(map.containsKey(total-k)){
                count+=map.get(total-k);
            }
            map.put(total,map.getOrDefault(total,0)+1);
        }
        return count;
    }
}