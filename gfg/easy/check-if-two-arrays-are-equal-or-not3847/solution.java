class Solution {
	public boolean checkPermutation(int[] a, int[] b) {
		// code here
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		for (int i = 0; i<b.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
}
