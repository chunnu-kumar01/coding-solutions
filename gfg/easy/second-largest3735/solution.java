class Solution {
	public int getSecondLargest(int[] arr) {
		// code here
		
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		
		int Sec_lar = 0;
		
		for (int i = 0; i<n; i++) {
			if (arr[i]>max) {
				Sec_lar = max;
				max = arr[i];
			}
			
			else if (max>arr[i] && Sec_lar<arr[i]) {
				
				Sec_lar = arr[i];
			}
			
		}
		
		if (Sec_lar == Integer.MIN_VALUE) {
			return - 1;
		}
		
		return Sec_lar;
		
	}
}
