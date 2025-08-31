class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set=new HashSet<>();
       int longest=0;
       for(int n:nums){
        set.add(n);
       }
       for(int n:set){
        if(!set.contains(n-1)){
            int currentnum=n;
            int streak=1;
            while(set.contains(currentnum+1)){
                currentnum++;
                streak++;
            }
            longest=Math.max(longest,streak);
        }
       }
       return longest; 
    }
}
