class Solution {
    Boolean[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new Boolean[s.length()];
        return dfs(s,wordDict,0);
    }
    private boolean dfs(String s,List<String> wordDict,int i){
        if(i==s.length()){
            return true;
        }

        if(memo[i]!=null){
            return memo[i];
        }

        for(String w:wordDict){
            if(i+w.length()<=s.length() && (s.substring(i,i+w.length())).equals(w)){
                if(dfs(s,wordDict,i+w.length())){
                   memo[i]= true;
                   return memo[i];
                   //return memo[i]=true; could be written like this too instead of two lines
                }
            }
        }
        memo[i]=false;
        return memo[i];
        //return memo[i]=false; could be written like this instead of two lines
    }
}
