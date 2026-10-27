class Solution {
	public int countWords(String s) {
		// code here
		
		int count = 0;
		
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ' || ch == '\n' || ch == '\t')
				continue;
				
			if (i == 0 || s.charAt(i - 1) == ' ' || s. charAt(i - 1) == '\n' || s.charAt(i - 1) == '\t')
				count++;
		}
		return count;
	}
}
