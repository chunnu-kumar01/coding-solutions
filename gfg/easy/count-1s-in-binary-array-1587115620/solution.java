class Solution {
	public int countOnes(int[] arr) {
		// code here
		
		int l = 0;
		int r = arr.length - 1;
		int ans = r + 1;
		
		while (l <= r) {
			int mid = l + (r - l)/2;
			
			if (arr[mid] == 1) {
				l = mid + 1;
			}
			else {
				ans = mid;
				r = mid - 1;
			}
		}
		
		return ans;
	}
}
