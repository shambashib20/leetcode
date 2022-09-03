class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int i = 0;
        int j = 0;
        int ans=  0;
        int[] visited = new int [226];
        while(j < n){
            
            if(visited[s.charAt(j)] > 0){
                while(i < n){
                    if(s.charAt(i) == s.charAt(j)){
                        i++;
                        break;
                    }
                    visited[s.charAt(i)]--;
                    i++;
                }
            }else{
                
                ans = Math.max(ans,j-i+1);
                visited[s.charAt(j)]++;
                
            }
            j++;
        }
        
        return ans;
        
        
    }
}