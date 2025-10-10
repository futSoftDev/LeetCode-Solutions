class Solution {
    public boolean isHappy(int n) {
          int slow = n;
        int fast = n;
        
        // Move pointers at least once, then check condition
        slow = square(slow);
        fast = square(square(fast));
        
        while (slow != fast) {
            slow = square(slow);
            fast = square(square(fast));
        }
        
        return slow == 1;
    }
    
    public int square(int num) {
        int ans = 0;
        while (num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
}