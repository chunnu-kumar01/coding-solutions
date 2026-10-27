class Solution {
	public String convertToCamelCase(String s) {
		// code here
		
		StringBuilder st = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++)
			{
			char ch = s.charAt(i);
			if (ch == ' ') {
				
				continue;
			}
			
			if (i != 0 && s.charAt(i - 1) == ' ') {
				st.append(Character .toUpperCase(ch));
			}
			
			else {
				st.append(ch);
			}
		}
		return st.toString();
		
	}
}
