class Solution {
    public int[] singleNumber(int[] nums) {
        int xorOfAll=0;
        for(int num:nums){
            xorOfAll^=num;
        }
        xorOfAll &=-xorOfAll;

int[] result = {0,0};
        for(int num:nums){
            if((num & xorOfAll)==0){
                result[0]^=num;
            }
            else{
                result[1]^=num;
            }
        }
        return result;
    }
}
