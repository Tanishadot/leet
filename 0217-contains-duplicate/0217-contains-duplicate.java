class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        boolean a = false;
        for (int i =0 ;i<nums.length;i++){
            if(hs.contains(nums[i])){
                a=true;
            }
            else{
                hs.add(nums[i]);
            }
        }
        return a;
    }
}