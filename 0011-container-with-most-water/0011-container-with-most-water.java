class Solution {
    public int maxArea(int[] height) {
        int container=0;
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            container = Math.min(height[i],height[j])*(j-i);
            max= Math.max(max,container);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
            
        }
        return max; 
    }
}