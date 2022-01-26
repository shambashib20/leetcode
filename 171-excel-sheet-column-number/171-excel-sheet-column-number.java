class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int n = columnTitle.length();
        for (int i=n-1;i>=0;--i){
            int t1 = getIntValue(columnTitle.charAt(i));
            int t2 = power(26, n-i-1);
            res += t1 * t2;
            
        }
        return res;
    }
    int getIntValue(char c){
        return c - 'A' + 1;
    }
    int power(int number, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return number;
        else 
            return number * power(number, exponent-1);
    }
}