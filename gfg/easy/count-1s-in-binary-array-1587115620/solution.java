class Solution {
	public int countOnes(int[] arr) {
		// code here
		int n = arr.length;
		
		int ans = 0;
		
		for (int x:arr) {
			if (x == 1) {
				ans++;
			}
			
		}
		return ans;
	}
}