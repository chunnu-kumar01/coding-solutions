class Solution {
	public static int findSum(String s) {
		int sum = 0;
		int i = 0;
		int n = s.length();
		
		while (i < n) {
			char ch = s.charAt(i);
			
			if (ch >= '0' && ch <= '9') {
				int num = 0;
				
				while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					num = num * 10 + (s.charAt(i) - '0');
					i++;
				}
				
				sum += num;
			} else {
				i++;
			}
		}
		
		return sum;
	}
}
