class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
        
            if(k>0){
              a=nums[i];
               k--;
                }

            
        }
        return a;
    }
}