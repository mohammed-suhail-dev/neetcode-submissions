class Solution {
    public boolean isPalindrome(String s) {
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		//String cleaned1=cleaned.toLowerCase();
		String rev="";
		
		for(int i=cleaned.length()-1;i>=0;i--) {
			char c=cleaned.charAt(i);
			rev=rev+c;
		}
		
		return cleaned.equals(rev);
        
    }
}
