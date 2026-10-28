class Solution {
	// Function to search for a character in the string
	public int searchCharacter(String s, char ch) {
		// code here
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
		
	}
}
