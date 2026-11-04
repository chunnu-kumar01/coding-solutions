class Solution {
	public static int largest(int[] arr) {
		
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i<n; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}
}
