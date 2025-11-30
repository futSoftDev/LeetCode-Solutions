// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//     //     int n=g.length;
//     //     int m=s.length;
//     //     int dp[][]=new int[n][m];
//     //     for(int []row:dp){
//     //         Arrays.fill(row,-1);
//     //     }
//     //     Arrays.sort(g);
//     //     Arrays.sort(s);
//     //     return fun(0,0,g,s,dp);
//     // }
//     //  private int fun(int i, int j, int []g, int []s, int [][]dp){
//     //     int n=g.length;
//     //     int m=s.length;
//     //     if(i>=n || j>=m) return 0;
//     //     if(dp[i][j]!=-1) return dp[i][j];
//     //     int res=0;
//     //     if(g[i]<=s[j]){
//     //         res=Math.max(res,1+fun(i+1, j+1, g, s, dp));
//     //     }
        
//     //     res=Math.max(res,fun(i,j+1,g,s,dp));
//     //     return dp[i][j]=res;
//     //  }


//     int n=g.length;
//     int m=s.length;
//     Arrays.sort(g);
//     Arrays.sort(s);
//     int [][]dp=new int[n+1][m+1];
//     for(int i=n-1; i>=0; i--){
//         for(int j=m-1; j>=0; j--){
//             int skip=dp[i][j+1];
//             int take=0;
//             if(g[i]<=s[j]){
//                  take=1+dp[i+1][j+1];
//             }
//             dp[i][j]=Math.max(skip,take);
//         }
//     }
//      return dp[0][0];
//     }
// }

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // children
        int j = 0; // cookies

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;    // child satisfied
                j++;    // cookie used
            } else {
                j++;    // cookie too small, try next
            }
        }
        return i;
    }
}
