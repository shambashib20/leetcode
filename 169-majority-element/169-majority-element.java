class Solution {
    public int majorityElement(int[] nums) {
        int c=-1; // keep a count to keep freq of element
        int maj = -1; // stores the potential majority
        for(int n : nums)
        {
            if(c<=0) // if freq becomes zero consider the curr element as majority
            {
                maj = n;
                c=1;
                continue;
            }
            if(n==maj) c++; // if n is same as what we assumed majority
            else c--; // if n is different to what we assumed as majority
        }
        return maj;
    }
}