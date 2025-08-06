class Solution {
    int[] memo;
    public int combinationSum4(int[] nums, int target) {
        memo=new int[target+1];
        Arrays.fill(memo,-1);
        return combiMemo(nums,target);
    }
    private int combiMemo(int[] nums,int target){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }

        if(memo[target]!=-1){
            return memo[target];
        }

        int result=0;
        for(int n:nums){
            result+=combiMemo(nums,target-n);
        }
        memo[target]=result;
        return memo[target];
    }
}
