class Solution {
    Set<List<Integer>> perm=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        helper(nums,0);
        for(List<Integer> i:perm){
            result.add(i);
        }
        return result;
    }
    void helper(int[] nums,int start){
        if(start==nums.length-1){
            List<Integer> current=new ArrayList<>();
            for(int i:nums){
                current.add(i);
            }
            perm.add(current);
            return;
        }
        for(int i=start;i<nums.length;i++){
        swap(start,i,nums);
        helper(nums,start+1);
        swap(start,i,nums);
        }
    }
    void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
