class Solution {
    int[] memo;
    public int lengthOfLIS(int[] nums) {
        memo=new int[nums.length];
        Arrays.fill(memo,1);

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(memo[j]+1>memo[i]){
                        memo[i]=memo[j]+1;
                    }
                }
            }
        }

        int max=1;
        for(int m:memo){
            if(m>max){
                max=m;
            }
        }
        return max;
    }
}
