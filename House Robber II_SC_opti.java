class Solution {
    public int rob(int[] nums) {
    return Math.max(nums[0],
           Math.max(robb(Arrays.copyOfRange(nums,0,nums.length-1)),
    robb(Arrays.copyOfRange(nums,1,nums.length))));
    }
    private int robb(int[] nums){
        int rob1=0; int rob2=0;
        for(int n:nums){
            int nrob=Math.max(rob1+n,rob2);
            rob1=rob2;
            rob2=nrob;
        }
        return rob2;
    }
}
