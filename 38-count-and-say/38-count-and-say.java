public class Solution {
	public String countAndSay(int n) {
		if(n==1) return "1";     //note that the sequence is one-based, not zero-based
		String s = countAndSay(n-1);    
		StringBuffer sb = new StringBuffer();   
		
		while(s.length()>0) {
			int index = 0;
			char c = s.charAt(index);   //get the first digit
			while(index+1<s.length() && s.charAt(index+1)==c) 
				index++;    //count how many c's we got, that'd be index+1
			sb.append(String.valueOf(index+1)+c);   //append the number of c's and c to sb
			s = s.substring(index+1);     //cut all the c's off s
        }
		return sb.toString();
	}
}