class Solution {
    int[][]memo;
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        memo=new int[nums.length+1][2];
        for(int i[]:memo){
            Arrays.fill(i,-1);
        }
        return Math.max(robMemo(nums,0,nums.length-2,0),robMemo(nums,1,nums.length-1,1));
    }
    public int robMemo(int[] nums,int start,int n,int idx){
        if(n<start){
            return 0;
        }
        if(n==start){
            return memo[n][idx]=nums[start];
        }
        if(memo[n][idx]!=-1){
            return memo[n][idx];
        }
        int inc=nums[n]+robMemo(nums,start,n-2,idx);
        int exc=robMemo(nums,start,n-1,idx);
        memo[n][idx]= Math.max(inc,exc);
        return memo[n][idx];
    }
}
