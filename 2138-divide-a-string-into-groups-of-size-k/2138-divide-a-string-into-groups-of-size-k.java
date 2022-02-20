class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        List<String> res = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(i<n) {
            String temp = s.substring(i,Math.min(n,i+k));
            if(temp.length() != k) {
                StringBuilder sb = new StringBuilder();
                sb.append(temp);
                while(sb.length() != k) {
                    sb.append(fill);
                }
                temp = sb.toString();
            }
            res.add(temp);
            i+=k;
        }
        String[] ans = res.toArray(new String[0]);
        return ans;
    }
}