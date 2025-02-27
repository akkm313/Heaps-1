//Space complexity O(k)
// Time complexity O(nlogk) where n is the size of the array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for( int  i:nums)
        {
            q.add(i);
            if(q.size()>k)
                q.poll();
        }
        return q.poll();
        
    }
}