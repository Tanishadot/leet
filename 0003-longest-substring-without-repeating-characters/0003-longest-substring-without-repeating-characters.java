class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int curr=0;
        int max=1;
        if(s.length()==0){
            return 0;
        }
        HashSet<Character> hs= new HashSet<>();
        for(int right =0;right<s.length();right++){
            char c= s.charAt(right);
            while(hs.contains(c)){
                hs.remove(s.charAt(left));
                
                left++;
            }
            hs.add(c);
            curr=hs.size();
            max= Math.max(max,curr);
        }
        
        return max;
    }
}