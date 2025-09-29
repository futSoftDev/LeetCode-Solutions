class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=-n;
            x=1/x;
        }
        double power=1;
        while(n!=0){
            if(n%2!=0){
                power*=x;
            }
            x*=x;
            n=n/2;
        }
        return power;
    }
}