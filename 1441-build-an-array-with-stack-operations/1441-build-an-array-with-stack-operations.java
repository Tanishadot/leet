class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> result= new ArrayList<>();
        for(int i=1;i<=n;i++){
            int a=0;
            result.add("Push");
            for(int j=0;j<target.length;j++){
                if (target[j]==i){
                    a+=1;
                }

            }
            if(a!=1){
                result.add("Pop");
            }
            if(i==target[target.length-1]){
                break;
            }
        }
        return result;
            
        
    }
}