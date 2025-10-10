class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        if(t1.length()<t2.length()){
            String temp=t1;
            t1=t2;
            t2=temp;
        }
        int[] memo=new int[t2.length()+1];

        for(int i=t1.length()-1;i>=0;i--){
            int prev=0;
            for(int j=t2.length()-1;j>=0;j--){
                int temp=memo[j];
                if(t1.charAt(i)==t2.charAt(j)){
                    memo[j]=1+prev;
                }
                else{
                    memo[j]=Math.max(memo[j],memo[j+1]);
                }
                prev=temp;
            }
        }
        return memo[0];
    }
}
