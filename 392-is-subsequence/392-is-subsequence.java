class Solution {
    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s, t, s.length() - 1 , t.length() - 1);
    }

    private boolean isSubsequence(String s, String t, int m, int n){
		// BASE CASE[ IF WE HAVE COMPLETED OUR S STRING THEN WE HAVE A SUBSEQUENCE ELSE NO]
        if(m < 0) return true;
        if(n < 0) return false;
        if(s.charAt(m) == t.charAt(n)) return isSubsequence(s, t, m - 1, n - 1);
        
        return isSubsequence(s, t, m, n - 1);
    }
}