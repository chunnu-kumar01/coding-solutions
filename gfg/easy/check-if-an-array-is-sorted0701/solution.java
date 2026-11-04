class Solution {
	public boolean isSorted(int[] arr) {
		// check ascending order
		int n=arr.length;
		boolean asd = true;
		
		for (int i = 0; i<n-1; i++) {
			if (arr[i]>arr[i + 1]) {
				asd = false;
				break;
			}
		}
		
		boolean dsd = true;
		
		for (int i = 0; i<n-1; i++) {
			if (arr[i]<arr[i + 1]) {
				dsd = false;
				break;
			}
		}
		
		return asd || dsd;
	}
}
