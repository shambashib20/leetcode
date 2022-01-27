class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie root = new Trie();
        int ans = 0, max = 0, depth = 0; //depth of trie 
        for (int n : nums) max = Math.max(n, max);
        for (;max > 0; max >>= 1) depth++; //depth = max num binary string length

        for (int n : nums){
            int sum = 0;
            Trie cur = root, tmp = cur; //cur for adding n into Trie, tmp for finding the max path
            for (int i = depth - 1; i >= 0; i--){
                sum <<= 1;
                int d = (n & (1 << i)) > 0? 1 : 0; //start checking from left end. 1 if positive, 0 if 0.
                if (cur.nodes[d] == null) cur.nodes[d] = new Trie();
                if (tmp.nodes[1 - d] != null) sum++; //always choose the opposite path if they exist
                cur = cur.nodes[d];
                tmp = sum % 2 == 0? tmp.nodes[d] : tmp.nodes[1 - d];
            }

            ans = Math.max(sum, ans);
        }

        return ans;
    }

    private class Trie{
        Trie[] nodes;
        Trie(){
            nodes = new Trie[2];
        }
    }
}