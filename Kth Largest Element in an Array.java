class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pkueue=new PriorityQueue<>();

        for(int i:nums){
            pkueue.add(i);
            if(pkueue.size()>k){
                pkueue.poll();
            }
        }
        return pkueue.peek();
    }
}
