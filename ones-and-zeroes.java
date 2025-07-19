class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] memo=new int[m+1][n+1];
        for(String s:strs){
            int zeros=0,ones=0;
            for(char ch:s.toCharArray()){
                if(ch=='0'){
                    zeros++;
                }
                else{
                    ones++;
                }
            }

            for(int i=m;i>=zeros;i--){
                for(int j=n;j>=ones;j--){
                    if(zeros<=m && ones<=n){
                        memo[i][j]=Math.max(memo[i][j],memo[i-zeros][j-ones]+1);
                    }
                }
            }
        }
        return memo[m][n];
    }
}
