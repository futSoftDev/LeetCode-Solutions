class Solution {
    public int maxScore(int[] cardsPoints, int k) {
        int n=cardsPoints.length;
        int total=0;
        for(int i=0; i<k; i++){
            total+=cardsPoints[i];
        }
        int maxPoints=total;
        for(int i=0;i<k ;i++){
            total-=cardsPoints[k-1-i];
            total+=cardsPoints[n-1-i];
            maxPoints=Math.max(maxPoints,total);
        }
        return maxPoints;
    }
}