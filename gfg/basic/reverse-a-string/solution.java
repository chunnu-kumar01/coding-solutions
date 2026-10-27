class Solution {
	public static String reverseString(String s) {
		// code here
		
		// StringBuilder sb= new StringBuilder(s);
		
		// sb.reverse();
		// return sb.toString();
		char[] arr = s.toCharArray();
		
		
		int st = 0;
		int ed = arr.length-1;
		
		while (st<ed) {
			char temp = arr[st];
			arr[st] = arr[ed];
			arr[ed] = temp;
			st++;
			ed--;
		}
		
		return new String(arr);
	}
}
