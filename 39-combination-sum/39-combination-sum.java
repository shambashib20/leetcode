class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0, new ArrayList<Integer>());
        return res;
    }
    List<List<Integer>> res = new ArrayList<>();
    private void helper(int[] cands, int target, int stIdx, List<Integer> curList) {
        if (target == 0) res.add(curList);
        
        for (int i = stIdx; i < cands.length; i++) {
            if (cands[i] <= target) {
                List<Integer> list = new ArrayList<>(curList);
                list.add(cands[i]);
                helper(cands, target - cands[i], i, list);
            }
        }
    }
}