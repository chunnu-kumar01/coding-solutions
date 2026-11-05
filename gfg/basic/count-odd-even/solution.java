class Solution {
	public int[] countOddEven(int[] arr) {
		// Code here
		
		int n = arr.length;
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i<n; i++) {
			if (arr[i]% 2 != 0) {
				oddCount++;
			}
			else {
				evenCount++;
			}
			
		}
		
		return new int[]{oddCount, evenCount};
		
	}
}
