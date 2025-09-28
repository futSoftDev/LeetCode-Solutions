class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int streak=0;
        for( int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currStreak=1;
            
            while(set.contains(currentNum+1)){
                currentNum++;
                currStreak++;
            }
             streak=Math.max(streak,currStreak);
            }
           
        }
        return streak;
    }
}